/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Business;
import com.codetribe.ca.data.Businessvendor;
import com.codetribe.ca.data.Vendor;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class BusinessvendorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer businessVendorID;
    private long dateRegistered;
    private String accountNumber;
    private VendorDTO vendor;
    private BusinessDTO business;

    public BusinessvendorDTO() {
    }

    public BusinessvendorDTO(Businessvendor bv) {
        businessVendorID = bv.getBusinessVendorID();
        dateRegistered = bv.getDateRegistered().getTime();
        accountNumber = bv.getAccountNumber();
        Vendor v = bv.getVendor();
        if (v != null) {
            vendor = new VendorDTO(v);
        }
        Business b = bv.getBusiness();
        if (b != null) {
            business = new BusinessDTO(b);
        }
    }

    public Integer getBusinessVendorID() {
        return businessVendorID;
    }

    public void setBusinessVendorID(Integer businessVendorID) {
        this.businessVendorID = businessVendorID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(long dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public VendorDTO getVendor() {
        return vendor;
    }

    public void setVendor(VendorDTO vendor) {
        this.vendor = vendor;
    }

    public BusinessDTO getBusiness() {
        return business;
    }

    public void setBusiness(BusinessDTO business) {
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
        if (!(object instanceof BusinessvendorDTO)) {
            return false;
        }
        BusinessvendorDTO other = (BusinessvendorDTO) object;
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
