package Com.Artek;
import java.util.Scanner;

import java.util.Iterator;
import java.util.List;
 
import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;
 
 
public class Main {
 
    public static void main(String[] args) {
        AnnotationConfiguration acfg = new AnnotationConfiguration();
        acfg.configure();
        SessionFactory sf = acfg.buildSessionFactory();
        Session session = sf.openSession();
       // Scanner sc=new Scanner(System.in);  
        
      //  System.out.println("Enter your salary");  
       // int salary =sc.nextInt();
        String name = "gagan thakre";
        Filter filter = session.enableFilter("employeeFilter");
        filter.setParameter("myFilterParam", name);
        Query query = session.createQuery("from Product e");
        List list = query.list();
        Iterator it =list.iterator();
        while (it.hasNext()) {
            Product emp = (Product) it.next();
            System.out.println("Employee id :"+emp.getEmployeeId()+"Employee Name : "+emp.getEmployeeName() +" , Salary : "+emp.getSalary());
        }    
    }
 
}