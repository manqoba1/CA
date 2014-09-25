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
import javax.persistence.Lob;
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
@Table(name = "business")
@NamedQueries({
    @NamedQuery(name = "Business.findAll", query = "SELECT b FROM Business b"),
    @NamedQuery(name = "Business.findByBusinessID", query = "SELECT b FROM Business b WHERE b.businessID = :businessID"),
    @NamedQuery(name = "Business.findByName", query = "SELECT b FROM Business b WHERE b.name = :name"),
    @NamedQuery(name = "Business.findByLongitude", query = "SELECT b FROM Business b WHERE b.longitude = :longitude"),
    @NamedQuery(name = "Business.findByLattitude", query = "SELECT b FROM Business b WHERE b.lattitude = :lattitude")})
public class Business implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "businessID")
    private Integer businessID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "business")
    private List<Townshipbusiness> townshipbusinessList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "business")
    private List<Businessvendor> businessvendorList;

    public Business() {
    }

    public Business(Integer businessID) {
        this.businessID = businessID;
    }

    public Business(Integer businessID, String name, String description, double longitude, double lattitude) {
        this.businessID = businessID;
        this.name = name;
        this.description = description;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public List<Townshipbusiness> getTownshipbusinessList() {
        return townshipbusinessList;
    }

    public void setTownshipbusinessList(List<Townshipbusiness> townshipbusinessList) {
        this.townshipbusinessList = townshipbusinessList;
    }

    public List<Businessvendor> getBusinessvendorList() {
        return businessvendorList;
    }

    public void setBusinessvendorList(List<Businessvendor> businessvendorList) {
        this.businessvendorList = businessvendorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessID != null ? businessID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Business)) {
            return false;
        }
        Business other = (Business) object;
        if ((this.businessID == null && other.businessID != null) || (this.businessID != null && !this.businessID.equals(other.businessID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Business[ businessID=" + businessID + " ]";
    }
    
}
