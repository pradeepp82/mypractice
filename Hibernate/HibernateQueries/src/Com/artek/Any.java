package Com.artek;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class Any{
  public static void main(String[] args) {
	 
		  //create conguration object 	
		  Configuration cfg=new Configuration();
		  //populates data of configuration file
		  cfg.configure();
		  //creating session factory object
		  SessionFactory factory =cfg.buildSessionFactory();
		  //creating session object
		  Session session = factory.openSession();
		  //creating transaction object
		  Transaction t = session.beginTransaction();
		  //UserDTO e1 = new UserDTO();
		  UserDTO dt=  new UserDTO();
		  Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter your Choice");  
		   int choice =sc.nextInt();  
		   if(choice==1){
			   
			   System.out.println(" you are selected sql query");
			   
			   Query q=session.createSQLQuery("SELECT firstname from User u where u.id = any (select id from Emp  where lname='panwar') ");
			   
			   List l =q.list();
			   Iterator itr =l.iterator();
			   while(itr.hasNext()){
				   
				   Object  s= itr.next();
				   System.out.println(s);
				   
			   }
			   
		   }else if(choice==2){
			   System.out.println(" you are selected hql query");
                 Query q1 = session.createQuery("select firstname from UserDTO u where u.id = any (select id from EmpDTO  where lname='panwar')");
               
                 List l = q1.list();
                 Iterator it1 = l.iterator();
                 while(it1.hasNext()){
                	 Object s= it1.next();
  				   System.out.println(s);
                 }
 				   
			   }
		   else{
			   System.out.println("only 1 and 2 are the legals once");
		   }
		   }
		     
		  
	}


