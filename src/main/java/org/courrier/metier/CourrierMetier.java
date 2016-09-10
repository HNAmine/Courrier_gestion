package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Courrier;

public interface CourrierMetier {
	public Courrier addCourrier(Courrier Courrier);

	public Courrier getCourrier(Long idCourrier);

	public List<Courrier> allCourriers();

	public Courrier updateCourrier(Courrier Courrier);

	public boolean deleteCourrier(Long idCourrier);
}
