/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.hackademic.spring.bean.Role;
import vn.hackademic.spring.bean.Users;
import vn.hackademic.spring.dao.RoleDao;
import vn.hackademic.spring.services.RoleService;
import vn.hackademic.spring.services.UserService;

/**
 *
 * @author haopv
 */
@Controller
@RequestMapping(value="/auth")
public class AuthController {
    @Autowired
    //@Qualifier("userService")
    private UserService userService;
    
    @Autowired
    private RoleService roleService;
    
    @RequestMapping(value="/login")
    public String signin(@RequestParam(required=false) boolean error,ModelMap m){
        if(error) m.put("error", error);
        return "layout.user.login";
    }
    
    @RequestMapping(value="/user-list")
    public String getlistUser(ModelMap m){
        List<Users> listUsers = userService.getListUser();
        List<Users> listUserByCriteria = userService.getListUserByCriteria();
        //List<Users> listUserByRole = userService.getListUserByRole(1);// Danh sach user có ROlE id là 1
        List<Users> listUserByRole = userService.getListUserByName("hao");// Danh sach user có ROlE id là 1
        //System.out.println(" size: "+ listUsers.size());
        m.put("listUsers", listUsers);
        m.put("listUserByCriteria", listUserByCriteria);
        m.put("listUserByRole", listUserByRole);
        return "layout.user.list";
    }
    
    @RequestMapping(value="/user/{id}")
    public String getUserDetail(@PathVariable String id, ModelMap m){
        m.put("title","Chi tiet tai khoan");
        m.put("userId",id);
        
        return "layout.user.detail";
    }
    
    @RequestMapping(value="/useradd")
    public String userAdd(){
         Users usr = new Users();
         Role role = roleService.getRole(1);
         usr.setID(7l);
         usr.setVersion(1);
         usr.setName("tai khoan moi");
         usr.setUsername("taikhoan");
         usr.setEmail("user@gmail.com");
         usr.setMobile("098888888");
         usr.setAddress("Ha noi");
         usr.setPassword("rueotruto");
         usr.setRole(role);
         
        userService.addUser(usr);
        
        return "layout.user.add";
    }
    
}
