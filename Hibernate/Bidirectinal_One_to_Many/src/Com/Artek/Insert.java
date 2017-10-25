package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Insert {
   public static void main(String[] args) {
	   
	   Configuration cfg = new Configuration();
	   cfg.configure();
	   SessionFactory sf = cfg.buildSessionFactory();
	   Session session = sf.openSession();
	   
	   Transaction tx = session.beginTransaction();
	   
	   Vendor v = new Vendor();
	   
	   v.setVendorname("BHURAJI DOD");
	   
	   
	    Customer c1 = new Customer();
	    c1.setCustomername("RAMESHWAR JI BHAYDIYA");
	    
	    Customer c2 = new Customer();
	    c2.setCustomername("BHAGWAN JI BHAYDIYA");
	    
	    Customer c3 = new Customer();
	    c3.setCustomername("TOTARAM JI BHAYDIYA");

	    
	    //one to many
	    Set s= new HashSet();
	    
	     s.add(c1);
	     s.add(c2);
	     s.add(c3);
	     
	     v.setChildren(s);
	     
	    
	   // many to one
	     
	    c1.setParentobject(v);
	    c2.setParentobject(v);
	    c3.setParentobject(v);
	     
	     
	    // session.save(v);
	     session.save(c1);
	 
	    
	    tx.commit();
	    session.close();
	    sf.close();
   }
}
