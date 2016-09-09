package org.courrier.services;

import java.util.List;

import org.courrier.entities.Service;
import org.courrier.metier.ServiceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRestService {
	@Autowired
	private ServiceMetier serviceMetier;

	@RequestMapping(value = "/services", method = RequestMethod.POST)
	public Service addService(@RequestBody Service service) {
		return serviceMetier.addService(service);
	}

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public List<Service> allService() {
		return serviceMetier.allService();
	}

	@RequestMapping(value = "/services/{idService}", method = RequestMethod.GET)
	public Service getDivision(@PathVariable Long idService) {
		return serviceMetier.getService(idService);
	}

	@RequestMapping(value = "/services/total", method = RequestMethod.GET)
	public Long countServices() {
		return serviceMetier.countServices();
	}

	@RequestMapping(value = "/services/{idService}", method = RequestMethod.DELETE)
	public boolean deleteService(@PathVariable Long idService) {
		return serviceMetier.deleteService(idService);
	}

	@RequestMapping(value = "/services", method = RequestMethod.DELETE)
	public boolean deleteAllServices() {
		return serviceMetier.deleteAllServices();
	}

	@RequestMapping(value = "/services", method = RequestMethod.PUT)
	public Service updateDivision(@RequestBody Service service) {
		return serviceMetier.updateService(service);
	}
}
