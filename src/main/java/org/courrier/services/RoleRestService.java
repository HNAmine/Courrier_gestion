package org.courrier.services;

import java.util.List;

import org.courrier.entities.Role;
import org.courrier.metier.RoleMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleRestService {
	@Autowired
	private RoleMetier roleMetier;

	@RequestMapping(value = "/roles", method = RequestMethod.POST)
	public Role addRole(@RequestBody Role role) {
		return roleMetier.addRole(role);
	}

	@RequestMapping(value = "/roles/{idRole}", method = RequestMethod.GET)
	public Role getRole(@PathVariable Long idRole) {
		return roleMetier.getRole(idRole);
	}

	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public List<Role> allRoles() {
		return roleMetier.allRoles();
	}

	@RequestMapping(value = "/roles/{idRole}", method = RequestMethod.DELETE)
	public boolean deleteRole(@PathVariable Long idRole) {
		return roleMetier.deleteRole(idRole);
	}

	@RequestMapping(value = "/roles", method = RequestMethod.PUT)
	public Role updateDivision(@RequestBody Role role) {
		return roleMetier.updateRole(role);
	}
}
