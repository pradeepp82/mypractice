package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Insert_manager {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		 
				
		Manager m1 = new Manager();
		m1.setManagerName("ramlal");
	
        
		Manager m2 = new Manager();
		m2.setManagerName("sitaram");
		
		Event e1 = new Event();
		e1.setEventName("pp");
		e1.setM(m1);
		
		Event e2 = new Event();
		e2.setEventName("rp");
        e2.setM(m2);
		
		Set s = new HashSet();
		
		 session.save(e1);
		 session.save(e2);
		tx.commit();
		session.close();
	}
}