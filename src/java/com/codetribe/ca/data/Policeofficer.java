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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "policeofficer")
@NamedQueries({
    @NamedQuery(name = "Policeofficer.findAll", query = "SELECT p FROM Policeofficer p"),
    @NamedQuery(name = "Policeofficer.findByPoliceOfficerID", query = "SELECT p FROM Policeofficer p WHERE p.policeOfficerID = :policeOfficerID"),
    @NamedQuery(name = "Policeofficer.findByName", query = "SELECT p FROM Policeofficer p WHERE p.name = :name"),
    @NamedQuery(name = "Policeofficer.findByBadgeNo", query = "SELECT p FROM Policeofficer p WHERE p.badgeNo = :badgeNo")})
public class Policeofficer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "policeOfficerID")
    private Integer policeOfficerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "badgeNo")
    private String badgeNo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "policeOfficer")
    private List<Stationofficer> stationofficerList;

    public Policeofficer() {
    }

    public Policeofficer(Integer policeOfficerID) {
        this.policeOfficerID = policeOfficerID;
    }

    public Policeofficer(Integer policeOfficerID, String name, String badgeNo) {
        this.policeOfficerID = policeOfficerID;
        this.name = name;
        this.badgeNo = badgeNo;
    }

    public Integer getPoliceOfficerID() {
        return policeOfficerID;
    }

    public void setPoliceOfficerID(Integer policeOfficerID) {
        this.policeOfficerID = policeOfficerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(String badgeNo) {
        this.badgeNo = badgeNo;
    }

    public List<Stationofficer> getStationofficerList() {
        return stationofficerList;
    }

    public void setStationofficerList(List<Stationofficer> stationofficerList) {
        this.stationofficerList = stationofficerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policeOfficerID != null ? policeOfficerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Policeofficer)) {
            return false;
        }
        Policeofficer other = (Policeofficer) object;
        if ((this.policeOfficerID == null && other.policeOfficerID != null) || (this.policeOfficerID != null && !this.policeOfficerID.equals(other.policeOfficerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Policeofficer[ policeOfficerID=" + policeOfficerID + " ]";
    }
    
}
