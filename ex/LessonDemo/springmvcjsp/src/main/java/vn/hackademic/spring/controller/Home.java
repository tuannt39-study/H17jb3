/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author haopv
 */
@Controller
@RequestMapping(value = "/")
public class Home {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap m){
        m.addAttribute("name", "lop java");
        m.put("name2", "Nguyen Van A");
        Date dMow = new Date();
        m.put("dMow", dMow);
        return "demojsp";
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public String signin(ModelMap m, @RequestParam(value = "name", defaultValue = "") String username){
        System.out.println("===> "+username);
        m.put("name", username);
        return "demojsp";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/login")
    public String signinGet(ModelMap m){
        return "login";
    }
}

