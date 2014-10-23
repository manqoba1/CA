/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.socket;

import com.codetribe.ca.dto.transfer.RequestDTO;
import com.codetribe.ca.dto.transfer.ResponseDTO;
import com.codetribe.ca.util.DataException;
import com.codetribe.ca.util.DataUtil;
import com.codetribe.ca.util.GZipUtility;
import com.codetribe.ca.util.ListUtil;
import com.codetribe.ca.util.TrafficCop;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author CodeTribe1
 */
@ServerEndpoint("/register")
@Stateful
public class WebsocketAddUtil {

    @EJB
    DataUtil dataUtil;
    @EJB
    ListUtil listUtil;
    static final Logger log = Logger.getLogger(WebsocketAddUtil.class.getSimpleName());
    Gson gson = new Gson();
    public static final Set<Session> peers
            = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen
    public void onOpen(Session session) {
        peers.add(session);
        try {
            ResponseDTO r = new ResponseDTO();
            r.setSessionID(session.getId());
            r.setStatusCode(0);
            session.getBasicRemote().sendText(gson.toJson(r));
            log.log(Level.WARNING, "onOpen...sent session id: {0}", session.getId());
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Failed to send websocket sessionID", ex);
        }
    }

    @OnMessage
    public ByteBuffer onMessage(String message) {
        log.log(Level.WARNING, "onMessage: {0}", message);
        ResponseDTO resp = new ResponseDTO();
        ByteBuffer bb = null;
        try {

            try {
                RequestDTO dto = gson.fromJson(message, RequestDTO.class);
                resp = TrafficCop.processRequest(dto, dataUtil, listUtil);

            } catch (DataException e) {
                resp.setStatusCode(101);
                resp.setMessage("Data service failed to process your request");
                log.log(Level.SEVERE, "Database related failure", e);
                bb = GZipUtility.getZippedResponse(resp);

            }
            log.log(Level.WARNING, "Buffer capacity Before Zipping: {0}", ByteBuffer.wrap(gson.toJson(resp).getBytes()).capacity());
            bb = GZipUtility.getZippedResponse(resp);
            log.log(Level.WARNING, "Buffer capacity After Zipping: {0}", bb.capacity());
        } catch (IOException ex) {
            Logger.getLogger(WebsocketAddUtil.class.getName()).log(Level.SEVERE, null, ex);
            resp.setStatusCode(111);
            resp.setMessage("Problem processing request on server");
            try {
                bb = GZipUtility.getZippedResponse(resp);
            } catch (IOException ex1) {
                Logger.getLogger(WebsocketAddUtil.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return bb;
    }

    @OnClose
    public void onClose(Session session) {
        log.log(Level.WARNING, "onClose - remove session: {0}", session.getId());
        for (Session mSession : peers) {
            if (session.getId().equalsIgnoreCase(mSession.getId())) {
                peers.remove(mSession);
                break;
            }

        }
    }

    @OnError
    public void onError(Session session, Throwable t) {
        log.log(Level.SEVERE, null, t);
    }
}
