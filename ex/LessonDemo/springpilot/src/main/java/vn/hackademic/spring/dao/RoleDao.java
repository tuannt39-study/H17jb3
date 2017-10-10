/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.dao;

import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.hackademic.spring.bean.Role;
import vn.hackademic.spring.bean.Users;

/**
 *
 * @author haopv
 */
@Repository
public class RoleDao {
    @Autowired
    //@Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
    
    protected Session getSessionFactory() {
		return this.sessionFactory.getCurrentSession();
	}
    
    public Role getRoleById(int id){
       return (Role) sessionFactory.getCurrentSession().createCriteria(Role.class)
               .add(Restrictions.eq("ROLE_ID", id))
               .uniqueResult();
    }
    
    
}
