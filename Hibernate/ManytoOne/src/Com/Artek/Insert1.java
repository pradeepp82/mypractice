package Com.Artek;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Insert1 {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		         Vendor v =new Vendor();
 
		             
		            v.setVendorName("dilip"); 
 
		  /* Customer c1=new Customer();
 
		              c1.setCustomerid(14);
		             c1.setCustomerName("narendra modi");
		             c1.setParentObject(v);
 
      Customer c2=new Customer();
 
		            
		             c2.setCustomerName("radheshyam lamdadya");
		             c2.setParentObject(v);
 
              Customer c3=new Customer();
 
		              
		             c3.setCustomerName(" atmaram pita premlal");
		             c3.setParentObject(v);           		             

		    
 
		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);*/
		            Transaction tx = session.beginTransaction();
		            session.save(v);
		    tx.commit();
		    session.close();
	
		    factory.close();
 
	}
}