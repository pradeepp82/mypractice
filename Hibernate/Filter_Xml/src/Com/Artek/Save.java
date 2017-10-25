package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Save {
     
	  public static void main(String[] args) {
		
		   Configuration cfg = new Configuration();
		   cfg.configure();
		   SessionFactory sf = cfg.buildSessionFactory();
		   Session session = sf.openSession();
		   Transaction tx = session.beginTransaction();
		   
		   Student s = new Student();
		   s.setStudentname("ram ");
		   s.setRollno(126);
		   session.save(s);
		   tx.commit();
		   session.close();
		   sf.close();
	}
	
}
