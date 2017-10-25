package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class delete {

	 public static void main(String[] args) {
		
		 AnnotationConfiguration acfg = new AnnotationConfiguration();
		 acfg.configure();
		 SessionFactory sf = acfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		   Item i = new Item();
		   i.setItemid(1);
		   
		   session.delete(i);
		  
		 tx.commit();
	}
}
