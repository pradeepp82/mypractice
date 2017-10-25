package Com.Artek;
 
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class UpdateStudent {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		 Object o = (Object)session.get(Course.class, 2);
		 
		 Course s = (Course)o;
		 System.out.println(s.getCourseid()+" "+s.getCourseName());
		
		 Set s1 = s.getStudents();
		 for(Object o1 :s1){
			 
			 Student c =(Student)o1;
			 System.out.println(c.getStudentid()+" "+c.getStudentName());
			 
			 if(c.getStudentid()==3){
				 System.out.println("before update :1"+ c.getStudentName());
				 
				 c.setStudentName("ramaji dod");
				 
				 
				 System.out.println("after update :"+c.getStudentName()  );
			 }
		 }
 
		    Transaction tx = session.beginTransaction();
 
		                   session.update(s);
		                    
		    tx.commit();
 
		    session.close();
		    
		    factory.close();
 
	}
}