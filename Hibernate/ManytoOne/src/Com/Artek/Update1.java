package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Update1 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Object o = session.get(Customer.class, new Integer(40));
		
	        
		    Customer c =(Customer)o;
		    Vendor v = c.getParentObject();
	         System.out.println(v.getVendorName());
	           v.setVendorName("kesrilal ji pathan");
	       
		       Transaction tx = session.beginTransaction();
		                      session.update(v);
		                      System.out.println(v.getVendorName());
		    tx.commit();
 
		    session.close();
		    factory.close();       
 
	}
}