package org.courrier.metier;

import java.util.List;

import org.courrier.dao.DivisionRepository;
import org.courrier.entities.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DivisionMetierImpl implements DivisionMetier {

	@Autowired
	DivisionRepository divisionRepository;

	@Override
	public Division addDivision(Division division) {
		return divisionRepository.save(division);
	}

	@Override
	public Division getDivision(Long idDivision) {
		return divisionRepository.findOne(idDivision);
	}

	@Override
	public List<Division> allDivisions() {
		return divisionRepository.findAll(new Sort(Sort.Direction.DESC, "label"));
	}

	@Override
	public Division updateDivision(Division division) {
		return divisionRepository.saveAndFlush(division);
	}

	@Override
	public boolean deleteDivision(Long idDivision) {
		divisionRepository.delete(idDivision);
		return true;
	}

	@Override
	public boolean deleteAllDivisions() {
		divisionRepository.deleteAllInBatch();
		return true;
	}

}
