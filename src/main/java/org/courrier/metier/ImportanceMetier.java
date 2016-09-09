package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Importance;

public interface ImportanceMetier {
	public Importance addImportance(Importance importance);

	public Importance getImportance(Long idImportance);

	public List<Importance> allImportances();

	public Importance updateImportance(Importance importance);

	public boolean deleteImportance(Long idImportance);
}
