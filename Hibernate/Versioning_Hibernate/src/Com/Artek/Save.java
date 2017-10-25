package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Save {

	
	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 Product p = new Product();
		 p.setProductname("Parle g");
		 p.setPrice(4);
		 
		 session.save(p);
		 tx.commit();
		 session.close();
		 sf.close();
	}
}
