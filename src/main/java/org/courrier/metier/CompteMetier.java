package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Compte;

public interface CompteMetier {
	public Compte addCompte(Compte compte);

	public Compte getCompte(Long idCompte);

	public List<Compte> allComptes();

	public Compte updateCompte(Compte compte);

	public boolean deleteCompte(Long idCompte);
}
