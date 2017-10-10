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
import vn.hackademic.spring.bean.Users;
import vn.hackademic.spring.dao.UserDao;

/**
 *
 * @author haopv
 */
@Service
@Transactional
//@Component("userService")
public class UserService {
    @Autowired
    private UserDao  userDao;
    
    public List<Users> getListUser(){
        //userDao.getListUsers();
        return userDao.getListUsers();
    }
    
    public List<Users> getListUserByCriteria(){
        return userDao.getListUsersByCriteria();
    }
    
    public List<Users> getListUserByRole(Integer idRole){
        return userDao.getListUsersByRole(idRole);
    }
    public List<Users> getListUserByName(String name){
        return userDao.getListUsersByName(name);
    }
    
    public void addUser(Users usr){
        userDao.addRow(usr);
    }
    
    
}
