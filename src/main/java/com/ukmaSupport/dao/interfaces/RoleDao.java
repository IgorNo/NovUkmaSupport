package com.ukmaSupport.dao.interfaces;


import com.ukmaSupport.models.Role;

public interface RoleDao {

    Role getById(int id);

    int save(Role role);

    void delete(int id);

    void delete(Role role);
}
