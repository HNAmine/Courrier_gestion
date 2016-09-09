package org.courrier.services;

import java.util.List;

import org.courrier.entities.Importance;
import org.courrier.metier.ImportanceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportanceRestService {

	@Autowired
	ImportanceMetier ImportanceMetier;

	@RequestMapping(value = "/importances", method = RequestMethod.POST)
	public Importance addImportance(@RequestBody Importance Importance) {
		return ImportanceMetier.addImportance(Importance);
	}

	@RequestMapping(value = "/importances/{idImportance}", method = RequestMethod.GET)
	public Importance getImportance(@PathVariable Long idImportance) {
		return ImportanceMetier.getImportance(idImportance);
	}

	@RequestMapping(value = "/importances", method = RequestMethod.GET)
	public List<Importance> allImportances() {
		return ImportanceMetier.allImportances();
	}

	@RequestMapping(value = "/importances/{idImportance}", method = RequestMethod.DELETE)
	public boolean deleteImportance(@PathVariable Long idImportance) {
		return ImportanceMetier.deleteImportance(idImportance);
	}

	@RequestMapping(value = "/importances", method = RequestMethod.PUT)
	public Importance updateImportance(@RequestBody Importance Importance) {
		return ImportanceMetier.updateImportance(Importance);
	}
}
