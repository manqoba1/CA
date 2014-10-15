/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class PoliceofficerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer policeOfficerID;
    private String name;
    private String badgeNo;
    private List<StationofficerDTO> stationofficerList;

    public PoliceofficerDTO() {
    }

    public PoliceofficerDTO(Policeofficer p) {
        policeOfficerID = p.getPoliceOfficerID();
        name = p.getName();
        badgeNo = p.getBadgeNo();
    }

    public Integer getPoliceOfficerID() {
        return policeOfficerID;
    }

    public void setPoliceOfficerID(Integer policeOfficerID) {
        this.policeOfficerID = policeOfficerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(String badgeNo) {
        this.badgeNo = badgeNo;
    }

    public List<StationofficerDTO> getStationofficerList() {
        return stationofficerList;
    }

    public void setStationofficerList(List<StationofficerDTO> stationofficerList) {
        this.stationofficerList = stationofficerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policeOfficerID != null ? policeOfficerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoliceofficerDTO)) {
            return false;
        }
        PoliceofficerDTO other = (PoliceofficerDTO) object;
        if ((this.policeOfficerID == null && other.policeOfficerID != null) || (this.policeOfficerID != null && !this.policeOfficerID.equals(other.policeOfficerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Policeofficer[ policeOfficerID=" + policeOfficerID + " ]";
    }

}
