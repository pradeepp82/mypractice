package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
 
public class Logic { 
 
	public static void main(String[] args)
	{
 
		 Session session=new AnnotationConfiguration()  
		         .configure().buildSessionFactory().openSession();
		 
		 Transaction t = session.beginTransaction();		
 
	      Vendor v=new Vendor();
	      //v.setVendorId(101);
	      v.setVendorName("martand dhamdhere");
 
	      Customers c1=new Customers();
	      //c1.setCustomerId(500);
	      c1.setCustomerName("goutam araya");
 
	      Customers c2=new Customers();
	      //c2.setCustomerId(501);
	      c2.setCustomerName("panakaj sumer");
 
	      Set s=new HashSet();
	      s.add(c1);
	      s.add(c2);
 
	      v.setChildren(s);
 
	      Transaction tx=session.beginTransaction();
	           session.save(v);
	      tx.commit();
 
		session.close();
		 
		 
	}
 
}