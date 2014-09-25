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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "executive")
@NamedQueries({
    @NamedQuery(name = "Executive.findAll", query = "SELECT e FROM Executive e"),
    @NamedQuery(name = "Executive.findByExecutiveID", query = "SELECT e FROM Executive e WHERE e.executiveID = :executiveID"),
    @NamedQuery(name = "Executive.findByName", query = "SELECT e FROM Executive e WHERE e.name = :name"),
    @NamedQuery(name = "Executive.findBySurname", query = "SELECT e FROM Executive e WHERE e.surname = :surname"),
    @NamedQuery(name = "Executive.findByEmail", query = "SELECT e FROM Executive e WHERE e.email = :email"),
    @NamedQuery(name = "Executive.findByPhoneNumber", query = "SELECT e FROM Executive e WHERE e.phoneNumber = :phoneNumber")})
public class Executive implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "executiveID")
    private Integer executiveID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "surname")
    private String surname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 13)
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @JoinColumn(name = "municipalityID", referencedColumnName = "municipalityID")
    @ManyToOne
    private Municipality municipality;

    public Executive() {
    }

    public Executive(Integer executiveID) {
        this.executiveID = executiveID;
    }

    public Executive(Integer executiveID, String name) {
        this.executiveID = executiveID;
        this.name = name;
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

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
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
        if (!(object instanceof Executive)) {
            return false;
        }
        Executive other = (Executive) object;
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
