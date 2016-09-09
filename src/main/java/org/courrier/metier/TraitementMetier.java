package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Traitement;

public interface TraitementMetier {
	public Traitement addTraitement(Traitement Traitement);

	public Traitement getTraitement(Long idTraitement);

	public List<Traitement> allTraitements();

	public Traitement updateTraitement(Traitement Traitement);

	public boolean deleteTraitement(Long idTraitement);
}
