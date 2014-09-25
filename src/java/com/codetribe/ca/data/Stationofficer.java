/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.data;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "stationofficer")
@NamedQueries({
    @NamedQuery(name = "Stationofficer.findAll", query = "SELECT s FROM Stationofficer s"),
    @NamedQuery(name = "Stationofficer.findByStationOfficerID", query = "SELECT s FROM Stationofficer s WHERE s.stationOfficerID = :stationOfficerID"),
    @NamedQuery(name = "Stationofficer.findByDateAssigned", query = "SELECT s FROM Stationofficer s WHERE s.dateAssigned = :dateAssigned")})
public class Stationofficer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stationOfficerID")
    private Integer stationOfficerID;
    @Column(name = "dateAssigned")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAssigned;
    @JoinColumn(name = "policeStationID", referencedColumnName = "policeStationID")
    @ManyToOne(optional = false)
    private Policestation policeStation;
    @JoinColumn(name = "policeOfficerID", referencedColumnName = "policeOfficerID")
    @ManyToOne(optional = false)
    private Policeofficer policeOfficer;

    public Stationofficer() {
    }

    public Stationofficer(Integer stationOfficerID) {
        this.stationOfficerID = stationOfficerID;
    }

    public Integer getStationOfficerID() {
        return stationOfficerID;
    }

    public void setStationOfficerID(Integer stationOfficerID) {
        this.stationOfficerID = stationOfficerID;
    }

    public Date getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Date dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public Policestation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(Policestation policeStation) {
        this.policeStation = policeStation;
    }

    public Policeofficer getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(Policeofficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationOfficerID != null ? stationOfficerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stationofficer)) {
            return false;
        }
        Stationofficer other = (Stationofficer) object;
        if ((this.stationOfficerID == null && other.stationOfficerID != null) || (this.stationOfficerID != null && !this.stationOfficerID.equals(other.stationOfficerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Stationofficer[ stationOfficerID=" + stationOfficerID + " ]";
    }

}
