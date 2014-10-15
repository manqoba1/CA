/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Citizen;
import com.codetribe.ca.data.Municipality;
import com.codetribe.ca.data.Township;
import java.io.Serializable;

public class CitizenDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer citizenID;
    private String citizenName;
    private String citizenSurname;
    private String citizenEmail;
    private String citizenGender;
    private String phoneNumber;
    private double longitude;
    private double lattitude;
    private String citizenAddress, municipalityName;
    private int townshipID, municipalityID;

    public CitizenDTO(Citizen c) {
        citizenID = c.getCitizenID();
        citizenName = c.getCitizenName();
        citizenSurname = c.getCitizenSurname();
        citizenEmail = c.getCitizenEmail();
        citizenAddress = c.getCitizenAddress();
        citizenGender = c.getCitizenGender();
        lattitude = c.getLattitude();
        longitude = c.getLongitude();
        phoneNumber = c.getPhoneNumber();
        Township t = c.getTownship();
        if (t != null) {
            townshipID = t.getTownshipID();
            Municipality m = t.getMunicipality();
            if (m != null) {
                municipalityID = m.getMunicipalityID();
                municipalityName = m.getMunicipalityName();
            }
        }

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

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    public int getTownshipID() {
        return townshipID;
    }

    public void setTownshipID(int townshipID) {
        this.townshipID = townshipID;
    }

    public int getMunicipalityID() {
        return municipalityID;
    }

    public void setMunicipalityID(int municipalityID) {
        this.municipalityID = municipalityID;
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
        if (!(object instanceof CitizenDTO)) {
            return false;
        }
        CitizenDTO other = (CitizenDTO) object;
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
