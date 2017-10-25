package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class AddChild_through_Parent {
	
	public static void main(String[] args) {
		
		  Configuration cfg = new Configuration();
		   cfg.configure();
		   
		   SessionFactory sf = cfg.buildSessionFactory();
		   Session session = sf.openSession();
		   Transaction tx = session.beginTransaction();
		   
		   Object o = (Object)session.get(Vendor.class, 1);
           Vendor v = (Vendor)o;
           System.out.println(v.getVendorname());
           Set s = v.getChildren();
           Customer c = new Customer();
           c.setCustomername("pradeep");
           s.add(c);
           session.update(v);
           tx.commit();
           
           
           
		   
		   
	}

}
