/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import vn.hackademic.spring.bean.NewsCategories;
import vn.hackademic.spring.bean.Users;
import vn.hackademic.spring.services.NewsCategoriesService;
import vn.hackademic.spring.services.UserService;

/**
 *
 * @author haopv
 */
@Controller
@RequestMapping(value = "")
public class Home {
    
    
    @Autowired
    private UserService userService;
    @Autowired
    private NewsCategoriesService newCatService;
    
    @ModelAttribute(value = "nav")
    public int nav(){
        return 6;
    }
    @ModelAttribute(value = "newsCats")
    public List<NewsCategories> getListCategories(){
        return newCatService.getListNewsCat();
    }
    
        
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
//        List<NewsCategories> newsCats =  newCatService.getListNewsCat();
//        m.put("newsCats", newsCats);
//        
        return "product.list";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/productdetail")
    public String productDetail(ModelMap m){
//        List<NewsCategories> newsCats =  newCatService.getListNewsCat();
//        m.put("newsCats", newsCats);
        return "product.detailt";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/product/add")
    public String productAdd(ModelMap m){
        return "product.add";
    }
    

    
    @RequestMapping(value="/user-list")
    public String getlistUser(ModelMap m){
        List<Users> listUser = userService.getListUser();
        m.put("listUsers", listUser);
        return "layout.user.list";
    }
}
