/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto.transfer;

import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class ResponseDTO implements Serializable {

    private Integer statusCode;
    private String message, sessionID, GCMRegistrationID;

    //erros
    public static final int OK = 0;
    public static final int SERVER_ERROR = 404;
    public static final int DATABASE_ERROR = 403;
    public static final int DATA_NOT_FOUND = 401;
    public static final int UNKNOWN_REQUEST = 400;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getGCMRegistrationID() {
        return GCMRegistrationID;
    }

    public void setGCMRegistrationID(String GCMRegistrationID) {
        this.GCMRegistrationID = GCMRegistrationID;
    }

}
