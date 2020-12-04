package de.hfu.residents.repository;

import java.util.List;
import de.hfu.residents.domain.Resident;

public class ResidentRepositoryStub implements ResidentRepository {

	private List<Resident> residents;
	
	public ResidentRepositoryStub(List<Resident> residents) {
		this.residents = residents;
	}
	
	public List<Resident> getResidents() {
		return residents;
	}
	
}