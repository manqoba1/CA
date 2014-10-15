/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Country;
import com.codetribe.ca.data.Province;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ProvinceDTO {

    private static final long serialVersionUID = 1L;

    private Integer provinceID;
    private String provinceName;
    private double lattitude;
    private double longitude;
    private List<CityDTO> cityList;
    private CountryDTO country;

    public ProvinceDTO() {
    }

    public ProvinceDTO(Province p) {
        provinceID = p.getProvinceID();
        provinceName = p.getProvinceName();
        lattitude = p.getLattitude();
        longitude = p.getLongitude();
        Country c = p.getCountry();
        if (c != null) {
            country = new CountryDTO(c);
        }
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
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

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provinceID != null ? provinceID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProvinceDTO)) {
            return false;
        }
        ProvinceDTO other = (ProvinceDTO) object;
        if ((this.provinceID == null && other.provinceID != null) || (this.provinceID != null && !this.provinceID.equals(other.provinceID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Province[ provinceID=" + provinceID + " ]";
    }

}
