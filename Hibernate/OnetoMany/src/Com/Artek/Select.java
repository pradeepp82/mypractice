package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Select {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
   Object o =session.get(Vendor.class, new Integer(1));
   Vendor v =(Vendor)o;
    System.out.println(v.getVenderName());
   
   Set s = v.getChildren();
   Iterator itr =s.iterator();
   
   while (itr.hasNext()) {
	Object o1 =  itr.next();
	Customer  c= (Customer )o1;
	 System.out.println(c.getCustomerId()+" "+c.getCustomerName());	 
    }
   
   session.close();
   factory.close();
   
}
}