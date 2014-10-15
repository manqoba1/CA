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
public class RequestDTO implements Serializable{
    private Integer requestType;
    
    

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }
    
    
}
