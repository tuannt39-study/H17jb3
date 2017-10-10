/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.hackademic.spring.bean.Role;
import vn.hackademic.spring.bean.Users;
import vn.hackademic.spring.dao.RoleDao;
import vn.hackademic.spring.dao.UserDao;

/**
 *
 * @author haopv
 */
@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleDao  roleDao;
    
    public Role getRole(int id){
        return roleDao.getRoleById(id);
    }
    
}
