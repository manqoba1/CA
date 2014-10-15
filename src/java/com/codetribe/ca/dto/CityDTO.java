/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.City;
import com.codetribe.ca.data.Country;
import com.codetribe.ca.data.Province;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cityID, countryID;
    private String cityName, provinceName, countryName, countryCode;
    private double lattitude;
    private double longitude;
    private int provinceID;
    private List<VendorcityDTO> vendorcityList;
    private List<TownshipDTO> townshipList;

    public CityDTO(City c) {
        cityID = c.getCityID();
        cityName = c.getCityName();
        lattitude = c.getLattitude();
        longitude = c.getLongitude();
        Province p = c.getProvince();
        if (p != null) {
            provinceID = p.getProvinceID();
            provinceName = p.getProvinceName();
            Country cr = p.getCountry();
            if (cr != null) {
                countryID = cr.getCountryID();
                countryName = cr.getName();
                countryCode = cr.getCountyCode();
            }
        }
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public List<VendorcityDTO> getVendorcityList() {
        return vendorcityList;
    }

    public void setVendorcityList(List<VendorcityDTO> vendorcityList) {
        this.vendorcityList = vendorcityList;
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
        hash += (cityID != null ? cityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CityDTO)) {
            return false;
        }
        CityDTO other = (CityDTO) object;
        if ((this.cityID == null && other.cityID != null) || (this.cityID != null && !this.cityID.equals(other.cityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.City[ cityID=" + cityID + " ]";
    }

}
