package Com.Artek;

 

 

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Fetch_update {
	
	public static void main(String[] args) {
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure();
       SessionFactory sf = acfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
        Object o =(Object)session.get(Vendor.class, 1);
        Vendor v =(Vendor)o;
        System.out.println(v.getVendorName());
         
        Set s = v.getChildren();
        for (Object object : s) {
			Customers c = (Customers)object;
			System.out.println(c.getCustomerId()+" : "+c.getCustomerName());
			if(c.getCustomerId()==1){
				c.setCustomerName("ramram");
				 
				
			}
		}
              session.update(v);
              tx.commit();
	}
	
}