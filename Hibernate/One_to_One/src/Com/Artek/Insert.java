package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Insert {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
        Transaction tx = session.beginTransaction();
        
       Student s1 = new Student();
       s1.setStudentName("tukaram");
       
       Student s2 = new Student();
       s2.setStudentName("sakaram");
     
        
       
       Address ad1 = new Address();
       ad1.setAddressid(1);
       ad1.setCity("nai dilli");
       ad1.setState("u.p.");
       
       ad1.setS(s1);
       ad1.setS(s2);
       
       session.save(ad1);
       tx.commit();
	}
	
}