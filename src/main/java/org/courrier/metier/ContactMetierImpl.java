package org.courrier.metier;

import java.util.List;

import org.courrier.dao.ContactRepository;
import org.courrier.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMetierImpl implements ContactMetier {
	@Autowired
	ContactRepository ContactRepository;

	@Override
	public Contact addContact(Contact Contact) {
		return ContactRepository.save(Contact);
	}

	@Override
	public Contact getContact(Long idContact) {
		return ContactRepository.findOne(idContact);
	}

	@Override
	public List<Contact> allContacts() {
		return ContactRepository.findAll();
	}

	@Override
	public Contact updateContact(Contact Contact) {
		return ContactRepository.saveAndFlush(Contact);
	}

	@Override
	public boolean deleteContact(Long idContact) {
		ContactRepository.delete(idContact);
		return true;
	}

}
