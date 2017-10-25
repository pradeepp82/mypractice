package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Save {

	 public static void main(String[] args) {
		
		 AnnotationConfiguration acfg = new AnnotationConfiguration();
		 acfg.configure();
		 SessionFactory sf = acfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 Categories c1 = new Categories();
		 c1.setCategoryName("cat 1");
		 
		 Categories c2 = new Categories();
		 c2.setCategoryName("cat 2");
		 
		 
		 Item i1 = new Item();
		 i1.setItemName("it 1");
		 
		 Set   s = new HashSet();
		 
		 s.add(i1);
		 
		 c1.setItems(s);
		 c2.setItems(s);
		 session.save(c1);
		 session.save(c2);
		 tx.commit();
	}
}
