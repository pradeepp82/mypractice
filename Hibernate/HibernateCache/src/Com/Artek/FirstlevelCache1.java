package Com.Artek;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.SessionStatistics;

public class FirstlevelCache1 {
  public static void main(String[] args) throws InterruptedException {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	  SessionFactory factory =cfg.buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session.beginTransaction();
      CacheTest t1 = new CacheTest();
      
      
         for(int i= 0;i<10;i++){
	  CacheTest ei = (CacheTest)session.get(CacheTest.class, 1);
	  System.out.println(ei.getId()+ei.getFirstname()+ei.getLastname());
	  System.out.println("=============================");
	    
	  Thread.sleep(1000);
         }
         SessionStatistics sessionStats = session.getStatistics();
         session.close();
         factory.close();
}
}
