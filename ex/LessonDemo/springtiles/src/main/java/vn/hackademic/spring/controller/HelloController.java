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
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author haopv
 */
@Controller 
@RequestMapping(value = "/hello")
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap m){
        m.addAttribute("name", "lop java");
        m.put("name2", "Nguyen Van A");
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/hello/{noidung}")
    public String hello(ModelMap m,@PathVariable(value = "noidung") String nd){
        m.put("nd",nd);
        return "hello";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/sum/{a}/{b}")
    public String sum(ModelMap m, @PathVariable(value = "a") int a1,
            @PathVariable(value = "b") int a2){
        m.put("tong", (double)a1/a2);
        return "sum";
    }
}
