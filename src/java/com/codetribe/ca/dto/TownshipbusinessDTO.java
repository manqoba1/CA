/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto;

import com.codetribe.ca.data.Business;
import com.codetribe.ca.data.Township;
import com.codetribe.ca.data.Townshipbusiness;

/**
 *
 * @author CodeTribe1
 */
public class TownshipbusinessDTO {

    private static final long serialVersionUID = 1L;

    private Integer townshipBusinessID;
    private TownshipDTO township;
    private BusinessDTO business;

    public TownshipbusinessDTO() {
    }

    public TownshipbusinessDTO(Townshipbusiness tb) {
        townshipBusinessID = tb.getTownshipBusinessID();
        Township t = tb.getTownship();
        if (t != null) {
            township = new TownshipDTO(t);

        }
        Business b = tb.getBusiness();
        if (b != null) {
            business = new BusinessDTO(b);
        }

    }

    public Integer getTownshipBusinessID() {
        return townshipBusinessID;
    }

    public void setTownshipBusinessID(Integer townshipBusinessID) {
        this.townshipBusinessID = townshipBusinessID;
    }

    public TownshipDTO getTownship() {
        return township;
    }

    public void setTownship(TownshipDTO township) {
        this.township = township;
    }

    public BusinessDTO getBusiness() {
        return business;
    }

    public void setBusiness(BusinessDTO business) {
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
        if (!(object instanceof TownshipbusinessDTO)) {
            return false;
        }
        TownshipbusinessDTO other = (TownshipbusinessDTO) object;
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
