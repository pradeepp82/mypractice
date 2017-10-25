package Com.Artek;

 

import java.util.List;

import org.hibernate.Filter;
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
 		   Transaction tx = session.beginTransaction();
 		   
 		   Filter filter =session.enableFilter("studentFilter");
 		   filter.setParameter("rollno", 125);
 		   
 		   Query query = session.createQuery("from Student");
 		   
 		   List l = query.list();
 		   
 		   for(int i=0;i<l.size();i++){
 			   Student s = (Student)l.get(i);
 			   
 			   System.out.println(s.getStudentid()+":"+s.getRollno()+":"+s.getStudentname());
 			   
 		   }
		}
	
 }
