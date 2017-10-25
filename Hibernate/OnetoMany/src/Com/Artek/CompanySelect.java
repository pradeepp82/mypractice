package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanySelect {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
   Object o =session.get(Company.class, new Integer(3));
   Company v =(Company)o;
    
   System.out.println(v.getCompanyid());
   System.out.println(v.getCompanyName());
   Set s = v.getChildren();
   Iterator itr =s.iterator();
   
   /*while (itr.hasNext()) {
	Object o1 =  itr.next();
	Employee  c= (Employee )o1;
	//Customer c1 = new Customer();
	 System.out.println(c.getEmployeeid()+" "+c.getEmployeeName()+" "+c.getCompanyEId()); 
    }*/
   
   session.close();
   factory.close();
   
}
}