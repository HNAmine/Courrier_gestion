package org.courrier.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("CA")
public class CourrierArriver extends Courrier {

	private static final long serialVersionUID = 1L;
	private Long numBO;
	private Long numDAS;
	private Date dateReception;
	private Date dateEcheance;

	@ManyToOne
	@JoinColumn(name = "CODE_ETAT")
	private Etat etat;

	@ManyToOne
	@JoinColumn(name = "CODE_IMPORTANCE")
	private Importance importance;

	@ManyToMany
	@JoinTable(name = "COURRIER_ARRIVER_INSTRUCTION")
	private Collection<Instruction> instructions;

	@ManyToMany
	@JoinTable(name = "COURRIER_ARRIVER_TRAITEMENT")
	private Collection<Traitement> traitements;

	@ManyToOne
	private Contact emetteur;
	
	public CourrierArriver() {
		super();
	}

	public Long getNumBO() {
		return numBO;
	}

	public void setNumBO(Long numBO) {
		this.numBO = numBO;
	}

	public Long getNumDAS() {
		return numDAS;
	}

	public void setNumDAS(Long numDAS) {
		this.numDAS = numDAS;
	}

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public Importance getImportance() {
		return importance;
	}

	public void setImportance(Importance importance) {
		this.importance = importance;
	}

	public Collection<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(Collection<Instruction> instructions) {
		this.instructions = instructions;
	}

	public Collection<Traitement> getTraitements() {
		return traitements;
	}

	public void setTraitements(Collection<Traitement> traitements) {
		this.traitements = traitements;
	}

	public Contact getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Contact emetteur) {
		this.emetteur = emetteur;
	}

}
