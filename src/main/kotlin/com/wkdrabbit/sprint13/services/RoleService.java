package com.wkdrabbit.sprint13.services;

import com.wkdrabbit.sprint13.models.Role;

import java.util.List;

public interface RoleService
{
    List<Role> findAll();

    Role findRoleById(long id);

    void delete(long id);

    Role save(Role role);
}