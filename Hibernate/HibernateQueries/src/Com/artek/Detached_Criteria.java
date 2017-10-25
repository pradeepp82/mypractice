package Com.artek;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
 
public class Detached_Criteria { 
 
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
 
		Configuration cfg = new Configuration();
		cfg.configure(); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		Session session2 = factory.openSession();
		Session session3 = factory.openSession();
 
		//Criteria crit = session.createCriteria(UserDTO.class);	
		DetachedCriteria crit = DetachedCriteria.forClass(UserDTO.class);
 
		ProjectionList p1=Projections.projectionList();
		         p1.add(Projections.property("firstname"));
		         p1.add(Projections.property("lastname"));	
 
		crit.setProjection(p1);		
 
		List  ud = new ArrayList ();
		ud =crit.getExecutableCriteria(session1).list(); 
		ud =crit.getExecutableCriteria(session2).list();
		ud =crit.getExecutableCriteria(session3).list();
		Iterator it=ud.iterator(); 
		while(it.hasNext())
		{
			Object [] udt = (Object []) it.next();
			System.out.println(udt[0] + " "+ udt[1]);
		}
		 
		session1.close();
		factory.close();
	}
 
}