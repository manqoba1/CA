/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "vendorcity")
@NamedQueries({
    @NamedQuery(name = "Vendorcity.findAll", query = "SELECT v FROM Vendorcity v"),
    @NamedQuery(name = "Vendorcity.findByVendorCityID", query = "SELECT v FROM Vendorcity v WHERE v.vendorCityID = :vendorCityID"),
    @NamedQuery(name = "Vendorcity.findByLattitude", query = "SELECT v FROM Vendorcity v WHERE v.lattitude = :lattitude"),
    @NamedQuery(name = "Vendorcity.findByLongitude", query = "SELECT v FROM Vendorcity v WHERE v.longitude = :longitude")})
public class Vendorcity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vendorCityID")
    private Integer vendorCityID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @JoinColumn(name = "vendorID", referencedColumnName = "vendorID")
    @ManyToOne(optional = false)
    private Vendor vendor;

    public Vendorcity() {
    }

    public Vendorcity(Integer vendorCityID) {
        this.vendorCityID = vendorCityID;
    }

    public Vendorcity(Integer vendorCityID, double lattitude, double longitude) {
        this.vendorCityID = vendorCityID;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Integer getVendorCityID() {
        return vendorCityID;
    }

    public void setVendorCityID(Integer vendorCityID) {
        this.vendorCityID = vendorCityID;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorCityID != null ? vendorCityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendorcity)) {
            return false;
        }
        Vendorcity other = (Vendorcity) object;
        if ((this.vendorCityID == null && other.vendorCityID != null) || (this.vendorCityID != null && !this.vendorCityID.equals(other.vendorCityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Vendorcity[ vendorCityID=" + vendorCityID + " ]";
    }

}
