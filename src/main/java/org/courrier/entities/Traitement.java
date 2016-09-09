package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Traitement implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTraitement;
	private String label;
	private String lienDoc;

	@ManyToMany(mappedBy = "traitements", fetch = FetchType.LAZY)
	private Collection<CourrierArriver> courriers;

	protected Traitement() {
		super();
	}

	protected Traitement(Long idTraitement, String label, String lienDoc) {
		super();
		this.idTraitement = idTraitement;
		this.label = label;
		this.lienDoc = lienDoc;
	}

	protected Traitement(String label, String lienDoc) {
		super();
		this.label = label;
		this.lienDoc = lienDoc;
	}

	public Long getIdTraitement() {
		return idTraitement;
	}

	public void setIdTraitement(Long idTraitement) {
		this.idTraitement = idTraitement;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLienDoc() {
		return lienDoc;
	}

	public void setLienDoc(String lienDoc) {
		this.lienDoc = lienDoc;
	}

}
