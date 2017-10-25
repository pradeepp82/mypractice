package Com.Aartek;

import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Test {
	 public static void main(String[] args) {
		 Session session=new AnnotationConfiguration()  
		         .configure().buildSessionFactory().openSession();
		 
		 Transaction t = session.beginTransaction();
		 
		 UserDTO d1= new UserDTO();
		 d1.setFirstname("kush");
		 d1.setLastname("chawda");
		 UserDTO d2= new UserDTO();
		 d2.setFirstname("ramji");
		 d2.setLastname("gupta");
		 
		 
		  session.persist(d1);
		 Integer i = (Integer) session.save(d2);
		 System.out.println(i);
		 
			    t.commit();
		 session.close();

	}

}
