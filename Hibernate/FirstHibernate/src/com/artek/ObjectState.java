package com.artek;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class ObjectState {
  public static void main(String[] args) {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	  SessionFactory factory =cfg.buildSessionFactory();
	   
	  Employee e1 = new  Employee();//new object created; in Transient state
	   e1.setFirstname("raju");
	   Session session = factory.openSession();
	 System.out.println("Session (object is transient): " + session);
	 Transaction transaction = session.beginTransaction();
	 session.save(e1);// Object now in persistent state
	 System.out.println("The object id is " +e1.getId());
	  System.out.println("Session (after Object save): " + session);
	  transaction.commit();
	    session.close();
	    System.out.println("Session (after close): " + session);
	    
	  //here object is in detached state
	    session = factory.openSession();
	    session.saveOrUpdate(e1);
	   //object is now in persistent state again
	    System.out.println("Session (new one): " + session);
	    transaction = session.beginTransaction();
	    session.delete(e1);
	  //the entity is now in removed state
	    transaction.commit();
	    System.out.println("Session (after Object deletion): " + session);
	    session.close();
}
}
