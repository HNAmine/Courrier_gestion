package org.courrier.metier;

import java.util.List;

import org.courrier.dao.TraitementRepository;
import org.courrier.entities.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraitementMetierImpl implements TraitementMetier {
	@Autowired
	TraitementRepository TraitementRepository;

	@Override
	public Traitement addTraitement(Traitement Traitement) {
		return TraitementRepository.save(Traitement);
	}

	@Override
	public Traitement getTraitement(Long idTraitement) {
		return TraitementRepository.findOne(idTraitement);
	}

	@Override
	public List<Traitement> allTraitements() {
		return TraitementRepository.findAll();
	}

	@Override
	public Traitement updateTraitement(Traitement Traitement) {
		return TraitementRepository.saveAndFlush(Traitement);
	}

	@Override
	public boolean deleteTraitement(Long idTraitement) {
		TraitementRepository.delete(idTraitement);
		return true;
	}

}
