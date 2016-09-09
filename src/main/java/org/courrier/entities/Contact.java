package org.courrier.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContact;
	private String nomContact;
	private String adresseContact;
	private String telContact;
	private String email;
	private String fax;

	public Contact() {
		super();
	}

	public Contact(Long idnomContact, String nomContact, String adresseContact, String telContact, String email,
			String fax) {
		super();
		this.idContact = idnomContact;
		this.nomContact = nomContact;
		this.adresseContact = adresseContact;
		this.telContact = telContact;
		this.email = email;
		this.fax = fax;
	}

	public Contact(String nomContact, String adresseContact, String telContact, String email, String fax) {
		super();
		this.nomContact = nomContact;
		this.adresseContact = adresseContact;
		this.telContact = telContact;
		this.email = email;
		this.fax = fax;
	}

	public Long getIdContact() {
		return idContact;
	}

	public void setIdContact(Long idContact) {
		this.idContact = idContact;
	}

	public String getNomContact() {
		return nomContact;
	}

	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}

	public String getAdresseContact() {
		return adresseContact;
	}

	public void setAdresseContact(String adresseContact) {
		this.adresseContact = adresseContact;
	}

	public String getTelContact() {
		return telContact;
	}

	public void setTelContact(String telContact) {
		this.telContact = telContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}
