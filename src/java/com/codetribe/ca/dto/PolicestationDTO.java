/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Policestation;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class PolicestationDTO {

    private static final long serialVersionUID = 1L;

    private Integer policeStationID;
    private String name;
    private double lattitude;
    private double longitude;
    private List<TownshippolicestationDTO> townshippolicestationList;
    private List<StationofficerDTO> stationofficerList;

    public PolicestationDTO() {
    }

    public PolicestationDTO(Policestation ps) {
        policeStationID = ps.getPoliceStationID();
        name = ps.getName();
        lattitude = ps.getLattitude();
        longitude = ps.getLongitude();

    }

    public Integer getPoliceStationID() {
        return policeStationID;
    }

    public void setPoliceStationID(Integer policeStationID) {
        this.policeStationID = policeStationID;
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

    public List<TownshippolicestationDTO> getTownshippolicestationList() {
        return townshippolicestationList;
    }

    public void setTownshippolicestationList(List<TownshippolicestationDTO> townshippolicestationList) {
        this.townshippolicestationList = townshippolicestationList;
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
        hash += (policeStationID != null ? policeStationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolicestationDTO)) {
            return false;
        }
        PolicestationDTO other = (PolicestationDTO) object;
        if ((this.policeStationID == null && other.policeStationID != null) || (this.policeStationID != null && !this.policeStationID.equals(other.policeStationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Policestation[ policeStationID=" + policeStationID + " ]";
    }
}
