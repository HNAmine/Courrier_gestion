package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Service implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idService;
	private String label;

	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
	private Collection<Employe> employes;

	@ManyToOne
	@JoinColumn(name = "CODE_DEVISION")
	private Division division;

	public Service(Long idService, String label) {
		super();
		this.idService = idService;
		this.label = label;
	}

	public Service(String label) {
		super();
		this.label = label;
	}

	public Service() {
		super();
	}

	@JsonIgnore
	public Collection<Employe> getEmployes() {
		return employes;
	}

	@JsonSetter
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}

	public Long getIdService() {
		return idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

}
