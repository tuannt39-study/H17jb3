/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author haopv
 */
@Controller
@RequestMapping(value = "")
public class Home {
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap m){
        return "home";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home(ModelMap m){
        return "home";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/product")
    public String product(ModelMap m){
        return "product.list";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/product/add")
    public String productAdd(ModelMap m){
        return "product.add";
    }
}
