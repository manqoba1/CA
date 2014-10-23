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
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ResponseDTO implements Serializable {

    private Integer statusCode;
    private String message, sessionID, GCMRegistrationID;

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

    private List<CitizenDTO> citizenList;
    private List<VendorDTO> vendorList;
    private List<PoliceofficerDTO> policeofficerList;
    private List<ExecutiveDTO> executiveList;
    private List<BusinessDTO> businessList;
    private List<BusinessvendorDTO> businessvendorList;
    private List<CityDTO> cityList;
    private List<CountryDTO> countryList;
    private List<FacilityDTO> facilityList;
    private List<MunicipalityDTO> municipalityList;
    private List<PolicestationDTO> policestationList;
    private List<ProvinceDTO> provinceList;
    private List<StationofficerDTO> stationofficerList;
    private List<TownshipDTO> townshipList;
    private List<TownshipbusinessDTO> townshipbusinessList;
    private List<TownshippolicestationDTO> townshippolicestationList;
    private List<VendorcityDTO> vendorcityList;

    //erros
    public static final int OK = 0;
    public static final int SERVER_ERROR = 404;
    public static final int DATABASE_ERROR = 403;
    public static final int DATA_NOT_FOUND = 401;
    public static final int UNKNOWN_REQUEST = 400;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getGCMRegistrationID() {
        return GCMRegistrationID;
    }

    public void setGCMRegistrationID(String GCMRegistrationID) {
        this.GCMRegistrationID = GCMRegistrationID;
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

    public List<VendorDTO> getVendorList() {
        return vendorList;
    }

    public void setVendorList(List<VendorDTO> vendorList) {
        this.vendorList = vendorList;
    }

    public List<PoliceofficerDTO> getPoliceofficerList() {
        return policeofficerList;
    }

    public void setPoliceofficerList(List<PoliceofficerDTO> policeofficerList) {
        this.policeofficerList = policeofficerList;
    }

    public List<ExecutiveDTO> getExecutiveList() {
        return executiveList;
    }

    public void setExecutiveList(List<ExecutiveDTO> executiveList) {
        this.executiveList = executiveList;
    }

    public List<BusinessDTO> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<BusinessDTO> businessList) {
        this.businessList = businessList;
    }

    public List<BusinessvendorDTO> getBusinessvendorList() {
        return businessvendorList;
    }

    public void setBusinessvendorList(List<BusinessvendorDTO> businessvendorList) {
        this.businessvendorList = businessvendorList;
    }

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
    }

    public List<CountryDTO> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<CountryDTO> countryList) {
        this.countryList = countryList;
    }

    public List<FacilityDTO> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<FacilityDTO> facilityList) {
        this.facilityList = facilityList;
    }

    public List<MunicipalityDTO> getMunicipalityList() {
        return municipalityList;
    }

    public void setMunicipalityList(List<MunicipalityDTO> municipalityList) {
        this.municipalityList = municipalityList;
    }

    public List<PolicestationDTO> getPolicestationList() {
        return policestationList;
    }

    public void setPolicestationList(List<PolicestationDTO> policestationList) {
        this.policestationList = policestationList;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    public List<StationofficerDTO> getStationofficerList() {
        return stationofficerList;
    }

    public void setStationofficerList(List<StationofficerDTO> stationofficerList) {
        this.stationofficerList = stationofficerList;
    }

    public List<TownshipDTO> getTownshipList() {
        return townshipList;
    }

    public void setTownshipList(List<TownshipDTO> townshipList) {
        this.townshipList = townshipList;
    }

    public List<TownshipbusinessDTO> getTownshipbusinessList() {
        return townshipbusinessList;
    }

    public void setTownshipbusinessList(List<TownshipbusinessDTO> townshipbusinessList) {
        this.townshipbusinessList = townshipbusinessList;
    }

    public List<TownshippolicestationDTO> getTownshippolicestationList() {
        return townshippolicestationList;
    }

    public void setTownshippolicestationList(List<TownshippolicestationDTO> townshippolicestationList) {
        this.townshippolicestationList = townshippolicestationList;
    }

    public List<VendorcityDTO> getVendorcityList() {
        return vendorcityList;
    }

    public void setVendorcityList(List<VendorcityDTO> vendorcityList) {
        this.vendorcityList = vendorcityList;
    }

    public void setCitizenList(List<CitizenDTO> citizenList) {
        this.citizenList = citizenList;
    }

}
