/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "gcmdevice")
@NamedQueries({
    @NamedQuery(name = "Gcmdevice.findAll", query = "SELECT g FROM Gcmdevice g"),
    @NamedQuery(name = "Gcmdevice.findByGcmdeviceID", query = "SELECT g FROM Gcmdevice g WHERE g.gcmdeviceID = :gcmdeviceID"),
    @NamedQuery(name = "Gcmdevice.findByMessageCount", query = "SELECT g FROM Gcmdevice g WHERE g.messageCount = :messageCount"),
    @NamedQuery(name = "Gcmdevice.findByDateRegistered", query = "SELECT g FROM Gcmdevice g WHERE g.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Gcmdevice.findByModel", query = "SELECT g FROM Gcmdevice g WHERE g.model = :model"),
    @NamedQuery(name = "Gcmdevice.findBySerialNumber", query = "SELECT g FROM Gcmdevice g WHERE g.serialNumber = :serialNumber")})
public class Gcmdevice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gcmdeviceID")
    private Integer gcmdeviceID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "registrationID")
    private String registrationID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "messageCount")
    private int messageCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "serialNumber")
    private String serialNumber;

    public Gcmdevice() {
    }

    public Gcmdevice(Integer gcmdeviceID) {
        this.gcmdeviceID = gcmdeviceID;
    }

    public Gcmdevice(Integer gcmdeviceID, String registrationID, int messageCount, Date dateRegistered, String model, String serialNumber) {
        this.gcmdeviceID = gcmdeviceID;
        this.registrationID = registrationID;
        this.messageCount = messageCount;
        this.dateRegistered = dateRegistered;
        this.model = model;
        this.serialNumber = serialNumber;
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

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
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
        if (!(object instanceof Gcmdevice)) {
            return false;
        }
        Gcmdevice other = (Gcmdevice) object;
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
