package Com.Artek;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query q = session.getNamedQuery("Myquery");
		q.setParameter("named", 125);
		List l = q.list();
		
		System.out.println("list size :"+l.size());

	  Iterator itr = l.iterator();
	  
	  while (itr.hasNext()) {
		Product p = (Product) itr.next();
		System.out.println(p.getProductid()+" :"+p.getProductname()+" :"+p.getPrice());
	}
	}
}
