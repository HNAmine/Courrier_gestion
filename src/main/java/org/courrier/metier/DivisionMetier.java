package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Division;

public interface DivisionMetier {
	public Division addDivision(Division division);

	public Division getDivision(Long idDivision);

	public List<Division> allDivisions();

	public Division updateDivision(Division division);

	public boolean deleteDivision(Long idDivision);

	public boolean deleteAllDivisions();
}
