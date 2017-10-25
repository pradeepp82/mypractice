package Com.Artek;
 
import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class UpdateCourse {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
         Transaction tx = session.beginTransaction();
        Object o = session.get(Address.class, new Integer(2));
        Address a =(Address)o;
        System.out.println(a.getCity());
        
        a.setCity("berlin");
        
        session.update(a);
        tx.commit();
        
      
	}
}