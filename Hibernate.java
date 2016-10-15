
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah Kelly
 */
public class Hibernate {
    public static void main(String[] arugs){
       //Object
    	UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("Sarah");
        
       //The Hibernate of everything 
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
       //This is the session for doing stuff
        Session session = sessionFactory.openSession();
        
       //Talks to the database
        session.beginTransaction();
        
       //Exports to database 
        session.save(user);
        
       //Sends it  
        session.getTransaction().commit();
        
       //ends session 
        session.close();
        
        user = null;
       
        //Put stuff in the object from database
        session = sessionFactory.openSession();
        session.beginTransaction();
        user = (UserDetails) session.get(UserDetails.class, 1);
        System.out.println("User Name retrieved is " + user.getUserName());
    }
}
