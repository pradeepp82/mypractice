package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
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
 
		 Object o = (Object)session.get(Student.class, 3);
		 
		 Student s = (Student)o;
		 System.out.println(s.getStudentid()+" "+s.getStudentName());
		
		 Set s1 = s.getCourses();
		 for(Object o1 :s1){
			 
			 Course c =(Course)o1;
			 System.out.println(c.getCourseid()+" "+c.getCourseName());
			 
			 if(c.getCourseid()==1){
				 
				 c.setCourseName("pradeep");
			 }
		 }
 
		    Transaction tx = session.beginTransaction();
 
		                   session.update(s);
 
		    tx.commit();
 
		    session.close();
		    
		    factory.close();
 
	}
}