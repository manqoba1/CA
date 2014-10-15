/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Country;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CountryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer countryID;
    private String name;
    private double lattitude;
    private double longitude;
    private String countyCode;
    private List<ProvinceDTO> provinceList;

    public CountryDTO() {
    }

    public CountryDTO(Country c) {
        countryID = c.getCountryID();
        name = c.getName();
        lattitude = c.getLattitude();
        longitude = c.getLongitude();
        countyCode = c.getCountyCode();
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
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

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryID != null ? countryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryDTO)) {
            return false;
        }
        CountryDTO other = (CountryDTO) object;
        if ((this.countryID == null && other.countryID != null) || (this.countryID != null && !this.countryID.equals(other.countryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Country[ countryID=" + countryID + " ]";
    }

}
