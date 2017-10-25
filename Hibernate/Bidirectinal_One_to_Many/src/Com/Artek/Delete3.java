package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Delete3 {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
//Transaction tx = session.getTransaction();
   Object o =session.get(Vendor.class, 1);
   Vendor v =(Vendor)o;
    Set s = v.getChildren();
     
    
    for(Object o1:s){
    	
       Customer e = (Customer)o1;
       int id = e.getCustomerid();
       System.out.println(id);
       if(e.getCustomerid()==19){
    	   System.out.println(e.getCustomername());
    	     s.remove(e);
                
       }
       session.delete(e);
       
       Transaction tx = session.beginTransaction();
       tx.commit();
       session.close();
    }
    
  	   
		 
    
   
  
   
}
}