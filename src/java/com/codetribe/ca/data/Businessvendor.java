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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "businessvendor")
@NamedQueries({
    @NamedQuery(name = "Businessvendor.findAll", query = "SELECT b FROM Businessvendor b"),
    @NamedQuery(name = "Businessvendor.findByBusinessVendorID", query = "SELECT b FROM Businessvendor b WHERE b.businessVendorID = :businessVendorID"),
    @NamedQuery(name = "Businessvendor.findByDateRegistered", query = "SELECT b FROM Businessvendor b WHERE b.dateRegistered = :dateRegistered"),
    @NamedQuery(name = "Businessvendor.findByAccountNumber", query = "SELECT b FROM Businessvendor b WHERE b.accountNumber = :accountNumber")})
public class Businessvendor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "businessVendorID")
    private Integer businessVendorID;
    @Column(name = "dateRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "accountNumber")
    private String accountNumber;
    @JoinColumn(name = "vendorID", referencedColumnName = "vendorID")
    @ManyToOne(optional = false)
    private Vendor vendor;
    @JoinColumn(name = "businessID", referencedColumnName = "businessID")
    @ManyToOne(optional = false)
    private Business business;

    public Businessvendor() {
    }

    public Businessvendor(Integer businessVendorID) {
        this.businessVendorID = businessVendorID;
    }

    public Businessvendor(Integer businessVendorID, String accountNumber) {
        this.businessVendorID = businessVendorID;
        this.accountNumber = accountNumber;
    }

    public Integer getBusinessVendorID() {
        return businessVendorID;
    }

    public void setBusinessVendorID(Integer businessVendorID) {
        this.businessVendorID = businessVendorID;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessVendorID != null ? businessVendorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businessvendor)) {
            return false;
        }
        Businessvendor other = (Businessvendor) object;
        if ((this.businessVendorID == null && other.businessVendorID != null) || (this.businessVendorID != null && !this.businessVendorID.equals(other.businessVendorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Businessvendor[ businessVendorID=" + businessVendorID + " ]";
    }

}
