package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Delete3 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
        Object o =(Object)session.get(Student.class, 1);  
          Student s =(Student)o;
          System.out.println(s.getStudentid()+" "+s.getStudentName());
          Set s1 = s.getCourses();
          for (Object object : s1) {
			Course c1 = (Course)object;
	          System.out.println(c1.getCourseid()+" "+c1.getCourseName());
	          
	          if(c1.getCourseid()==1){
	        	  
	        	  s1.remove(c1);
	          }
          
          }
		 
		 
             
 
		    Transaction tx = session.beginTransaction();
 
		                  session.update(s);
 
		    tx.commit();
 
		    session.close();
		    
		    factory.close();
 
	}
}