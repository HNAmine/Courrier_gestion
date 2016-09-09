package org.courrier.metier;

import java.util.List;

import org.courrier.dao.ServiceRepository;
import org.courrier.entities.Service;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceMetierImpl implements ServiceMetier {

	@Autowired
	ServiceRepository serviceRepository;

	@Override
	public Service addService(Service service) {
		return this.serviceRepository.save(service);
	}

	@Override
	public Service getService(Long idService) {
		return this.serviceRepository.findOne(idService);
	}

	@Override
	public List<Service> allService() {
		return this.serviceRepository.findAll();
	}

	@Override
	public Service updateService(Service service) {
		return this.serviceRepository.saveAndFlush(service);
	}

	@Override
	public boolean deleteService(Long idService) {
		this.serviceRepository.delete(idService);
		return true;
	}

	@Override
	public boolean deleteAllServices() {
		this.serviceRepository.deleteAllInBatch();
		return true;
	}

	@Override
	public Long countServices() {
		return this.serviceRepository.count();
	}

}
