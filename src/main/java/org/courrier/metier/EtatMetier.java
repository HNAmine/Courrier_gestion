package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Etat;

public interface EtatMetier {
	public Etat addEtat(Etat etat);

	public Etat getEtat(Long idEtat);

	public List<Etat> allEtats();

	public Etat updateEtat(Etat etat);

	public boolean deleteEtat(Long idEtat);
}
