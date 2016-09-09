package org.courrier.services;

import java.util.List;

import org.courrier.entities.Division;
import org.courrier.metier.DivisionMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionRestService {

	@Autowired
	private DivisionMetier divisionMetier;

	@RequestMapping(value = "/divisions", method = RequestMethod.POST)
	public Division addDivision(@RequestBody Division division) {
		return divisionMetier.addDivision(division);
	}

	@RequestMapping(value = "/divisions/{idDivision}", method = RequestMethod.GET)
	public Division getDivision(@PathVariable Long idDivision) {
		return divisionMetier.getDivision(idDivision);
	}

	@RequestMapping(value = "/divisions", method = RequestMethod.GET)
	public List<Division> allDivisions() {
		return divisionMetier.allDivisions();
	}

	@RequestMapping(value = "/divisions/{idDivision}", method = RequestMethod.DELETE)
	public boolean deleteDivision(@PathVariable Long idDivision) {
		return divisionMetier.deleteDivision(idDivision);
	}
	
	@RequestMapping(value = "/divisions", method = RequestMethod.DELETE)
	public boolean deleteAllDivisions() {
		return divisionMetier.deleteAllDivisions();
	}
	
	@RequestMapping(value = "/divisions", method = RequestMethod.PUT)
	public Division updateDivision(@RequestBody Division division) {
		return divisionMetier.updateDivision(division);
	}
}
