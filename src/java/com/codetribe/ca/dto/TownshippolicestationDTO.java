/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codetribe.ca.dto;

import com.codetribe.ca.data.Policestation;
import com.codetribe.ca.data.Township;
import com.codetribe.ca.data.Townshippolicestation;

/**
 *
 * @author CodeTribe1
 */
public class TownshippolicestationDTO {
    
    private static final long serialVersionUID = 1L;
    
    private Integer townshipPoliceStationID;
    private TownshipDTO township;
    private PolicestationDTO policeStation;
    
    public TownshippolicestationDTO() {
    }
    
    public TownshippolicestationDTO(Townshippolicestation tp) {
        townshipPoliceStationID = tp.getTownshipPoliceStationID();
        Township t = tp.getTownship();
        if (t != null) {
            township = new TownshipDTO(t);
        }
        Policestation p = tp.getPoliceStation();
        if (p != null) {
            policeStation = new PolicestationDTO(p);
        }
    }
    
    public Integer getTownshipPoliceStationID() {
        return townshipPoliceStationID;
    }
    
    public void setTownshipPoliceStationID(Integer townshipPoliceStationID) {
        this.townshipPoliceStationID = townshipPoliceStationID;
    }
    
    public TownshipDTO getTownship() {
        return township;
    }
    
    public void setTownship(TownshipDTO township) {
        this.township = township;
    }
    
    public PolicestationDTO getPoliceStation() {
        return policeStation;
    }
    
    public void setPoliceStation(PolicestationDTO policeStation) {
        this.policeStation = policeStation;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townshipPoliceStationID != null ? townshipPoliceStationID.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TownshippolicestationDTO)) {
            return false;
        }
        TownshippolicestationDTO other = (TownshippolicestationDTO) object;
        if ((this.townshipPoliceStationID == null && other.townshipPoliceStationID != null) || (this.townshipPoliceStationID != null && !this.townshipPoliceStationID.equals(other.townshipPoliceStationID))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.codetribe.ca.data.Townshippolicestation[ townshipPoliceStationID=" + townshipPoliceStationID + " ]";
    }
}
