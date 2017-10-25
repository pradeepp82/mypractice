package Com.artek;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class Orderby {
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
			   
			   Query q=session.createSQLQuery("select * from User order by firstname");
			   List l =q.list();
			   Iterator itr =l.iterator();
			   while(itr.hasNext()){
				   
				   Object [] s= ( Object [])itr.next();
				   System.out.println(s[0]+" "+s[1]+" "+s[2]);
				   
			   }
			   
		   }else{
			   System.out.println(" you are selected hql query");
                 Query q1 = session.createQuery("from UserDTO order by lastname ");
               
                 List l = q1.list();
                 Iterator it1 = l.iterator();
                 while(it1.hasNext()){
                	 UserDTO dt1 =(UserDTO)it1.next();
                	 System.out.println(dt1.getId()+" "+dt1.getFirstname()+" "+dt1.getLastname());
                	 
                 }
 				   
			   }
		   }
		     
		  
	}


