package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Insert {

	 public static void main(String[] args) {
		   
		 AnnotationConfiguration acfg = new AnnotationConfiguration();
		 acfg.configure();
		 SessionFactory sf = acfg.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 Product p = new Product();
		// p.setEmployeeId(10);
		 p.setDeptNo(1);
		 p.setEmployeeName("gagan thakre");
		 p.setSalary(45000);
		
		 session.save(p);
		 tx.commit();
		 session.close();
		 sf.close();
	}	  
	 
}
