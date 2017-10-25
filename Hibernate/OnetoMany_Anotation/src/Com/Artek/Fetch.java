package Com.Artek;

 

 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Fetch {
	
	public static void main(String[] args) {
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure();
       SessionFactory sf = acfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       Query q = session.createQuery("from Vendor");
       
       List l = q.list();
       
       for (Object object : l) {
		 Vendor v =(Vendor)object;
		 System.out.println(v.getVendorName());
	}

	}
}