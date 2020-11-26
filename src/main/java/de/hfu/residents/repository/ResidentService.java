package de.hfu.residents.repository;

import java.util.List;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.service.ResidentServiceException;

/**
 * @author Stefan Betermieux
 */
public interface ResidentService {

  Resident getUniqueResident(Resident filterResident) throws ResidentServiceException;

  List<Resident> getFilteredResidentsList(Resident filterResident);

}