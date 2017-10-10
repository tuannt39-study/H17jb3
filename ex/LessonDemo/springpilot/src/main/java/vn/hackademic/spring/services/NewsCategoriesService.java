/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.hackademic.spring.bean.NewsCategories;
import vn.hackademic.spring.bean.Users;
import vn.hackademic.spring.dao.NewsCategoriesDao;

/**
 *
 * @author haopv
 */
@Service
@Transactional
public class NewsCategoriesService {
    @Autowired
    private NewsCategoriesDao  newsCatDao;
    
    public List<NewsCategories> getListNewsCat(){
        return newsCatDao.getListNewsCat();
    }
    
    
    
}
