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
@RequestMapping(value = "/xuly")
public class Xuly {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "form";
    }
}
