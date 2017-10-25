package Com.Artek;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Insert {

	public static void main(String[] args) {
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure();
		SessionFactory sf = acfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Company c = new Company();
		c.setCompanyname("tcs");
		
		Manager m1 = new Manager();
		m1.setManagerName("rajaram");
		
		Manager m2 = new Manager();
		m2.setManagerName("tukaram");
		
		Speaker sp1 = new Speaker();
		sp1.setSpeakerName("tukaji rao");
		
		Speaker sp2 = new Speaker();
		sp2.setSpeakerName("sunil dagdu");

		Audiance a1 = new Audiance();
		a1.setAudianceName("tukaram");
		
		Audiance a2= new Audiance();
		a2.setAudianceName("rajaram");
		
		Set s1 = new HashSet();
		s1.add(a1);
		s1.add(a2);
		
		/*Set s2 = new HashSet();
		s2.add(a1);
		s2.add(a2);*/
		
		Event e1 = new Event();
		e1.setEventName("jai shree ram");
		e1.setSp(sp1);
		e1.setMg(m2);
		//e1.setAudiance(s1);
		
		Event e2 = new Event();
		e2.setEventName("mahabharat");
		e2.setSp(sp2);
		e2.setMg(m1);
		e2.setAudiance(s1);
		
		Location l1 = new Location();
		l1.setLocationName("bhawarkuan");
		l1.setEvent(e1);
		
		Location l2 = new Location();
		l2.setLocationName("palasiya");
		l2.setEvent(e2);
		
		
		Set s = new HashSet();
		
		s.add(e1);
		s.add(e2);
		
		c.setEvent(s);
		
		session.save(c);
		session.save(l1);
		session.save(l2);
		tx.commit();
	}
}
