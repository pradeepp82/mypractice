package Com.Artek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Select {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeDao ed = (EmployeeDao)factory.getBean("Empdao");
		
		//Object  o = (Object)ed.getEmployees();
		//Employee e = (Employee)o;
		//System.out.println(e.getName());
		
		ArrayList data= (ArrayList)ed.getEmployees();
		 Iterator itr = data.iterator();
		 while (itr.hasNext()) {
			Object object = (Object) itr.next();
			Employee e =(Employee)object;
			System.out.println(e.getName() + " "+e.getSalary());
			
		}
		
		 
	}
}
