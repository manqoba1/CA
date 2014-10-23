/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.dto.transfer;

import com.codetribe.ca.dto.BusinessDTO;
import com.codetribe.ca.dto.BusinessvendorDTO;
import com.codetribe.ca.dto.CitizenDTO;
import com.codetribe.ca.dto.CityDTO;
import com.codetribe.ca.dto.CountryDTO;
import com.codetribe.ca.dto.ExecutiveDTO;
import com.codetribe.ca.dto.FacilityDTO;
import com.codetribe.ca.dto.MunicipalityDTO;
import com.codetribe.ca.dto.PoliceofficerDTO;
import com.codetribe.ca.dto.PolicestationDTO;
import com.codetribe.ca.dto.ProvinceDTO;
import com.codetribe.ca.dto.StationofficerDTO;
import com.codetribe.ca.dto.TownshipDTO;
import com.codetribe.ca.dto.TownshipbusinessDTO;
import com.codetribe.ca.dto.TownshippolicestationDTO;
import com.codetribe.ca.dto.VendorDTO;
import com.codetribe.ca.dto.VendorcityDTO;
import java.io.Serializable;

/**
 *
 * @author CodeTribe1
 */
public class RequestDTO implements Serializable {

    private Integer requestType, townshipID;

    private CitizenDTO citizen;
    private VendorDTO vendor;
    private PoliceofficerDTO policeofficer;
    private ExecutiveDTO executive;
    private BusinessDTO business;
    private BusinessvendorDTO businessvendor;
    private CityDTO city;
    private CountryDTO country;
    private FacilityDTO facility;
    private MunicipalityDTO municipality;
    private PolicestationDTO policestation;
    private ProvinceDTO province;
    private StationofficerDTO stationofficer;
    private TownshipDTO township;
    private TownshipbusinessDTO townshipbusiness;
    private TownshippolicestationDTO townshippolicestation;
    private VendorcityDTO vendorcity;

    public static final int REGISTER_CITIZEN = 1,
            REGISTER_VENDOR = 2,
            REGISTER_OFFICER = 3,
            REGISTER_EXECUTIVE = 4,
            REGISTER_BUSINESS = 5;

    public static final int GET_TOWN_BY_MUNICIPALITY = 100,
            GET_TOWNSHIPS = 101;

    public static final int LOGIN = 200;

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Integer getTownshipID() {
        return townshipID;
    }

    public void setTownshipID(Integer townshipID) {
        this.townshipID = townshipID;
    }

    public CitizenDTO getCitizen() {
        return citizen;
    }

    public void setCitizen(CitizenDTO citizen) {
        this.citizen = citizen;
    }

    public VendorDTO getVendor() {
        return vendor;
    }

    public void setVendor(VendorDTO vendor) {
        this.vendor = vendor;
    }

    public PoliceofficerDTO getPoliceofficer() {
        return policeofficer;
    }

    public void setPoliceofficer(PoliceofficerDTO policeofficer) {
        this.policeofficer = policeofficer;
    }

    public ExecutiveDTO getExecutive() {
        return executive;
    }

    public void setExecutive(ExecutiveDTO executive) {
        this.executive = executive;
    }

    public BusinessDTO getBusiness() {
        return business;
    }

    public void setBusiness(BusinessDTO business) {
        this.business = business;
    }

    public BusinessvendorDTO getBusinessvendor() {
        return businessvendor;
    }

    public void setBusinessvendor(BusinessvendorDTO businessvendor) {
        this.businessvendor = businessvendor;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    public FacilityDTO getFacility() {
        return facility;
    }

    public void setFacility(FacilityDTO facility) {
        this.facility = facility;
    }

    public MunicipalityDTO getMunicipality() {
        return municipality;
    }

    public void setMunicipality(MunicipalityDTO municipality) {
        this.municipality = municipality;
    }

    public PolicestationDTO getPolicestation() {
        return policestation;
    }

    public void setPolicestation(PolicestationDTO policestation) {
        this.policestation = policestation;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    public StationofficerDTO getStationofficer() {
        return stationofficer;
    }

    public void setStationofficer(StationofficerDTO stationofficer) {
        this.stationofficer = stationofficer;
    }

    public TownshipDTO getTownship() {
        return township;
    }

    public void setTownship(TownshipDTO township) {
        this.township = township;
    }

    public TownshipbusinessDTO getTownshipbusiness() {
        return townshipbusiness;
    }

    public void setTownshipbusiness(TownshipbusinessDTO townshipbusiness) {
        this.townshipbusiness = townshipbusiness;
    }

    public TownshippolicestationDTO getTownshippolicestation() {
        return townshippolicestation;
    }

    public void setTownshippolicestation(TownshippolicestationDTO townshippolicestation) {
        this.townshippolicestation = townshippolicestation;
    }

    public VendorcityDTO getVendorcity() {
        return vendorcity;
    }

    public void setVendorcity(VendorcityDTO vendorcity) {
        this.vendorcity = vendorcity;
    }

}
