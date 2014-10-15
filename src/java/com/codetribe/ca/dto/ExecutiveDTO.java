/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.*;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class ExecutiveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer executiveID;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private MunicipalityDTO municipalityDto;

    public ExecutiveDTO() {
    }

    public ExecutiveDTO(Executive e) {
        executiveID = e.getExecutiveID();
        name = e.getName();
        surname = e.getSurname();
        email = e.getEmail();
        phoneNumber = e.getPhoneNumber();
        municipalityDto = new MunicipalityDTO(e.getMunicipality());

    }

    public Integer getExecutiveID() {
        return executiveID;
    }

    public void setExecutiveID(Integer executiveID) {
        this.executiveID = executiveID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MunicipalityDTO getMunicipalityDto() {
        return municipalityDto;
    }

    public void setMunicipalityDto(MunicipalityDTO municipalityDto) {
        this.municipalityDto = municipalityDto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (executiveID != null ? executiveID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExecutiveDTO)) {
            return false;
        }
        ExecutiveDTO other = (ExecutiveDTO) object;
        if ((this.executiveID == null && other.executiveID != null) || (this.executiveID != null && !this.executiveID.equals(other.executiveID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Executive[ executiveID=" + executiveID + " ]";
    }

}
