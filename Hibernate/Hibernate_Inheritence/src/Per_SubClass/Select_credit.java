package Per_SubClass;

 
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select_credit {

	  public static void main(String[] args) {
		 
		  Configuration cfg = new Configuration();
		  cfg.configure();
		  SessionFactory sf = cfg.buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction tx = session.beginTransaction();
		  
		  Query ql =  session.createQuery("from Creditcard1");
		  
		  
		  List   l  =  ql.list();
          
          for (Object objects : l) {
        	  
        	   Creditcard1 c =(Creditcard1)objects;
        	  System.out.println(c.getPaymentid()+" "+c.getAmount()+" "+c.getCreditcardtype());
			
		}
	}
}