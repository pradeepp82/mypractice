package Com.Artek;
 
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class DeleteAddress {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
         Transaction tx = session.beginTransaction();
         Address a = new Address();
         a.setAddressid(1);
         
          
        
        
         
        
        session.delete(a);
        tx.commit();
        
      
	}
}