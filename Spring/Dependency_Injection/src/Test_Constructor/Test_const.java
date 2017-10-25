package Test_Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test_const {
  
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory= new XmlBeanFactory(resource);
		Employee e = (Employee)factory.getBean("employee");
		 e.show();
	}
}
