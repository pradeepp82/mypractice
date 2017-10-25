package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Save {
  public static void main(String[] args) {
	   AnnotationConfiguration acfg = new AnnotationConfiguration();
	   acfg.configure();
	   SessionFactory sf =acfg.buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction tx = session.beginTransaction();
	   
	   Vendor v = new Vendor();
	   v.setVendorname("dilip buildcom");
	   
	   Customers c1 =new Customers();
	   c1.setCustomername("ratan tata");
	   c1.setParent(v);
	   
	   Customers c2 = new Customers();
	   c2.setCustomername("aditya birla");
	   c2.setParent(v);
	   
	   session.save(c1);
	   tx.commit();
	   session.close();
}
}
