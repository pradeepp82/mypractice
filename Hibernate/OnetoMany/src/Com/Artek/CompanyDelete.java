package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanyDelete {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
//Transaction tx = session.getTransaction();
   Object o =session.get(Company.class, new Integer(2));
   Company v =(Company)o;
   System.out.println(v.getCompanyName());
    Set s = v.getChildren();
     
    
    for(Object o1:s){
    	
       Employee e = (Employee)o1;
       int id = e.getEmployeeid();
       System.out.println(id);
       if(e.getEmployeeid()==5){
    	   System.out.println(e.getEmployeeName());
    	     s.remove(e);
           session.delete(e);
           break;
           
                
       }
          
    }
       Transaction tx = session.beginTransaction();
      session.update(v);
        tx.commit();
        session.close();
  	   
		 
    
   
  
   
}
}