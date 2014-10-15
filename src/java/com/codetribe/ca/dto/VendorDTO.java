/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Vendor;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class VendorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer vendorID;
    private String vendorName;
    private List<BusinessvendorDTO> businessvendorList;
    private List<VendorcityDTO> vendorcityList;

    public VendorDTO() {
    }

    public VendorDTO(Vendor v) {
        vendorID = v.getVendorID();
        vendorName = v.getVendorName();

    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public List<BusinessvendorDTO> getBusinessvendorList() {
        return businessvendorList;
    }

    public void setBusinessvendorList(List<BusinessvendorDTO> businessvendorList) {
        this.businessvendorList = businessvendorList;
    }

    public List<VendorcityDTO> getVendorcityList() {
        return vendorcityList;
    }

    public void setVendorcityList(List<VendorcityDTO> vendorcityList) {
        this.vendorcityList = vendorcityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorID != null ? vendorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorDTO)) {
            return false;
        }
        VendorDTO other = (VendorDTO) object;
        if ((this.vendorID == null && other.vendorID != null) || (this.vendorID != null && !this.vendorID.equals(other.vendorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Vendor[ vendorID=" + vendorID + " ]";
    }

}
