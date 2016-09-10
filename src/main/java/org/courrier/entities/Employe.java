package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
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
public class Employe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String nomEmploye;
	private String telEmploye;

	@OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
	private Collection<Compte> comptes;

	@ManyToOne
	@JoinColumn(name = "CODE_ROLE")
	private Role role;

	@ManyToOne
	@JoinColumn(name = "CODE_SERVICE")
	private Service service;

	@OneToMany(mappedBy = "employe", cascade = CascadeType.ALL)
	private Collection<Affecter> affecters;

	public Collection<Affecter> getAffecters() {
		return affecters;
	}

	public void setAffecters(Collection<Affecter> affecters) {
		this.affecters = affecters;
	}

	protected Employe(String nomEmploye, String telEmploye) {
		super();
		this.nomEmploye = nomEmploye;
		this.telEmploye = telEmploye;
	}

	protected Employe(Long idEmploye, String nomEmploye, String telEmploye) {
		super();
		this.idEmploye = idEmploye;
		this.nomEmploye = nomEmploye;
		this.telEmploye = telEmploye;
	}

	protected Employe() {
		super();
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@JsonIgnore
	public Collection<Compte> getComptes() {
		return comptes;
	}

	@JsonSetter
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getTelEmploye() {
		return telEmploye;
	}

	public void setTelEmploye(String telEmploye) {
		this.telEmploye = telEmploye;
	}

}
