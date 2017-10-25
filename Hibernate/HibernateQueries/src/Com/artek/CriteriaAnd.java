package Com.artek;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;









public class CriteriaAnd{
  public static void main(String[] args) {
	 
		  
		  Configuration cfg=new Configuration(); 
		  cfg.configure();		   
		  SessionFactory factory =cfg.buildSessionFactory();		  
		  Session session = factory.openSession();		   
		  Transaction t = session.beginTransaction();		 
		  UserDTO dt=  new UserDTO();
		   
				   
				   List<UserDTO> result =  (List<UserDTO>) session.createCriteria(UserDTO.class)
						 
						   .add(Restrictions.like("lastname", "pan%"))
				           .add(Restrictions.like("firstname", "pra%")).list();
				   
				   Iterator itr =result.iterator();
				   while(itr.hasNext()){
					   
					   UserDTO  dt1 =(UserDTO )itr.next();
					   System.out.println(dt1.getFirstname());
					   
				   }
				   session.close();
				   Session s2 = factory.openSession();
				   List<UserDTO> result1 =  (List<UserDTO>) s2.createCriteria(UserDTO.class)
							 
						   .add(Restrictions.like("lastname", "tha%"))
				           .add(Restrictions.like("firstname", "gag%")).list();
				   
				   Iterator it =result.iterator();
				   while(it.hasNext()){
					   
					   UserDTO  d1 =(UserDTO )it.next();
					   System.out.println(d1.getFirstname());
					   
				   }
				   s2.close();
				   Session s3 = factory.openSession();
				   List<UserDTO> res =  (List<UserDTO>) s3.createCriteria(UserDTO.class)
							 
						   .add(Restrictions.like("lastname", "tha%"))
				           .add(Restrictions.like("firstname", "gag%")).list();
				   
				   Iterator it2 =result.iterator();
				   while(it2.hasNext()){
					   
					   UserDTO  d2 =(UserDTO )it2.next();
					   System.out.println(d2.getFirstname());
					   
				   }
				   
			   }
		   }
		     
		  
	


