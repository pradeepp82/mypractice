package Com.Artek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Update {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeDao ed = (EmployeeDao)factory.getBean("Empdao");
		
     Employee e = (Employee)ed.getById(1);
      e.setName("tukaram");
      e.setSalary(45788);
      ed.updateEmployee(e);
     
		
		 
			
		}
		
		 
   }

