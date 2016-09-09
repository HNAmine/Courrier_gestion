package org.courrier.services;

import java.util.List;

import org.courrier.entities.Contact;
import org.courrier.metier.ContactMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestService {

	@Autowired
	private ContactMetier ContactMetier;

	@RequestMapping(value = "/contacts", method = RequestMethod.POST)
	public Contact addContact(@RequestBody Contact Contact) {
		return ContactMetier.addContact(Contact);
	}

	@RequestMapping(value = "/contacts/{idContact}", method = RequestMethod.GET)
	public Contact getContact(@PathVariable Long idContact) {
		return ContactMetier.getContact(idContact);
	}

	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public List<Contact> allContacts() {
		return ContactMetier.allContacts();
	}

	@RequestMapping(value = "/contacts/{idContact}", method = RequestMethod.DELETE)
	public boolean deleteContact(@PathVariable Long idContact) {
		return ContactMetier.deleteContact(idContact);
	}

	@RequestMapping(value = "/contacts", method = RequestMethod.PUT)
	public Contact updateContact(@RequestBody Contact Contact) {
		return ContactMetier.updateContact(Contact);
	}
}
