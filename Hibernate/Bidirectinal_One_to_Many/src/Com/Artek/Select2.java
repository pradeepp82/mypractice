package Com.Artek;

import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Select2 {
	public static void main(String[] args) {
	   
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 Object o = (Object)s.get(Vendor.class, 3);
		 Vendor v = (Vendor)o;
		 System.out.println("vendor name :"+v.getVendorname());
		    Set s1= v.getChildren();

		     for(Object o1:s1){
		    	 Customer c =(Customer)o1;
		    	 System.out.println("customer name"+": "+c.getCustomername());
		    	 
		     }
		  		     
		  
	}       

}
