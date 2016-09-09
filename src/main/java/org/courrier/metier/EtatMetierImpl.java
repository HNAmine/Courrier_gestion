package org.courrier.metier;

import java.util.List;

import org.courrier.dao.EtatRepository;
import org.courrier.entities.Etat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtatMetierImpl implements EtatMetier {
	@Autowired
	EtatRepository etatRepository;

	@Override
	public Etat addEtat(Etat etat) {
		return etatRepository.save(etat);
	}

	@Override
	public Etat getEtat(Long idEtat) {
		return etatRepository.findOne(idEtat);
	}

	@Override
	public List<Etat> allEtats() {
		return etatRepository.findAll();
	}

	@Override
	public Etat updateEtat(Etat etat) {
		return etatRepository.saveAndFlush(etat);
	}

	@Override
	public boolean deleteEtat(Long idEtat) {
		etatRepository.delete(idEtat);
		return true;
	}

}
