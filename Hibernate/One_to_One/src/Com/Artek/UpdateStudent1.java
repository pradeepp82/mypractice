package Com.Artek;
 
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class UpdateStudent1 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
         Transaction tx = session.beginTransaction();
        Object o = session.get(Address.class, new Integer(4));
        Address a =(Address)o;
        
        
        System.out.println(a.getAddressid()+" :"+a.getCity()+" :"+a.getState());   
          Student a1 = a.getS();
          System.out.println("befor update :"+a1.getStudentName());
          a1.setStudentName("pradeep");
          
        System.out.println("after update :"+a1.getStudentName());
        
        session.update(a);
        tx.commit();
        
      
	}
}