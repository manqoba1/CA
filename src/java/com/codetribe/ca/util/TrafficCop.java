/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.util;

import com.codetribe.ca.dto.transfer.RequestDTO;
import com.codetribe.ca.dto.transfer.ResponseDTO;

/**
 *
 * @author aubreyM
 */
public class TrafficCop {

    public static ResponseDTO processRequest(RequestDTO req, DataUtil dataUtil, ListUtil listUtil) throws DataException {
        ResponseDTO r = new ResponseDTO();
        switch (req.getRequestType()) {
            case RequestDTO.REGISTER_CITIZEN:
                r = dataUtil.registerCitizen(req.getCitizen(), listUtil);
                break;
            case RequestDTO.GET_TOWNSHIPS:
                r = listUtil.getTownshipData(req.getTownshipID());
                break;
        }
        if (r.getStatusCode() == null) {
            r.setStatusCode(0);
        }
        return r;
    }
}
