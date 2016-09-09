package org.courrier.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("CD")
public class CourrierDepart extends Courrier {

	private static final long serialVersionUID = 1L;
	private Long numEnvoi;
	private Date dateEnvoi;

	@ManyToMany
	private Collection<Contact> destinataires;

	public CourrierDepart() {
		super();
	}

	public CourrierDepart(Long idCourrier, String object, String observation, String lienImage) {
		super(idCourrier, object, observation, lienImage);
	}

	public CourrierDepart(String object, String observation, String lienImage) {
		super(object, observation, lienImage);
	}

	public CourrierDepart(Long idCourrier, String object, String observation, String lienImage, Long numEnvoi,
			Date dateEnvoi) {
		super(idCourrier, object, observation, lienImage);
		this.numEnvoi = numEnvoi;
		this.dateEnvoi = dateEnvoi;
	}

	public CourrierDepart(String object, String observation, String lienImage, Long numEnvoi, Date dateEnvoi) {
		super(object, observation, lienImage);
		this.numEnvoi = numEnvoi;
		this.dateEnvoi = dateEnvoi;
	}

	public Long getNumEnvoi() {
		return numEnvoi;
	}

	public void setNumEnvoi(Long numEnvoi) {
		this.numEnvoi = numEnvoi;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public Collection<Contact> getDestinataires() {
		return destinataires;
	}

	public void setDestinataires(Collection<Contact> destinataires) {
		this.destinataires = destinataires;
	}

}
