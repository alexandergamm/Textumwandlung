package de.hfu;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.createMock;
import org.junit.Test;
import java.util.*;
import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.service.BaseResidentService;
import de.hfu.residents.service.ResidentServiceException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ResidentRepositoryMockTest {
	
	@Test
	public void residentRepositoryTest() {
		Resident resident1 = new Resident("Max", "Müller", "Hauptstraße", "Stuttgart", new Date());
		Resident resident2 = new Resident("Max", "Mustermann", "Hauptstraße", "Stuttgart", new Date());
		
		List<Resident> list = new ArrayList<Resident>(0);
		list.add(resident1);
		list.add(resident2);
		
		ResidentRepository residentRepository = createMock(ResidentRepository.class);
		BaseResidentService baseResidentService = new BaseResidentService();
		baseResidentService.setResidentRepository(residentRepository);
		
		//Ansatz fehlerhaft
		/*try {
			assertThat(baseResidentService.getUniqueResident(resident1), equalTo(resident1));
		} catch(ResidentServiceException e) {
			
		}*/
	}


}
