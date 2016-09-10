package org.courrier.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employe_affectation_courrier")
public class Affecter implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "employe_id")
	private Employe employe;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "courrier_id")
	private Courrier courrier;
	
	@Column(name = "affectation_date")
	private Date affectationDate;

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Courrier getCourrier() {
		return courrier;
	}

	public void setCourrier(Courrier courrier) {
		this.courrier = courrier;
	}

	public Date getAffectationDate() {
		return affectationDate;
	}

	public void setAffectationDate(Date affectationDate) {
		this.affectationDate = affectationDate;
	}
	

}
