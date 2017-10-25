package com.artek;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
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
		  Employee e1 = new Employee();
		  e1.setId(1);
		  e1.setFirstname("pradeep");
		  e1.setLastname("mandloi");
		  session.update(e1);
		  t.commit();
		  session.close();
	}
}
