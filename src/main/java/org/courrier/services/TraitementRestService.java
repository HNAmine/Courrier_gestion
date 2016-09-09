package org.courrier.services;

import java.util.List;

import org.courrier.entities.Traitement;
import org.courrier.metier.TraitementMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraitementRestService {

	@Autowired
	private TraitementMetier TraitementMetier;

	@RequestMapping(value = "/traitements", method = RequestMethod.POST)
	public Traitement addTraitement(@RequestBody Traitement Traitement) {
		return TraitementMetier.addTraitement(Traitement);
	}

	@RequestMapping(value = "/traitements/{idTraitement}", method = RequestMethod.GET)
	public Traitement getTraitement(@PathVariable Long idTraitement) {
		return TraitementMetier.getTraitement(idTraitement);
	}

	@RequestMapping(value = "/traitements", method = RequestMethod.GET)
	public List<Traitement> allTraitements() {
		return TraitementMetier.allTraitements();
	}

	@RequestMapping(value = "/traitements/{idTraitement}", method = RequestMethod.DELETE)
	public boolean deleteTraitement(@PathVariable Long idTraitement) {
		return TraitementMetier.deleteTraitement(idTraitement);
	}

	@RequestMapping(value = "/traitements", method = RequestMethod.PUT)
	public Traitement updateTraitement(@RequestBody Traitement Traitement) {
		return TraitementMetier.updateTraitement(Traitement);
	}
}
