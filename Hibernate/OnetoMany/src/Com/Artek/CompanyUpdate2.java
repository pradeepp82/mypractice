package Com.Artek;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class CompanyUpdate2 {
 
public static void main(String args[])
{
 
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
//Transaction tx = session.getTransaction();
   Object o =session.get(Company.class, 4);
   Company v =(Company)o;
    Set s = v.getChildren();
    Set s1 = new HashSet();
    
    for(Object o1:s){
    	
    Employee e = (Employee)o1;
       int id = e.getEmployeeid();
       System.out.println(id);
       
    if(e.getEmployeeid()==7){
    e.setEmployeeName("ramlal");
    }
    else if(e.getEmployeeid()==8){
        e.setEmployeeName("rajaram");
       }
    if(e.getEmployeeid()==9){
        e.setEmployeeName("rajmohan");
       }
     s1.add(e);
    }
    v.setChildren(s1);
    session.update(v);
    Transaction tx = session.beginTransaction();
   tx.commit();
   session.close();
  	   
		 
    
   
  
   
}
}