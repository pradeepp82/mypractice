package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Delete1 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Object o = session.get(Vendor.class, new Integer(11));
		Vendor c = (Vendor)o;
	      //System.out.println(c.getCustomerid()); 
 
		    Transaction tx = session.beginTransaction();
		      session.delete(c);
		    tx.commit();
 
		    session.close();
		    factory.close();       
 
	}
}