package org.courrier.services;

import java.util.List;

import org.courrier.entities.Courrier;
import org.courrier.metier.CourrierMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourrierRestService {

	@Autowired
	private CourrierMetier CourrierMetier;

	@RequestMapping(value = "/courriers", method = RequestMethod.POST)
	public Courrier addCourrier(@RequestBody Courrier Courrier) {
		return CourrierMetier.addCourrier(Courrier);
	}

	@RequestMapping(value = "/courriers/{idCourrier}", method = RequestMethod.GET)
	public Courrier getCourrier(@PathVariable Long idCourrier) {
		return CourrierMetier.getCourrier(idCourrier);
	}

	@RequestMapping(value = "/courriers", method = RequestMethod.GET)
	public List<Courrier> allCourriers() {
		return CourrierMetier.allCourriers();
	}

	@RequestMapping(value = "/courriers/{idCourrier}", method = RequestMethod.DELETE)
	public boolean deleteCourrier(@PathVariable Long idCourrier) {
		return CourrierMetier.deleteCourrier(idCourrier);
	}

	@RequestMapping(value = "/courriers", method = RequestMethod.PUT)
	public Courrier updateCourrier(@RequestBody Courrier Courrier) {
		return CourrierMetier.updateCourrier(Courrier);
	}
}
