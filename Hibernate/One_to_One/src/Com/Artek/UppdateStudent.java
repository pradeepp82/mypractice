package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class UppdateStudent {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
         Transaction tx = session.beginTransaction();
        Object o = session.get(Student.class, new Integer(2));
        Student s =(Student)o;
        System.out.println(s.getStudentName());
        
        s.setStudentName("pradeep panar");
        
        session.update(s);
        tx.commit();
        
      
	}
}