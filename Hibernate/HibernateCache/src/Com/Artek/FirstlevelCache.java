package Com.Artek;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class FirstlevelCache {
  public static void main(String[] args) {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	  SessionFactory factory =cfg.buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session.beginTransaction();
      CacheTest t1 = new CacheTest();
          session.get(CacheTest.class, 1);
          System.out.println("=================================================");
	  CacheTest e1 = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(e1.getId()+e1.getFirstname()+e1.getLastname());
	  System.out.println("=================================================");
	  CacheTest e2 = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(e2.getId()+e2.getFirstname()+e2.getLastname());
	  System.out.println("=================================================");
	  CacheTest e3 = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(e3.getId()+e3.getFirstname()+e3.getLastname());
	  System.out.println("=================================================");
	  CacheTest e4 = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(e4.getId()+e4.getFirstname()+e4.getLastname());
	  System.out.println("=================================================");
	  CacheTest e5 = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(e5.getId()+e5.getFirstname()+e5.getLastname());
	  
	  session.close();
	  factory.close();
	 
           
}
}
