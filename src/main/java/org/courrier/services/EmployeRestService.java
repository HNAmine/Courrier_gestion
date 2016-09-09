package org.courrier.services;

import java.util.List;

import org.courrier.entities.Employe;
import org.courrier.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeRestService {

	@Autowired
	private EmployeMetier employeMetier;

	@RequestMapping(value = "/employes", method = RequestMethod.POST)
	public Employe addEmploye(@RequestBody Employe employe) {
		return employeMetier.addEmploye(employe);
	}

	@RequestMapping(value = "/employes/{idEmploye}", method = RequestMethod.GET)
	public Employe getEmploye(@PathVariable Long idEmploye) {
		return employeMetier.getEmploye(idEmploye);
	}

	@RequestMapping(value = "/employes", method = RequestMethod.GET)
	public List<Employe> allEmployes() {
		return employeMetier.allEmployes();
	}

	@RequestMapping(value = "/employes/{idEmploye}", method = RequestMethod.DELETE)
	public boolean deleteEmploye(@PathVariable Long idEmploye) {
		return employeMetier.deleteEmploye(idEmploye);
	}

	@RequestMapping(value = "/employes", method = RequestMethod.DELETE)
	public boolean deleteAllEmployes() {
		return employeMetier.deleteAllEmployes();
	}

	@RequestMapping(value = "/employes", method = RequestMethod.PUT)
	public Employe updateDivision(@RequestBody Employe employe) {
		return employeMetier.updateEmploye(employe);
	}
}
