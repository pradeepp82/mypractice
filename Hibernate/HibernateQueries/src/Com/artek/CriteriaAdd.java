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
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;









public class CriteriaAdd{
  public static void main(String[] args) {
	 
		   
		  Configuration cfg=new Configuration(); 
		  cfg.configure();		   
		  SessionFactory factory =cfg.buildSessionFactory();	  
		  Session session = factory.openSession();		   
		  Transaction t = session.beginTransaction();		  
		  UserDTO dt=  new UserDTO();
		  Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter your Choice");  
		   int choice =sc.nextInt();  
		   if(choice==1){
			   
			   System.out.println(" you are selected sql query");
			   
			   Query q=session.createSQLQuery("select firstname from User order by firstname DESc");
			   List l =q.list();
			   Iterator itr =l.iterator();
			   while(itr.hasNext()){
				   
				   Object  s= itr.next();
				   System.out.println(s);
				   
			   }
			   
		   }else if(choice==2){
			   System.out.println(" you are selected hql query");
                 Query q1 = session.createQuery("select firstname from UserDTO order by lastname ");
               
                 List l = q1.list();
                 Iterator it1 = l.iterator();
                 while(it1.hasNext()){
                	 //UserDTO dt1 =(UserDTO)it1.next();
                	 //System.out.println(dt1.getId()+" "+dt1.getFirstname()+" "+dt1.getLastname());
                	 Object  s= it1.next();
  				   System.out.println(s);
                 }
 				   
			   }else{
				   
				   List<UserDTO> result =  (List<UserDTO>) session.createCriteria(UserDTO.class)
						 
						   .add(Restrictions.like("firstname", "prad%")).list();
				   
				   Iterator itr =result.iterator();
				   while(itr.hasNext()){
					   
					   UserDTO dt1 =(UserDTO)itr.next();
					   System.out.println(dt1.getFirstname());
					   
				   }
						   
			   }
		   }
		     
		  
	}


