package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Select1 {

	 public static void main(String[] args) {
		
		 AnnotationConfiguration acfg = new AnnotationConfiguration();
		 acfg.configure();
		 SessionFactory sf = acfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 
		Object o =(Object)session.get(Item.class, 2);
		Item i = (Item)o;
		
		System.out.println(i.getItemid()+i.getItemName());
		
		Set s = i.getCategories();
		
		for (Object object : s) {
			Categories c =(Categories)object;
			System.out.println(c.getCategoryid()+c.getCategoryName());
		}
	}
}
