package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Service;

public interface ServiceMetier {
	public Service addService(Service service);

	public Service getService(Long idService);

	public Long countServices();

	public List<Service> allService();

	public Service updateService(Service service);

	public boolean deleteService(Long idService);

	public boolean deleteAllServices();
}
