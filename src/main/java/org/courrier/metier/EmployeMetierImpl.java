package org.courrier.metier;

import java.util.List;

import org.courrier.dao.EmployeRepository;
import org.courrier.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeMetierImpl implements EmployeMetier {

	@Autowired
	EmployeRepository employeRepository;

	@Override
	public Employe addEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public Employe getEmploye(Long idEmploye) {
		return employeRepository.findOne(idEmploye);
	}

	@Override
	public List<Employe> allEmployes() {
		return employeRepository.findAll();
	}

	@Override
	public Employe updateEmploye(Employe employe) {
		return employeRepository.saveAndFlush(employe);
	}

	@Override
	public boolean deleteEmploye(Long idEmploye) {
		employeRepository.delete(idEmploye);
		return true;
	}

	@Override
	public boolean deleteAllEmployes() {
		employeRepository.deleteAllInBatch();
		return true;
	}

}
