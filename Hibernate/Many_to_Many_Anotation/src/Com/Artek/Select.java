package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Select {

	 public static void main(String[] args) {
		  
		 AnnotationConfiguration acfg = new AnnotationConfiguration();
		 acfg.configure();
		 SessionFactory sf = acfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 
		Object o =(Object)session.get(Categories.class, 2);
		Categories c = (Categories)o;
		
		System.out.println(c.getCategoryid()+c.getCategoryName());
		
		Set s = c.getItems();
		
		for (Object object : s) {
			Item i =(Item)object;
			System.out.println(i.getItemid()+i.getItemName());
		}
	}
}