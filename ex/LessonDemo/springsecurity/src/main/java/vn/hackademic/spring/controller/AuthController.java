/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author haopv
 */
@Controller
@RequestMapping(value="/auth")
public class AuthController {
    
    @RequestMapping(value="/login")
    public String signin(@RequestParam(required=false) boolean error,ModelMap m){
        if(error) m.put("error", error);
        return "layout.user.login";
    }
    
    @RequestMapping(value="/user-list")
    public String getlistUser(){
        return "layout.user.list";
    }
    
    @RequestMapping(value="/user/{id}")
    public String getUserDetail(@PathVariable String id, ModelMap m){
        m.put("title","Chi tiet tai khoan");
        m.put("userId",id);
        
        return "layout.user.detail";
    }
    
}
