package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class save {
   public static void main(String[] args) {
	
	    AnnotationConfiguration acf = new AnnotationConfiguration();
	    acf.configure();
	    
	    SessionFactory sf = acf.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Product p = new Product();
	    
	    p.setProName("sev-dhani");
	    p.setPrice(55);
	    
	    Transaction tx = session.beginTransaction();
	    session.save(p);
	    tx.commit();
}
}