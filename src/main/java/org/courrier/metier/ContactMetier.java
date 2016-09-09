package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Contact;

public interface ContactMetier {
	public Contact addContact(Contact Contact);

	public Contact getContact(Long idContact);

	public List<Contact> allContacts();

	public Contact updateContact(Contact Contact);

	public boolean deleteContact(Long idContact);
}
