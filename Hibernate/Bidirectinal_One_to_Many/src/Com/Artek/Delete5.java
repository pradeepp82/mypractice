package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Delete5 {
	
	public static void main(String[] args) {
		
		  Configuration cfg = new Configuration();
		   cfg.configure();
		   
		   SessionFactory sf = cfg.buildSessionFactory();
		   Session session = sf.openSession();
		   Transaction tx = session.beginTransaction();
		   
		   Object o = (Object)session.get(Vendor.class, 4);
           Vendor v = (Vendor)o;
           System.out.println(v.getVendorname());
           Set s = v.getChildren();
           Customer c=null;
           for(Object o1:s){
        	   c = (Customer)o1;
        	  
        	  System.out.println(c.getCustomerid());
        	  if(c.getCustomerid()==3){
        		  System.out.println("pp");
        		  s.remove(c);
        		  //break;
        		         
        		  
        	  }
        	  
           }         
           System.out.println("pppppp");
           //s.remove(c);
 		  session.update(v);
           
           tx.commit();
           
           
           
           
		   
		   
	}

}
