package de.hfu;

import static org.junit.Assert.*;
import org.junit.Test; 
import java.util.*;
import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.repository.ResidentRepositoryStub;
import de.hfu.residents.service.BaseResidentService;
import de.hfu.residents.service.ResidentServiceException;

public class ResidentRepositoryStubTest {

	@Test
	public void getFilteredResidentsList1Test() {
		Resident resident = new Resident("Max", "*", "Hauptstraße", "Stuttgart", new Date());
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		
		try {
			assertEquals(baseResidentService.getFilteredResidentsList(resident), list);
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void getFilteredResidentsList2Test() {
		Resident resident = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", null);
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		
		try {
			assertNotEquals(baseResidentService.getFilteredResidentsList(resident), list);
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void getFilteredResidentsList3Test() {
		Resident resident = new Resident("Max", "", "Hauptstraße", "Stuttgart", new Date());
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		
		try {
			assertEquals(baseResidentService.getFilteredResidentsList(resident), list);
		} catch(Exception e) {
			
		}
		
		
	}
	
	@Test
	public void residentRepository1Test() {
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		try {
			assertEquals(baseResidentService.getUniqueResident(resident1), resident1);
		} catch(ResidentServiceException e) {
			
		}
	}
	
	@Test
	public void residentRepository2Test() {
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		try {
			assertEquals(baseResidentService.getUniqueResident(resident1), resident1);
		} catch(ResidentServiceException e) {
			
		}
	}
	
	@Test
	public void residentRepository3Test() {
		Resident resident1 = new Resident("Max*", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		try {
			assertEquals(baseResidentService.getUniqueResident(resident1), resident1);
		} catch(ResidentServiceException e) {
			
		}
	}
	
	@Test
	public void residentRepository4Test() {
		Resident resident1 = new Resident("Max*", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = new ResidentRepositoryStub(list);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		try {
			assertEquals(baseResidentService.getUniqueResident(resident1), resident1);
		} catch(ResidentServiceException e) {
			
		}
	}

}