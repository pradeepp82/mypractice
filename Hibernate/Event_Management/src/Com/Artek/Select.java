package Com.Artek;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner; 
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select {

	public static void main(String[] args) {
		
       Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       //for user input
       Scanner sc=new Scanner(System.in);   
       System.out.println("Enter name of company");  
       String name=sc.next();
       //query for fetch company
       Query q =session.createQuery("from Company where CompanyName=:name");
       q.setParameter("name", name);
       List l = q.list();
       Iterator itr = l.iterator();
       if (itr.hasNext()) {
		Object object = (Object) itr.next();
		Company c = (Company)object;
		
		     Set s = c.getEvent();
		//for events of company
		 for (Object object2 : s) {
			Event e = (Event)object2;
			Integer locid =e.getEventid();
			if(e.getEventid()==2){
				
			//for manager of event
			Object o = e.getM();
			Manager m =(Manager)o;
				     
			//for location of perticular event
		     Query q1 =session.createQuery("from Location where locationid=:locid");
		      q1.setParameter("locid", locid);
			  List list = q1.list();
			 Iterator  ietrator = list.iterator();
			 for (Object object3 : list) {
                 Location loc = (Location)object3;

                 // for speaker
                 Object sp =  e.getS();
                 Speaker sp1= (Speaker)sp;
                 System.out.println();
				System.out.println("Event-id:"+e.getEventid()+", "+"Event-name:"+e.getEventName()+", "+"manager-name:"+ m.getManagerName()+", "+"Speaker-name : "+sp1.getSpeakerName()+", "+"location:"+loc.getLocationName());
			}
			 //for Audiance
			Set saud =e.getAudiance();
			System.out.println("Audiance for  event :");
			for (Object object4 : saud) {
				Object obj3 =(Object)object4;
				Audiance aud = (Audiance)obj3;
				System.out.println(aud.getAudianceName());
			}
			}
	     }
		
	}else{
		System.out.println("no company Available");
	}
 
	}
}
