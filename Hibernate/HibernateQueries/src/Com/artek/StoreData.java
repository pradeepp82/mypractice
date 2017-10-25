package Com.artek;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class StoreData {
  public static void main(String[] args) {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	  SessionFactory factory =cfg.buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session.beginTransaction();
	 EmpDTO e1 = new  EmpDTO();
	 e1.setId(2);
	e1.setName("gagan");
	e1.setLname("thakre");
	  session.save(e1);
	  t.commit();
	  session.close();
}
}
