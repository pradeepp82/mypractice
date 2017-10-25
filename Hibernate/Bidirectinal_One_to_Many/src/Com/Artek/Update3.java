package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Update3 {
	public static void main(String[] args) {
	   
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 Object o = (Object)s.get(Vendor.class, 19);
             Vendor c =(Vendor)o;
	     System.out.println(c.getVendorname());
	     System.out.println("GOING TO UPDATE");
	         c.setVendorname("SITARAM JI BHATANYA");
	         System.out.println(c.getVendorname());

	         s.update(c);
		    tx.commit();
 
		    s.close();
		    sf.close();    
		 
		  	
	}

}
