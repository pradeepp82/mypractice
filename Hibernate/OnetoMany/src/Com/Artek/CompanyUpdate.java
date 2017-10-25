package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanyUpdate {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
//parent object
     Company v =new Company();
 
       v.setCompanyid(1);
      v.setCompanyName("yashraj");
 
    //creating 3 child objects
     Employee e1 = new Employee();
 
     e1.setEmployeeid(20);
     e1.setEmployeeName("karan johar");
 
     Employee c2=new Employee();
 
     c2.setEmployeeid(21);
     c2.setEmployeeName("farah khan");
 
    Employee c3=new Employee();
 
     c3.setEmployeeid(22);
     c3.setEmployeeName("pradeep");
 
    // adding child objects to set, as we taken 3rd property set in parent
      Set s=new HashSet();
 
     s.add(e1);
     s.add(c2);
     s.add(c3);
 
     v.setChildren(s);
 
    Transaction tx = session.beginTransaction();
 
     session.update(v);
 
     tx.commit();
      session.close(); 
      factory.close();
 
}
}