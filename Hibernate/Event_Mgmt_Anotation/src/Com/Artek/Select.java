package Com.Artek;

import java.util.List;
import java.util.Set;

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
	  Transaction tx = session.beginTransaction();
   
	   Object o = (Object)session.get(Company.class, 1);
	   Company c = (Company)o;
	   
	   
	   Set s1 = c.getEvent();
	   for (Object object : s1) {
		Event e = (Event)object;
		int evid = e.getEventid();
		
		
		if(e.getEventid()==1){
			Manager m = e.getMg();
			Speaker s = e.getSp();
			System.out.println("CompanyName :"+c.getCompanyname()+", EventName :"+e.getEventName()+", ManagerName :"+m.getManagerName()+", SpeakerName :"+s.getSpeakerName());
			Set s2 = e.getAudiance();
			for (Object object2 : s2) {
				Audiance a = (Audiance)object2;
				System.out.println("Audiance :"+a.getAudianceName());
			}
			Object o2 = (Object)session.get(Location.class, evid);
			Location l =(Location)o2;
			System.out.println("Location :"+l.getLocationName());
		}
	}
   }
}
