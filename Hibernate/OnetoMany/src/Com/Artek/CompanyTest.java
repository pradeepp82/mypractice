package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanyTest {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
//parent object
     Company v =new Company();
 
     v.setCompanyName("tcs ");
 
    //creating 3 child objects
     Employee e1 = new Employee();
 
  
     e1.setEmployeeName("pradeep panwar");
 
     Employee e2 = new Employee();
  
     e2.setEmployeeName("dhanalal");
     
 
 
    Employee e3=new Employee();
 
      e3.setEmployeeName("shyam");
 
    // adding child objects to set, as we taken 3rd property set in parent
      Set s=new HashSet();
 
     s.add(e1);
     s.add(e2);
     s.add(e3);
 
     v.setChildren(s);
 
    Transaction tx = session.beginTransaction();
 
     session.save(v);
 
     tx.commit();
      session.close(); 
      factory.close();
 
}
}