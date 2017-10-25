package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Update3 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Object o = session.get(Vendor.class, new Integer(6));
		//Customer c = new Customer();
	        
		 Vendor v =(Vendor)o;
	     System.out.println(v.getVendorName());	
	         v.setVendorName("parth");
	       
		    Transaction tx = session.beginTransaction();
		                      session.update(v);
		    tx.commit();
 
		    session.close();
		    factory.close();       
 
	}
}