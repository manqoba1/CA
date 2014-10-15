/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Policeofficer;
import com.codetribe.ca.data.Policestation;
import com.codetribe.ca.data.Stationofficer;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class StationofficerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stationOfficerID;
    private long dateAssigned;
    private PolicestationDTO policeStation;
    private PoliceofficerDTO policeOfficer;

    public StationofficerDTO() {
    }

    public StationofficerDTO(Stationofficer so) {
        stationOfficerID = so.getStationOfficerID();
        dateAssigned = so.getDateAssigned().getTime();
        Policeofficer p = so.getPoliceOfficer();
        if (p != null) {
            policeOfficer = new PoliceofficerDTO(p);
        }
        Policestation ps = so.getPoliceStation();
        if (ps != null) {
            policeStation = new PolicestationDTO(ps);
        }
    }

    public Integer getStationOfficerID() {
        return stationOfficerID;
    }

    public void setStationOfficerID(Integer stationOfficerID) {
        this.stationOfficerID = stationOfficerID;
    }

    public long getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(long dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public PolicestationDTO getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PolicestationDTO policeStation) {
        this.policeStation = policeStation;
    }

    public PoliceofficerDTO getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(PoliceofficerDTO policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationOfficerID != null ? stationOfficerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StationofficerDTO)) {
            return false;
        }
        StationofficerDTO other = (StationofficerDTO) object;
        if ((this.stationOfficerID == null && other.stationOfficerID != null) || (this.stationOfficerID != null && !this.stationOfficerID.equals(other.stationOfficerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Stationofficer[ stationOfficerID=" + stationOfficerID + " ]";
    }

}
