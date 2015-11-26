package com.ukmaSupport.beans;

import com.ukmaSupport.dao.impl.RoleDaoImpl;
import com.ukmaSupport.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Igor on 25.11.2015.
 */
@Component
public class TestBeanRole {

    @Autowired
    private RoleDaoImpl roleDao;
    private Role role1 = new Role();
    private Role role2 = new Role();
    private Role role3 = new Role();

    public void test(){
        insert();
        delete();
        insert();
        get();
    }

    private void insert(){
        role1.setRole("ADMIN");
        roleDao.save(role1);

        role2.setRole("USER");
        roleDao.save(role2);

        role3.setRole("ASSIST");
        roleDao.save(role3);
    }

    private void delete(){
        roleDao.delete(role2.getId());
        roleDao.delete(role3);
        roleDao.delete(role1);
    }

    private void get(){
        Role roleGet1 = roleDao.getById(role1.getId());
        Role roleGet2 = roleDao.getById(role2.getId());
        Role roleGet3 = roleDao.getById(role3.getId());
    }

}

