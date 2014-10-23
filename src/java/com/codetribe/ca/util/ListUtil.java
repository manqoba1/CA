/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetribe.ca.util;

import com.codetribe.ca.data.Business;
import com.codetribe.ca.data.Facility;
import com.codetribe.ca.data.Township;
import com.codetribe.ca.data.Townshipbusiness;
import com.codetribe.ca.data.Townshippolicestation;
import com.codetribe.ca.dto.BusinessDTO;
import com.codetribe.ca.dto.FacilityDTO;
import com.codetribe.ca.dto.PolicestationDTO;
import com.codetribe.ca.dto.TownshipDTO;
import com.codetribe.ca.dto.TownshippolicestationDTO;
import com.codetribe.ca.dto.transfer.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
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
public class ListUtil {

    @PersistenceContext
    EntityManager em;

    public ResponseDTO getTownship(Integer townshipID) throws DataException {
        ResponseDTO resp = new ResponseDTO();

        try {
            Query q = em.createNamedQuery("Township.findAll",
                    Township.class);
            q.setParameter("townshipID", townshipID);
            List<Township> pList = q.getResultList();
            for (Township town : pList) {
                TownshipDTO s = new TownshipDTO(town);
                resp.setTownship(s);
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed to get township data\n" + getErrorString(e));
        }

        return resp;
    }

    public ResponseDTO getTownshipData(Integer townshipID) throws DataException {
        List<TownshipDTO> list = new ArrayList<>();
        ResponseDTO dto = new ResponseDTO();
        try {
            Query q = em.createNamedQuery("Township.findByTownshipID", Township.class);
            q.setParameter("townshipID", townshipID);
            Township s = (Township) q.getSingleResult();  
            List<PolicestationDTO> dTOs = getPoliceStationByTownID(townshipID);
            List<FacilityDTO> facilityDTOs = getFacilityByTownID(townshipID);
            List<BusinessDTO> businessDTOs = getBusinessByTownID(townshipID);
            dto.setTownship(new TownshipDTO(s));
            dto.setPolicestationList(dTOs);
            dto.setFacilityList(facilityDTOs);
            dto.setBusinessList(businessDTOs);

        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed to get company task status data\n" + getErrorString(e));
        }

        return dto;
    }

    private List<PolicestationDTO> getPoliceStationByTownID(int townshipID) throws DataException {
        List<PolicestationDTO> list = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Townshippolicestation.findBytown", Township.class);
            q.setParameter("townshipID", townshipID);
            List<Townshippolicestation> pList = q.getResultList();

            for (Townshippolicestation s : pList) {
                list.add(new PolicestationDTO(s.getPoliceStation()));

            }
            log.log(Level.OFF, "Township: {0}", pList.size());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed to get company task status data\n");
        }
        return list;
    }
    private List<FacilityDTO> getFacilityByTownID(int townshipID) throws DataException {
        List<FacilityDTO> list = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Facility.findfacilityByTown", Township.class);
            q.setParameter("townshipID", townshipID);
            List<Facility> pList = q.getResultList();
            
            for (Facility s : pList) {
                list.add(new FacilityDTO(s));

            }
            log.log(Level.OFF, "Township: {0}", list.size());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed to get company task status data\n");
        }
        return list;
    }
    private List<BusinessDTO> getBusinessByTownID(int townshipID) throws DataException {
        List<BusinessDTO> list = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Townshipbusiness.findByTownID", Township.class);
            q.setParameter("townshipID", townshipID);
            List<Townshipbusiness> pList = q.getResultList();
            
            for (Townshipbusiness s : pList) {
                list.add(new BusinessDTO(s.getBusiness()));

            }
            log.log(Level.OFF, "Business: {0}", list.size());
        } catch (Exception e) {
            log.log(Level.SEVERE, "Failed", e);
            throw new DataException("Failed to get company task status data\n");
        }
        return list;
    }
    public String getErrorString(Exception e) {
        StringBuilder sb = new StringBuilder();
        if (e.getMessage() != null) {
            sb.append(e.getMessage()).append("\n\n");
        }
        if (e.toString() != null) {
            sb.append(e.toString()).append("\n\n");
        }
        StackTraceElement[] s = e.getStackTrace();
        if (s.length > 0) {
            StackTraceElement ss = s[0];
            String method = ss.getMethodName();
            String cls = ss.getClassName();
            int line = ss.getLineNumber();
            sb.append("Class: ").append(cls).append("\n");
            sb.append("Method: ").append(method).append("\n");
            sb.append("Line Number: ").append(line).append("\n");
        }

        return sb.toString();
    }
    static final Logger log = Logger.getLogger(ListUtil.class.getSimpleName());
}
