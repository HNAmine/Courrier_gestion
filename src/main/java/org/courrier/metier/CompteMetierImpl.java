package org.courrier.metier;

import java.util.List;

import org.courrier.dao.CompteRepository;
import org.courrier.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	CompteRepository compteRepository;

	@Override
	public Compte addCompte(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public Compte getCompte(Long idCompte) {
		return compteRepository.findOne(idCompte);
	}

	@Override
	public List<Compte> allComptes() {
		return compteRepository.findAll();
	}

	@Override
	public Compte updateCompte(Compte compte) {
		return compteRepository.saveAndFlush(compte);
	}

	@Override
	public boolean deleteCompte(Long idCompte) {
		compteRepository.delete(idCompte);
		return true;
	}

}
