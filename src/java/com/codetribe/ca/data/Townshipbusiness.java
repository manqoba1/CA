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
@Table(name = "townshipbusiness")
@NamedQueries({
    @NamedQuery(name = "Townshipbusiness.findAll", query = "SELECT t FROM Townshipbusiness t"),
    @NamedQuery(name = "Townshipbusiness.findByTownshipBusinessID", query = "SELECT t FROM Townshipbusiness t WHERE t.townshipBusinessID = :townshipBusinessID")})
public class Townshipbusiness implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "townshipBusinessID")
    private Integer townshipBusinessID;
    @JoinColumn(name = "townshipID", referencedColumnName = "townshipID")
    @ManyToOne(optional = false)
    private Township township;
    @JoinColumn(name = "businessID", referencedColumnName = "businessID")
    @ManyToOne(optional = false)
    private Business business;

    public Townshipbusiness() {
    }

    public Townshipbusiness(Integer townshipBusinessID) {
        this.townshipBusinessID = townshipBusinessID;
    }

    public Integer getTownshipBusinessID() {
        return townshipBusinessID;
    }

    public void setTownshipBusinessID(Integer townshipBusinessID) {
        this.townshipBusinessID = townshipBusinessID;
    }

    public Township getTownship() {
        return township;
    }

    public void setTownship(Township township) {
        this.township = township;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townshipBusinessID != null ? townshipBusinessID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Townshipbusiness)) {
            return false;
        }
        Townshipbusiness other = (Townshipbusiness) object;
        if ((this.townshipBusinessID == null && other.townshipBusinessID != null) || (this.townshipBusinessID != null && !this.townshipBusinessID.equals(other.townshipBusinessID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Townshipbusiness[ townshipBusinessID=" + townshipBusinessID + " ]";
    }

}
