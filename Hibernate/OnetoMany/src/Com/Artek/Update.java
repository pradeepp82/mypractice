package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Update {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
   Object o =session.get(Vendor.class, 3);
   Vendor v =(Vendor)o;
   Transaction tx = session.beginTransaction();
   v.setVenderName("pradeepp");
   session.update(v);
   tx.commit();
    
   
   session.close();
   factory.close();
   
}
}