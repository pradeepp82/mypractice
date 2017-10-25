package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Insert {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		         Vendor v =new Vendor();
 
		             
		            v.setVendorName("sitram lamdadya");
 
		   Customer c1=new Customer();
 
		              c1.setCustomerid(14);
		             c1.setCustomerName("tukarm samediya");
		             c1.setParentObject(v);
 
		   Customer c2=new Customer();
 
		            
		             c2.setCustomerName("radheshyam undhaliya");
		             c2.setParentObject(v);
 
              Customer c3=new Customer();
 
		              
		             c3.setCustomerName(" atmaram pita premlal");
		             c3.setParentObject(v);           		             

		    Transaction tx = session.beginTransaction();
 
		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);
 
		    tx.commit();
		    session.close();
	
		    factory.close();
 
	}
}