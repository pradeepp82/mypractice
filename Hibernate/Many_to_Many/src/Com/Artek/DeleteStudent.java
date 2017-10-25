package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class DeleteStudent {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		 Student s = new Student();
		 s.setStudentid(3);
             
 
		    Transaction tx = session.beginTransaction();
 
		                   session.delete(s);
 
		    tx.commit();
 
		    session.close();
		    
		    factory.close();
 
	}
}