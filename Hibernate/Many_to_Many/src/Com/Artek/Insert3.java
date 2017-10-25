package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Insert3 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		 Transaction tx = session.beginTransaction();
		 
		 Object o =(Object)session.get(Student.class, 3);
		 Student s = (Student)o;
		 
		 Course c1 = new Course();
		 c1.setCourseName("java");
		 c1.setDuration(58);
		 Set s1 = new HashSet();
		 s1.add(c1);
		 
		 s.setCourses(s1);
           	 
		 
          session.update(s);
		    tx.commit();
 
		    session.close();
		    System.out.println("Many To Many Bi-Directional is Done..!!");
		    factory.close();
 
	}
}