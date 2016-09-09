package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Etat implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEtat;
	private String label;

	@OneToMany(mappedBy = "etat", fetch = FetchType.LAZY)
	private Collection<CourrierArriver> courriers;

	protected Etat(Long idEtat, String label, Collection<CourrierArriver> courriers) {
		super();
		this.idEtat = idEtat;
		this.label = label;
		this.courriers = courriers;
	}

	protected Etat(String label, Collection<CourrierArriver> courriers) {
		super();
		this.label = label;
		this.courriers = courriers;
	}

	protected Etat() {
		super();
	}

	@JsonIgnore
	public Collection<CourrierArriver> getCourriers() {
		return courriers;
	}

	@JsonSetter
	public void setCourriers(Collection<CourrierArriver> courriers) {
		this.courriers = courriers;
	}

	public Long getIdEtat() {
		return idEtat;
	}

	public void setIdEtat(Long idEtat) {
		this.idEtat = idEtat;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
