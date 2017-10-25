package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select {
	public static void main(String[] args) {
	   
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 Object o = (Object)s.get(Customer.class, 1);
		 Customer c = (Customer)o;
		 
		 System.out.println("customer name :"+c.getCustomername());
		    Vendor v  =c.getParentobject();
	        System.out.println("vendor name :"+v.getVendorname());
	        
	        s.close();
	        sf.close();
	}
          
}
