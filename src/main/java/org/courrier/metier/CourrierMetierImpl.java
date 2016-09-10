package org.courrier.metier;

import java.util.List;

import org.courrier.dao.CourrierRepository;
import org.courrier.entities.Courrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourrierMetierImpl implements CourrierMetier {
	@Autowired
	CourrierRepository CourrierRepository;

	@Override
	public Courrier addCourrier(Courrier Courrier) {
		return CourrierRepository.save(Courrier);
	}

	@Override
	public Courrier getCourrier(Long idCourrier) {
		return CourrierRepository.findOne(idCourrier);
	}

	@Override
	public List<Courrier> allCourriers() {
		return CourrierRepository.findAll();
	}

	@Override
	public Courrier updateCourrier(Courrier Courrier) {
		return CourrierRepository.saveAndFlush(Courrier);
	}

	@Override
	public boolean deleteCourrier(Long idCourrier) {
		CourrierRepository.delete(idCourrier);
		return true;
	}

}
