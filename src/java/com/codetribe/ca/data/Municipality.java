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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "municipality")
@NamedQueries({
    @NamedQuery(name = "Municipality.findAll", query = "SELECT m FROM Municipality m"),
    @NamedQuery(name = "Municipality.findByMunicipalityID", query = "SELECT m FROM Municipality m WHERE m.municipalityID = :municipalityID"),
    @NamedQuery(name = "Municipality.findByMunicipalityName", query = "SELECT m FROM Municipality m WHERE m.municipalityName = :municipalityName")})
public class Municipality implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "municipalityID")
    private Integer municipalityID;
    @Size(max = 225)
    @Column(name = "municipalityName")
    private String municipalityName;
    @OneToMany(mappedBy = "municipality")
    private List<Executive> executiveList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "municipality")
    private List<Township> townshipList;

    public Municipality() {
    }

    public Municipality(Integer municipalityID) {
        this.municipalityID = municipalityID;
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

    public List<Executive> getExecutiveList() {
        return executiveList;
    }

    public void setExecutiveList(List<Executive> executiveList) {
        this.executiveList = executiveList;
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
        hash += (municipalityID != null ? municipalityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipality)) {
            return false;
        }
        Municipality other = (Municipality) object;
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
