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

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "townshippolicestation")
@NamedQueries({
    @NamedQuery(name = "Townshippolicestation.findAll", query = "SELECT t FROM Townshippolicestation t"),
    @NamedQuery(name = "Townshippolicestation.findBytown", query = "SELECT t FROM Townshippolicestation t WHERE t.township.townshipID = :townshipID"),
    @NamedQuery(name = "Townshippolicestation.findByTownshipPoliceStationID", query = "SELECT t FROM Townshippolicestation t WHERE t.townshipPoliceStationID = :townshipPoliceStationID")})
public class Townshippolicestation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "townshipPoliceStationID")
    private Integer townshipPoliceStationID;
    @JoinColumn(name = "townshipID", referencedColumnName = "townshipID")
    @ManyToOne(optional = false)
    private Township township;
    @JoinColumn(name = "policeStationID", referencedColumnName = "policeStationID")
    @ManyToOne(optional = false)
    private Policestation policeStation;

    public Townshippolicestation() {
    }

    public Townshippolicestation(Integer townshipPoliceStationID) {
        this.townshipPoliceStationID = townshipPoliceStationID;
    }

    public Integer getTownshipPoliceStationID() {
        return townshipPoliceStationID;
    }

    public void setTownshipPoliceStationID(Integer townshipPoliceStationID) {
        this.townshipPoliceStationID = townshipPoliceStationID;
    }

    public Township getTownship() {
        return township;
    }

    public void setTownship(Township township) {
        this.township = township;
    }

    public Policestation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(Policestation policeStation) {
        this.policeStation = policeStation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townshipPoliceStationID != null ? townshipPoliceStationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Townshippolicestation)) {
            return false;
        }
        Townshippolicestation other = (Townshippolicestation) object;
        if ((this.townshipPoliceStationID == null && other.townshipPoliceStationID != null) || (this.townshipPoliceStationID != null && !this.townshipPoliceStationID.equals(other.townshipPoliceStationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Townshippolicestation[ townshipPoliceStationID=" + townshipPoliceStationID + " ]";
    }

}
