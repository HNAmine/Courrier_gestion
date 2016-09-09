package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Division implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDivision;
	private String label;

	@OneToMany(mappedBy = "division")
	private Collection<Service> services;

	public Division(Long idDivision, String label) {
		super();
		this.idDivision = idDivision;
		this.label = label;
	}

	public Division(String label) {
		super();
		this.label = label;
	}

	public Division() {
		super();
	}

	public Long getIdDivision() {
		return idDivision;
	}

	public void setIdDivision(Long idDivision) {
		this.idDivision = idDivision;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Collection<Service> getServices() {
		return services;
	}

	public void setServices(Collection<Service> services) {
		this.services = services;
	}

}
