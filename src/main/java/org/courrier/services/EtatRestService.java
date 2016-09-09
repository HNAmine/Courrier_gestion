package org.courrier.services;

import java.util.List;

import org.courrier.entities.Etat;
import org.courrier.metier.EtatMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtatRestService {

	@Autowired
	private EtatMetier etatMetier;

	@RequestMapping(value = "/etats", method = RequestMethod.POST)
	public Etat addEtat(@RequestBody Etat etat) {
		return etatMetier.addEtat(etat);
	}

	@RequestMapping(value = "/etats/{idEtat}", method = RequestMethod.GET)
	public Etat getEtat(@PathVariable Long idEtat) {
		return etatMetier.getEtat(idEtat);
	}

	@RequestMapping(value = "/etats", method = RequestMethod.GET)
	public List<Etat> allEtats() {
		return etatMetier.allEtats();
	}

	@RequestMapping(value = "/etats/{idEtat}", method = RequestMethod.DELETE)
	public boolean deleteEtat(@PathVariable Long idEtat) {
		return etatMetier.deleteEtat(idEtat);
	}

	@RequestMapping(value = "/etats", method = RequestMethod.PUT)
	public Etat updateEtat(@RequestBody Etat etat) {
		return etatMetier.updateEtat(etat);
	}
}
