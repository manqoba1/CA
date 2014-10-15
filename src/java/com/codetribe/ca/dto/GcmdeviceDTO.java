/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.*;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class GcmdeviceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer gcmdeviceID;
    private String registrationID;
    private int messageCount;
    private long dateRegistered;
    private String model;
    private String serialNumber;

    public GcmdeviceDTO() {
    }

    public GcmdeviceDTO(Gcmdevice g) {

    }

    public Integer getGcmdeviceID() {
        return gcmdeviceID;
    }

    public void setGcmdeviceID(Integer gcmdeviceID) {
        this.gcmdeviceID = gcmdeviceID;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gcmdeviceID != null ? gcmdeviceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GcmdeviceDTO)) {
            return false;
        }
        GcmdeviceDTO other = (GcmdeviceDTO) object;
        if ((this.gcmdeviceID == null && other.gcmdeviceID != null) || (this.gcmdeviceID != null && !this.gcmdeviceID.equals(other.gcmdeviceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Gcmdevice[ gcmdeviceID=" + gcmdeviceID + " ]";
    }

}
