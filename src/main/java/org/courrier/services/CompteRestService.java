package org.courrier.services;

import java.util.List;

import org.courrier.entities.Compte;
import org.courrier.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteRestService {
	@Autowired
	CompteMetier compteMetier;

	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	public Compte addCompte(@RequestBody Compte compte) {
		return compteMetier.addCompte(compte);
	}

	@RequestMapping(value = "/comptes/{idCompte}", method = RequestMethod.GET)
	public Compte getCompte(@PathVariable Long idCompte) {
		return compteMetier.getCompte(idCompte);
	}

	@RequestMapping(value = "/comptes", method = RequestMethod.GET)
	public List<Compte> allComptes() {
		return compteMetier.allComptes();
	}

	@RequestMapping(value = "/comptes/{idCompte}", method = RequestMethod.DELETE)
	public boolean deleteCompte(@PathVariable Long idCompte) {
		return compteMetier.deleteCompte(idCompte);
	}

	@RequestMapping(value = "/comptes", method = RequestMethod.PUT)
	public Compte updateCompte(@RequestBody Compte compte) {
		return compteMetier.updateCompte(compte);
	}
}
