package com.artek;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class StoreData {
  public static void main(String[] args) {
	  
	  Configuration cfg=new Configuration();
	   cfg.configure();
	  SessionFactory factory =cfg.buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session.beginTransaction();
	  Employee e1 = new Employee();
	 e1.setId(10);
	e1.setFirstname("kush");
	e1.setLastname("chawda");
	  session.save(e1);
	  t.commit();
	  session.close();
}
}
