package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Select {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Object o = session.get(Customer.class, 3);
		Customer c = (Customer)o;
 
		System.out.println(c.getCustomerName());
		Vendor v=c.getParentObject();
		System.out.println(v.getVendorName()); 
 
		    session.close();
		    
		    factory.close();       
 
	}
}