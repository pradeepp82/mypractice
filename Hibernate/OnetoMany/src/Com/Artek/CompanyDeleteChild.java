package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanyDeleteChild {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
   Object o =session.get(Employee.class, new Integer(3));
   Employee v =(Employee)o;
   Transaction tx = session.beginTransaction();
     session.delete(v);
   tx.commit();
    
   
   session.close();
   factory.close();
   
}
}