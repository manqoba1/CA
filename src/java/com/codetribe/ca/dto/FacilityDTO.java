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

public class FacilityDTO implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer facilityID;
    private String name;
    private double lattitude;
    private double longitude;
    private TownshipDTO township;

    public FacilityDTO() {
    }

    public FacilityDTO(Facility f) {
        facilityID = f.getFacilityID();
        name = f.getName();
        lattitude = f.getLattitude();
        longitude = f.getLongitude();
        township = new TownshipDTO(f.getTownship());
    }


    public Integer getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(Integer facilityID) {
        this.facilityID = facilityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public TownshipDTO getTownship() {
        return township;
    }

    public void setTownship(TownshipDTO township) {
        this.township = township;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityID != null ? facilityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacilityDTO)) {
            return false;
        }
        FacilityDTO other = (FacilityDTO) object;
        if ((this.facilityID == null && other.facilityID != null) || (this.facilityID != null && !this.facilityID.equals(other.facilityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Facility[ facilityID=" + facilityID + " ]";
    }

}
