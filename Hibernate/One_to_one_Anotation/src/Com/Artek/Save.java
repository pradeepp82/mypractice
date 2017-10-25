package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Save {

	
      public static void main(String[] args) {
	     
    		AnnotationConfiguration acfg = new AnnotationConfiguration();
    		acfg.configure();
    		SessionFactory sf = acfg.buildSessionFactory();
    		Session session = sf.openSession();
    		Transaction tx =session.beginTransaction();
    		
    		Student s = new Student();
    		s.setStudentName("nilesh");
    		s.setGrp("b");
    		
    		Address a = new Address();
    		a.setPlace("dubai");
    		a.setParent(s);
    		
    		session.save(a);
    		tx.commit();
    		session.close();
     }

}
