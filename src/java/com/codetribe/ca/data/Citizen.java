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
import javax.persistence.Lob;
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
@Table(name = "citizen")
@NamedQueries({
    @NamedQuery(name = "Citizen.findAll", query = "SELECT c FROM Citizen c"),
    @NamedQuery(name = "Citizen.findByCitizenID", query = "SELECT c FROM Citizen c WHERE c.citizenID = :citizenID"),
    @NamedQuery(name = "Citizen.findByCitizenName", query = "SELECT c FROM Citizen c WHERE c.citizenName = :citizenName"),
    @NamedQuery(name = "Citizen.findByCitizenSurname", query = "SELECT c FROM Citizen c WHERE c.citizenSurname = :citizenSurname"),
    @NamedQuery(name = "Citizen.findByCitizenEmail", query = "SELECT c FROM Citizen c WHERE c.citizenEmail = :citizenEmail"),
    @NamedQuery(name = "Citizen.findByCitizenGender", query = "SELECT c FROM Citizen c WHERE c.citizenGender = :citizenGender"),
    @NamedQuery(name = "Citizen.findByPhoneNumber", query = "SELECT c FROM Citizen c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Citizen.findByLongitude", query = "SELECT c FROM Citizen c WHERE c.longitude = :longitude"),
    @NamedQuery(name = "Citizen.findByLattitude", query = "SELECT c FROM Citizen c WHERE c.lattitude = :lattitude")})
public class Citizen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "citizenID")
    private Integer citizenID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "citizenName")
    private String citizenName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "citizenSurname")
    private String citizenSurname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "citizenEmail")
    private String citizenEmail;
    @Size(max = 15)
    @Column(name = "citizenGender")
    private String citizenGender;
    @Size(max = 10)
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lattitude")
    private double lattitude;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "citizenAddress")
    private String citizenAddress;
    @JoinColumn(name = "townshipID", referencedColumnName = "townshipID")
    @ManyToOne(optional = false)
    private Township township;

    
    public Citizen() {
    }

    public Citizen(Integer citizenID) {
        this.citizenID = citizenID;
    }

    public Citizen(Integer citizenID, String citizenName, String citizenSurname, String citizenEmail, double longitude, double lattitude, String citizenAddress) {
        this.citizenID = citizenID;
        this.citizenName = citizenName;
        this.citizenSurname = citizenSurname;
        this.citizenEmail = citizenEmail;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.citizenAddress = citizenAddress;
    }

    public Integer getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(Integer citizenID) {
        this.citizenID = citizenID;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getCitizenSurname() {
        return citizenSurname;
    }

    public void setCitizenSurname(String citizenSurname) {
        this.citizenSurname = citizenSurname;
    }

    public String getCitizenEmail() {
        return citizenEmail;
    }

    public void setCitizenEmail(String citizenEmail) {
        this.citizenEmail = citizenEmail;
    }

    public String getCitizenGender() {
        return citizenGender;
    }

    public void setCitizenGender(String citizenGender) {
        this.citizenGender = citizenGender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getCitizenAddress() {
        return citizenAddress;
    }

    public void setCitizenAddress(String citizenAddress) {
        this.citizenAddress = citizenAddress;
    }

    public void setTownship(Township township) {
        this.township = township;
    }

    public Township getTownship() {
        return township;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (citizenID != null ? citizenID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citizen)) {
            return false;
        }
        Citizen other = (Citizen) object;
        if ((this.citizenID == null && other.citizenID != null) || (this.citizenID != null && !this.citizenID.equals(other.citizenID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Citizen[ citizenID=" + citizenID + " ]";
    }

}
