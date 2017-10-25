package Table_per_class;

 

import java.awt.List;
import java.util.Iterator;

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
    	  Transaction t = session.beginTransaction();
    	  
    	  Object o = (Object)session.load(Payment.class, 2);
    	  
    	  Payment p =(Payment)o;
    	  
    	  System.out.println(p.getPaymentid()+" "+p.getAmount());
	}
	  
}