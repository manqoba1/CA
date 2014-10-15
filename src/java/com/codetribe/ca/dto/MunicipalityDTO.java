/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Municipality;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class MunicipalityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer municipalityID;
    private String municipalityName;
    private List<ExecutiveDTO> executiveList;
    private List<TownshipDTO> townshipList;

    public MunicipalityDTO() {
    }

    public MunicipalityDTO(Municipality m) {
        municipalityID = m.getMunicipalityID();
        municipalityName = m.getMunicipalityName();
    }

    public Integer getMunicipalityID() {
        return municipalityID;
    }

    public void setMunicipalityID(Integer municipalityID) {
        this.municipalityID = municipalityID;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    public List<ExecutiveDTO> getExecutiveList() {
        return executiveList;
    }

    public void setExecutiveList(List<ExecutiveDTO> executiveList) {
        this.executiveList = executiveList;
    }

    public List<TownshipDTO> getTownshipList() {
        return townshipList;
    }

    public void setTownshipList(List<TownshipDTO> townshipList) {
        this.townshipList = townshipList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (municipalityID != null ? municipalityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MunicipalityDTO)) {
            return false;
        }
        MunicipalityDTO other = (MunicipalityDTO) object;
        if ((this.municipalityID == null && other.municipalityID != null) || (this.municipalityID != null && !this.municipalityID.equals(other.municipalityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Municipality[ municipalityID=" + municipalityID + " ]";
    }

}
