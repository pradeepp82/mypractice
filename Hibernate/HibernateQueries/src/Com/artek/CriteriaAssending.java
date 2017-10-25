package Com.artek;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;









public class CriteriaAssending{
  public static void main(String[] args) {
	 
		  //create conguration object 	
		  Configuration cfg=new Configuration();
		  //populates data of configuration file
		  cfg.configure();
		  //creating session factory object
		  //creating session object
		  SessionFactory factory =cfg.buildSessionFactory();
		  Session session = factory.openSession();
		  //creating transaction object
		  Transaction t = session.beginTransaction();
		  //UserDTO e1 = new UserDTO();
		  UserDTO dt=  new UserDTO();
		   
		  Criteria cr = session.createCriteria(UserDTO.class);

		         cr.addOrder(Order.desc("firstname"));

		  // To get records matching with OR conditions
		   
		  List results = cr.list();	   
		  Iterator itr =results.iterator();
		   while(itr.hasNext()){
			   
			   UserDTO  dt1 =(UserDTO )itr.next();
			   System.out.println(dt1.getFirstname());
			   
		   }
				    
					   
				   }
						   
			   }
		   
		     
		  
	


