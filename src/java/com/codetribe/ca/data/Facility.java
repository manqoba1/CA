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
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "facility")
@NamedQueries({
    @NamedQuery(name = "Facility.findAll", query = "SELECT f FROM Facility f"),
    @NamedQuery(name = "Facility.findByFacilityID", query = "SELECT f FROM Facility f WHERE f.facilityID = :facilityID"),
    @NamedQuery(name = "Facility.findByName", query = "SELECT f FROM Facility f WHERE f.name = :name"),
    @NamedQuery(name = "Facility.findByLattitude", query = "SELECT f FROM Facility f WHERE f.lattitude = :lattitude"),
    @NamedQuery(name = "Facility.findByLongitude", query = "SELECT f FROM Facility f WHERE f.longitude = :longitude")})
public class Facility implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "facilityID")
    private Integer facilityID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @JoinColumn(name = "townshipID", referencedColumnName = "townshipID")
    @ManyToOne(optional = false)
    private Township township;

    public Facility() {
    }

    public Facility(Integer facilityID) {
        this.facilityID = facilityID;
    }

    public Facility(Integer facilityID, String name, double lattitude, double longitude) {
        this.facilityID = facilityID;
        this.name = name;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Integer getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(Integer facilityID) {
        this.facilityID = facilityID;
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

    public Township getTownship() {
        return township;
    }

    public void setTownship(Township township) {
        this.township = township;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facilityID != null ? facilityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facility)) {
            return false;
        }
        Facility other = (Facility) object;
        if ((this.facilityID == null && other.facilityID != null) || (this.facilityID != null && !this.facilityID.equals(other.facilityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Facility[ facilityID=" + facilityID + " ]";
    }

}
