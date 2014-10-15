/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Business;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class BusinessDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer businessID;
    private String name;
    private String description;
    private double longitude;
    private double lattitude;
    private List<TownshipbusinessDTO> townshipBusinessList;
    private List<BusinessvendorDTO> businessVendorList;

    public BusinessDTO(Business b) {
        businessID = b.getBusinessID();
        name = b.getName();
        description = b.getDescription();
        lattitude = b.getLattitude();
        longitude = b.getLongitude();

    }

    public BusinessDTO() {
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public List<TownshipbusinessDTO> getTownshipBusinessList() {
        return townshipBusinessList;
    }

    public void setTownshipBusinessList(List<TownshipbusinessDTO> townshipBusinessList) {
        this.townshipBusinessList = townshipBusinessList;
    }

    public List<BusinessvendorDTO> getBusinessVendorList() {
        return businessVendorList;
    }

    public void setBusinessVendorList(List<BusinessvendorDTO> businessVendorList) {
        this.businessVendorList = businessVendorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessID != null ? businessID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessDTO)) {
            return false;
        }
        BusinessDTO other = (BusinessDTO) object;
        if ((this.businessID == null && other.businessID != null) || (this.businessID != null && !this.businessID.equals(other.businessID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Business[ businessID=" + businessID + " ]";
    }

}
