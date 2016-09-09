package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Employe;

public interface EmployeMetier {
	public Employe addEmploye(Employe employe);

	public Employe getEmploye(Long idEmploye);

	public List<Employe> allEmployes();

	public Employe updateEmploye(Employe employe);

	public boolean deleteEmploye(Long idEmploye);

	public boolean deleteAllEmployes();
}
