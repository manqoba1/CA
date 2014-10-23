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
@Table(name = "township")
@NamedQueries({
    @NamedQuery(name = "Township.findAll", query = "SELECT t FROM Township t"),
    @NamedQuery(name = "Township.findByTownshipID", query = "SELECT t FROM Township t WHERE t.townshipID = :townshipID"),
    @NamedQuery(name = "Township.findByTownshipName", query = "SELECT t FROM Township t WHERE t.townshipName = :townshipName"),
    @NamedQuery(name = "Township.findByLattitude", query = "SELECT t FROM Township t WHERE t.lattitude = :lattitude"),
    @NamedQuery(name = "Township.findByLongitude", query = "SELECT t FROM Township t WHERE t.longitude = :longitude")})
public class Township implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "townshipID")
    private Integer townshipID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "townshipName")
    private String townshipName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "township")
    private List<Citizen> citizenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "township")
    private List<Townshipbusiness> townshipbusinessList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "township")
    private List<Townshippolicestation> townshippolicestationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "township")
    private List<Facility> facilityList;
    @JoinColumn(name = "cityID", referencedColumnName = "cityID")
    @ManyToOne(optional = false)
    private City city;
    @JoinColumn(name = "municipalityID", referencedColumnName = "municipalityID")
    @ManyToOne(optional = false)
    private Municipality municipality;

    public Township() {
    }

    public Township(Integer townshipID) {
        this.townshipID = townshipID;
    }

    public Township(Integer townshipID, String townshipName, double lattitude, double longitude) {
        this.townshipID = townshipID;
        this.townshipName = townshipName;
        this.lattitude = lattitude;
        this.longitude = longitude;
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

    public List<Citizen> getCitizenList() {
        return citizenList;
    }

    public void setCitizenList(List<Citizen> citizenList) {
        this.citizenList = citizenList;
    }

    public List<Townshipbusiness> getTownshipbusinessList() {
        return townshipbusinessList;
    }

    public void setTownshipbusinessList(List<Townshipbusiness> townshipbusinessList) {
        this.townshipbusinessList = townshipbusinessList;
    }

    public List<Townshippolicestation> getTownshippolicestationList() {
        return townshippolicestationList;
    }

    public void setTownshippolicestationList(List<Townshippolicestation> townshippolicestationList) {
        this.townshippolicestationList = townshippolicestationList;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
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
        if (!(object instanceof Township)) {
            return false;
        }
        Township other = (Township) object;
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
