/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "city")
@NamedQueries({
    @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c"),
    @NamedQuery(name = "City.findByCityID", query = "SELECT c FROM City c WHERE c.cityID = :cityID"),
    @NamedQuery(name = "City.findByCityName", query = "SELECT c FROM City c WHERE c.cityName = :cityName"),
    @NamedQuery(name = "City.findByLattitude", query = "SELECT c FROM City c WHERE c.lattitude = :lattitude"),
    @NamedQuery(name = "City.findByLongitude", query = "SELECT c FROM City c WHERE c.longitude = :longitude")})
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cityID")
    private Integer cityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cityName")
    private String cityName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @JoinColumn(name = "provinceID", referencedColumnName = "provinceID")
    @ManyToOne(optional = false)
    private Province province;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Vendorcity> vendorcityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Township> townshipList;

    public City() {
    }

    public City(Integer cityID) {
        this.cityID = cityID;
    }

    public City(Integer cityID, String cityName, double lattitude, double longitude) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<Vendorcity> getVendorcityList() {
        return vendorcityList;
    }

    public void setVendorcityList(List<Vendorcity> vendorcityList) {
        this.vendorcityList = vendorcityList;
    }

    public List<Township> getTownshipList() {
        return townshipList;
    }

    public void setTownshipList(List<Township> townshipList) {
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
        if (!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
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
