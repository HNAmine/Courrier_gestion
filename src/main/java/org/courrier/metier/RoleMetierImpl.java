package org.courrier.metier;

import java.util.List;

import org.courrier.dao.RoleRepository;
import org.courrier.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMetierImpl implements RoleMetier {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role getRole(Long idRole) {
		return roleRepository.findOne(idRole);
	}

	@Override
	public List<Role> allRoles() {
		return roleRepository.findAll();
	}

	@Override
	public Role updateRole(Role role) {
		return roleRepository.saveAndFlush(role);
	}

	@Override
	public boolean deleteRole(Long idRole) {
		roleRepository.delete(idRole);
		return true;
	}

}
