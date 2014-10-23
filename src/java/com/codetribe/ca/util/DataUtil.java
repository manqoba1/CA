/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.util;

import com.codetribe.ca.data.Business;
import com.codetribe.ca.data.Citizen;
import com.codetribe.ca.data.Executive;
import com.codetribe.ca.data.Municipality;
import com.codetribe.ca.data.Policestation;
import com.codetribe.ca.data.Township;
import com.codetribe.ca.data.Townshipbusiness;
import com.codetribe.ca.data.Townshippolicestation;
import com.codetribe.ca.dto.BusinessDTO;
import com.codetribe.ca.dto.CitizenDTO;
import com.codetribe.ca.dto.ExecutiveDTO;
import com.codetribe.ca.dto.PolicestationDTO;
import com.codetribe.ca.dto.TownshipbusinessDTO;
import com.codetribe.ca.dto.TownshippolicestationDTO;
import com.codetribe.ca.dto.transfer.ResponseDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CodeTribe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DataUtil {

    @PersistenceContext
    EntityManager em;

    public ResponseDTO registerCitizen(CitizenDTO ci, ListUtil listUtil) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Township t = em.find(Township.class, ci.getTownshipID());
            Citizen c = new Citizen();
            c.setCitizenAddress(ci.getCitizenAddress());
            c.setCitizenEmail(ci.getCitizenEmail());
            c.setCitizenGender(ci.getCitizenGender());
            c.setCitizenName(ci.getCitizenName());
            c.setCitizenSurname(ci.getCitizenSurname());
            c.setPhoneNumber(ci.getPhoneNumber());
            if (t.getLattitude() > 0 && t.getLongitude() > 0) {
                c.setLattitude(t.getLattitude());
                c.setLongitude(t.getLongitude());
            }
            c.setTownship(t);
            em.persist(c);
            Query q = em.createNamedQuery("Citizen.findByPhoneNumber", Citizen.class);
            q.setParameter("phoneNumber", ci.getPhoneNumber());
            resp.setTownship(listUtil.getTownshipData(t.getTownshipID()).getTownship());
            resp.setPolicestationList(listUtil.getTownshipData(t.getTownshipID()).getPolicestationList());
            resp.setBusinessList(listUtil.getTownshipData(t.getTownshipID()).getBusinessList());
            resp.setFacilityList(listUtil.getTownshipData(t.getTownshipID()).getFacilityList());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }

    public ResponseDTO registerExecutive(ExecutiveDTO s, ListUtil listUtil) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Municipality m = em.find(Municipality.class, s.getMunicipalityDto().getMunicipalityID());
            Executive e = new Executive();
            e.setEmail(s.getEmail());
            e.setName(s.getName());
            e.setSurname(s.getSurname());
            e.setPhoneNumber(s.getPhoneNumber());

            e.setMunicipality(m);
            em.persist(e);
            //send email or sms
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }

    public void addBusiness(BusinessDTO dto) throws DataException {

        try {
            Business b = new Business();
            b.setDescription(dto.getDescription());
            b.setName(dto.getName());
            b.setLattitude(dto.getLattitude());
            b.setLongitude(dto.getLongitude());
            em.persist(b);
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }

    }

    public ResponseDTO addBusinessToTownship(TownshipbusinessDTO dto, ListUtil listUtil) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Townshipbusiness b = new Townshipbusiness();
            b.setBusiness(em.find(Business.class, dto.getBusiness().getBusinessID()));
            b.setTownship(em.find(Township.class, dto.getTownship().getTownshipID()));

            em.persist(b);

            resp.getBusinessList().add(dto.getBusiness());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }

    public ResponseDTO addPoliceStationToTownship(TownshippolicestationDTO dto, ListUtil listUtil) throws DataException {
        ResponseDTO resp = new ResponseDTO();
        try {
            Townshippolicestation b = new Townshippolicestation();
            b.setPoliceStation(em.find(Policestation.class, dto.getPoliceStation().getPoliceStationID()));
            b.setTownship(em.find(Township.class, dto.getTownship().getTownshipID()));

            em.persist(b);
            Query q = em.createNamedQuery("Townshippolicestation.findBytown");
            q.setParameter("townshipID", dto.getTownship().getTownshipID());

            resp.getPolicestationList().add(dto.getPoliceStation());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed");
        }
        return resp;
    }
    static final Logger log = Logger.getLogger(DataUtil.class.getSimpleName());
}
