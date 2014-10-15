/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.City;
import com.codetribe.ca.data.Municipality;
import com.codetribe.ca.data.Township;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class TownshipDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer townshipID;
    private String townshipName;
    private double lattitude;
    private double longitude;
    private List<CitizenDTO> citizenList;
    private List<TownshipbusinessDTO> townshipbusinessList;
    private List<TownshippolicestationDTO> townshippolicestationList;
    private List<FacilityDTO> facilityList;
    private CityDTO city;
    private MunicipalityDTO municipality;

    public TownshipDTO() {
    }

    public TownshipDTO(Township t) {
        townshipID = t.getTownshipID();
        townshipName = t.getTownshipName();
        lattitude = t.getLattitude();
        longitude = t.getLongitude();
        City c = t.getCity();
        if (c != null) {
            city = new CityDTO(c);
        }
        Municipality m = t.getMunicipality();
        if (m != null) {
            municipality = new MunicipalityDTO(m);
        }
    }

    public Integer getTownshipID() {
        return townshipID;
    }

    public void setTownshipID(Integer townshipID) {
        this.townshipID = townshipID;
    }

    public String getTownshipName() {
        return townshipName;
    }

    public void setTownshipName(String townshipName) {
        this.townshipName = townshipName;
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

    public List<CitizenDTO> getCitizenList() {
        return citizenList;
    }

    public void setCitizenList(List<CitizenDTO> citizenList) {
        this.citizenList = citizenList;
    }

    public List<TownshipbusinessDTO> getTownshipbusinessList() {
        return townshipbusinessList;
    }

    public void setTownshipbusinessList(List<TownshipbusinessDTO> townshipbusinessList) {
        this.townshipbusinessList = townshipbusinessList;
    }

    public List<TownshippolicestationDTO> getTownshippolicestationList() {
        return townshippolicestationList;
    }

    public void setTownshippolicestationList(List<TownshippolicestationDTO> townshippolicestationList) {
        this.townshippolicestationList = townshippolicestationList;
    }

    public List<FacilityDTO> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<FacilityDTO> facilityList) {
        this.facilityList = facilityList;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public MunicipalityDTO getMunicipality() {
        return municipality;
    }

    public void setMunicipality(MunicipalityDTO municipality) {
        this.municipality = municipality;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townshipID != null ? townshipID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TownshipDTO)) {
            return false;
        }
        TownshipDTO other = (TownshipDTO) object;
        if ((this.townshipID == null && other.townshipID != null) || (this.townshipID != null && !this.townshipID.equals(other.townshipID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Township[ townshipID=" + townshipID + " ]";
    }

}
