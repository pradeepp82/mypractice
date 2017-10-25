package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Insert2 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Student s1=new Student();
		s1.setStudentid(1);
		s1.setStudentName("pradeep");
		s1.setMarks(98);
 
		Student s2=new Student();
		s2.setStudentid(2);
		s2.setStudentName("panwar");
		s2.setMarks(99);
  
		    Transaction tx = session.beginTransaction();
 
		                      session.save(s1);
		                      session.save(s2);
 
		    tx.commit();
 
		    session.close();
		    System.out.println("Many To Many Bi-Directional is Done..!!");
		    factory.close();
 
	}
}