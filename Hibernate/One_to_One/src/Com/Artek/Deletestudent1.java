package Com.Artek;
 
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Deletestudent1 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
         Transaction tx = session.beginTransaction();
        Object o =(Object)session.get(Address.class, 4);         
        Address a = (Address)o;
        
        System.out.println(a.getAddressid()+":"+a.getCity()+":"+a.getState());
              
          Student s = a.getS();
          
          System.out.println(s.getStudentName());
          if (s.getStudentName().equals("pradeep")) {
		      s.setStudentName("gagan");
        	  session.update(s);
			    tx.commit();
		}else {
			System.out.println("else");
		}
              
         
        
         
        
      
	}
}