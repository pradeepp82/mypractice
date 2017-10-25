package Com.Artek;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Select {

	
      public static void main(String[] args) {
	     
    		AnnotationConfiguration acfg = new AnnotationConfiguration();
    		acfg.configure();
    		SessionFactory sf = acfg.buildSessionFactory();
    		Session session = sf.openSession();
    		Transaction tx =session.beginTransaction();
        
    		 Object o =(Object)session.get(Address.class, 1);
    		 Address a =(Address)o;
    		 
    		 System.out.println(a.getAddressid()+":"+a.getPlace());
    		 
    		Student s = a.getParent();
    		System.out.println(s.getStudentName()+":"+s.getGrp());
         }

}