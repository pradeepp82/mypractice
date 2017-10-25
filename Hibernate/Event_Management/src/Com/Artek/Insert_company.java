package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Insert_company {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Company c = new Company();
		c.setCompanyName("tcs");
		
		
		Manager m1 = new Manager();
		m1.setManagerName("Ajay jirati");
		
	    Manager m2 = new Manager();
		m2.setManagerName("Arun rathore");
		
		Speaker spe1 = new Speaker();
		spe1.setSpeakerName("thakre");
		
          
		Speaker spe2 = new Speaker();
		spe2.setSpeakerName("MODI");
		
		
		Event e1 = new Event();
  		e1.setEventName("dancing");
	    e1.setM(m1);
	    e1.setS(spe2);
	    
	    Event e2 = new Event();
	    e2.setS(spe1);
	    e2.setM(m2);
	    e2.setEventName("sg");
	    
		Set s = new HashSet();
		s.add(e1);
	    s.add(e2);
	    c.setEvent(s);
	    
		Audiance a1 = new Audiance();
		a1.setAudianceName("pradeep");
		
		Audiance a2 = new Audiance();
		a2.setAudianceName("ramlal");
		
		Audiance a3 = new Audiance();
		a3.setAudianceName("sitaram");
	
			Set s3 = new HashSet();
			s3.add(a1);
			s3.add(a2);
			s3.add(a3);
			
		    e1.setAudiance(s3);
	
 
		 Location l1 = new Location();
		 l1.setLocationName("palasiya");
		 l1.setEvent(e1);
		 
		 Location l2 = new Location();
		 l2.setLocationName("bhawarkuan");
		 l2.setEvent(e1);

    	
		 session.save(l1);
		 session.save(l2);
		 session.save(c);

		tx.commit();
		session.close();
	}
}
