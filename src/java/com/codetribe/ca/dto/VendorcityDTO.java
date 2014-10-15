/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.City;
import com.codetribe.ca.data.Vendor;
import com.codetribe.ca.data.Vendorcity;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class VendorcityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer vendorCityID;
    private double lattitude;
    private double longitude;
    private CityDTO city;
    private VendorDTO vendor;

    public VendorcityDTO() {
    }

    public VendorcityDTO(Vendorcity vc) {
        vendorCityID = vc.getVendorCityID();
        lattitude = vc.getLattitude();
        longitude = vc.getLongitude();
        City c = vc.getCity();
        if (c != null) {
            city = new CityDTO(c);
        }
        Vendor v = vc.getVendor();
        if (v != null) {
            vendor = new VendorDTO(v);
        }
    }

    public Integer getVendorCityID() {
        return vendorCityID;
    }

    public void setVendorCityID(Integer vendorCityID) {
        this.vendorCityID = vendorCityID;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public VendorDTO getVendor() {
        return vendor;
    }

    public void setVendor(VendorDTO vendor) {
        this.vendor = vendor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorCityID != null ? vendorCityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorcityDTO)) {
            return false;
        }
        VendorcityDTO other = (VendorcityDTO) object;
        if ((this.vendorCityID == null && other.vendorCityID != null) || (this.vendorCityID != null && !this.vendorCityID.equals(other.vendorCityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Vendorcity[ vendorCityID=" + vendorCityID + " ]";
    }
}
