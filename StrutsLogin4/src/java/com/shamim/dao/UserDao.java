package com.shamim.dao;

import com.shamim.pojo.User;
import com.shamim.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shamim
 */
public class UserDao {
    
    public static int saveUser(User u){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        int i = (Integer)session.save(u);
        
        session.getTransaction().commit();
        session.close();
        
        return i;
    }
    
    public static int validate(User u){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        String hql = "from User where username=:username and password=:password";
        
        Query q = session.createQuery(hql);
        q.setString("username", u.getUsername());
        q.setString("password", u.getPassword());
        
        List list = q.list();
        int i = list.size();
        
        session.getTransaction().commit();
        session.close();
        
        return i;
    }
}
