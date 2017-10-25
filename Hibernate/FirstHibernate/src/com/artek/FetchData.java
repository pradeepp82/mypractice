    package com.artek;  
      
    import java.util.Iterator;  
    import java.util.List;
    import org.hibernate.cfg.Configuration;  


import org.hibernate.*;  
       
    public class FetchData {  
     public static void main(String[] args) {  
      
       Configuration cfg = new Configuration();   
       cfg.configure("hibernate.cfg.xml");  
        SessionFactory sFactory=cfg.buildSessionFactory();  
        Session session=sFactory.openSession();  
                      
        //Hibernate Named Query  
        Query query = session.getNamedQuery("Emprecord");  
        query.setString("1", "gagan"); 
        query.setString("2", "thakre"); 
              
        List<Employee> employees=query.list();  
              
        Iterator<Employee> itr=employees.iterator();  
         while(itr.hasNext()){  
        Employee e=itr.next();  
        System.out.println(e.getId()+" "+e.getFirstname()+" "+e.getLastname());  
         }  
              
        session.close();  
          
      }  
    }  