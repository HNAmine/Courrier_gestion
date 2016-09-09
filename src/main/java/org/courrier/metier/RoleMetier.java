package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Role;

public interface RoleMetier {
	public Role addRole(Role role);

	public Role getRole(Long idRole);

	public List<Role> allRoles();

	public Role updateRole(Role role);

	public boolean deleteRole(Long idRole);
}
