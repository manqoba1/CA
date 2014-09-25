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
@Table(name = "vendor")
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v"),
    @NamedQuery(name = "Vendor.findByVendorID", query = "SELECT v FROM Vendor v WHERE v.vendorID = :vendorID"),
    @NamedQuery(name = "Vendor.findByVendorName", query = "SELECT v FROM Vendor v WHERE v.vendorName = :vendorName")})
public class Vendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vendorID")
    private Integer vendorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vendorName")
    private String vendorName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor")
    private List<Businessvendor> businessvendorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor")
    private List<Vendorcity> vendorcityList;

    public Vendor() {
    }

    public Vendor(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public Vendor(Integer vendorID, String vendorName) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public List<Businessvendor> getBusinessvendorList() {
        return businessvendorList;
    }

    public void setBusinessvendorList(List<Businessvendor> businessvendorList) {
        this.businessvendorList = businessvendorList;
    }

    public List<Vendorcity> getVendorcityList() {
        return vendorcityList;
    }

    public void setVendorcityList(List<Vendorcity> vendorcityList) {
        this.vendorcityList = vendorcityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorID != null ? vendorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.vendorID == null && other.vendorID != null) || (this.vendorID != null && !this.vendorID.equals(other.vendorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codetribe.ca.data.Vendor[ vendorID=" + vendorID + " ]";
    }
    
}
