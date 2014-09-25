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
@Table(name = "policestation")
@NamedQueries({
    @NamedQuery(name = "Policestation.findAll", query = "SELECT p FROM Policestation p"),
    @NamedQuery(name = "Policestation.findByPoliceStationID", query = "SELECT p FROM Policestation p WHERE p.policeStationID = :policeStationID"),
    @NamedQuery(name = "Policestation.findByName", query = "SELECT p FROM Policestation p WHERE p.name = :name"),
    @NamedQuery(name = "Policestation.findByLattitude", query = "SELECT p FROM Policestation p WHERE p.lattitude = :lattitude"),
    @NamedQuery(name = "Policestation.findByLongitude", query = "SELECT p FROM Policestation p WHERE p.longitude = :longitude")})
public class Policestation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "policeStationID")
    private Integer policeStationID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "policeStation")
    private List<Townshippolicestation> townshippolicestationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "policeStation")
    private List<Stationofficer> stationofficerList;

    public Policestation() {
    }

    public Policestation(Integer policeStationID) {
        this.policeStationID = policeStationID;
    }

    public Policestation(Integer policeStationID, String name, double lattitude, double longitude) {
        this.policeStationID = policeStationID;
        this.name = name;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Integer getPoliceStationID() {
        return policeStationID;
    }

    public void setPoliceStationID(Integer policeStationID) {
        this.policeStationID = policeStationID;
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

    public List<Townshippolicestation> getTownshippolicestationList() {
        return townshippolicestationList;
    }

    public void setTownshippolicestationList(List<Townshippolicestation> townshippolicestationList) {
        this.townshippolicestationList = townshippolicestationList;
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
        hash += (policeStationID != null ? policeStationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Policestation)) {
            return false;
        }
        Policestation other = (Policestation) object;
        if ((this.policeStationID == null && other.policeStationID != null) || (this.policeStationID != null && !this.policeStationID.equals(other.policeStationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Policestation[ policeStationID=" + policeStationID + " ]";
    }
    
}
