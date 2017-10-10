/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.hackademic.spring.bean.NewsCategories;
import vn.hackademic.spring.bean.Users;

/**
 *
 * @author haopv
 */
@Repository
public class NewsCategoriesDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSessionFactory() {
		return this.sessionFactory.getCurrentSession();
	}

    public List<NewsCategories> getListNewsCat(){
        List list =  sessionFactory.getCurrentSession().createCriteria(NewsCategories.class)
                .list();
       return list;
    }
    
    
}
