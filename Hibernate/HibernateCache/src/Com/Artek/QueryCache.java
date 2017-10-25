package Com.Artek;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class QueryCache {
  public static void main(String[] args) throws InterruptedException {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	   SessionFactory sf =cfg.buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction tx = session.beginTransaction();
	   
	   Query query = session.createQuery("from CacheTest c where c.id=1");
	       query.setCacheable(true);
	   Iterator it = query.list().iterator();
	   while (it.hasNext ()){
	      CacheTest c = (CacheTest) it.next();
	      System.out.println(c.getFirstname());
	   }
	   query = session.createQuery("from CacheTest c where c.id=1");
	   query.setCacheable(true);
	   it = query.list().iterator();
	   while (it.hasNext ()){
	      CacheTest c1 = (CacheTest) it.next();
	      System.out.println(c1.getFirstname());
	   }
	   tx.commit();
	   session.close();
	   sf.close();
}
}
