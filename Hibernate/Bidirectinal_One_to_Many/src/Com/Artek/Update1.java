package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Update1 {
	public static void main(String[] args) {
	   
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 Object o = (Object)s.get(Customer.class, 1);
		 Customer c =(Customer)o;
		  System.out.println("Customer name :"+c.getCustomername());
	       Vendor v = c.getParentobject();
	       
	       System.out.println("before update : "+v.getVendorname());
	          v.setVendorname("tikaram daji fuldiya ");
	       s.update(v);
		    tx.commit();
		    System.out.println("After update update :"+v.getVendorname());
		    s.close();
		    sf.close();    
		 
		  	
	}

}
