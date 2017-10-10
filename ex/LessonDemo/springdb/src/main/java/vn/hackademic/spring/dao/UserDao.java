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
import vn.hackademic.spring.bean.Users;

/**
 *
 * @author haopv
 */
@Repository
public class UserDao {
    @Autowired
    //@Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
    
    protected Session getSessionFactory() {
		return this.sessionFactory.getCurrentSession();
	}
    
    public List<Users> getListUsers(){
        String query = "select * from Users";
        List list =  sessionFactory.getCurrentSession().createSQLQuery(query).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
       return list;
    }
    
    public List<Users> getListUsersByCriteria(){
        
        List list =  sessionFactory.getCurrentSession().createCriteria(Users.class).list();
       return list;
    }
    
    public List<Users> getListUsersByRole(Integer idRole){
        List list =  sessionFactory.getCurrentSession().createCriteria(Users.class)
                .createAlias("role", "role", JoinType.LEFT_OUTER_JOIN)
                .add(Restrictions.eq("role.ROLE_ID", idRole))
                .list();
       return list;
    }
    
    public List<Users> getListUsersByName(String name){
        List list =  sessionFactory.getCurrentSession().createCriteria(Users.class)
                .createAlias("role", "role", JoinType.LEFT_OUTER_JOIN)
                .add(Restrictions.or(
                        Restrictions.ilike("username", name, MatchMode.ANYWHERE),
                        Restrictions.ilike("name", name, MatchMode.ANYWHERE),
                        Restrictions.ilike("email", name, MatchMode.ANYWHERE)
                    )
                )
                .list();
       return list;
    }

    
}
