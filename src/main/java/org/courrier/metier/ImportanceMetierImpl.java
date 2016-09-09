package org.courrier.metier;

import java.util.List;

import org.courrier.dao.ImportanceRepository;
import org.courrier.entities.Importance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImportanceMetierImpl implements ImportanceMetier {

	@Autowired
	ImportanceRepository importanceRepository;

	@Override

	public Importance addImportance(Importance importance) {
		return importanceRepository.save(importance);
	}

	@Override
	public Importance getImportance(Long idImportance) {
		return importanceRepository.findOne(idImportance);
	}

	@Override
	public List<Importance> allImportances() {
		return importanceRepository.findAll();
	}

	@Override
	public Importance updateImportance(Importance importance) {
		return importanceRepository.saveAndFlush(importance);
	}

	@Override
	public boolean deleteImportance(Long idImportance) {
		importanceRepository.delete(idImportance);
		return true;
	}

}
