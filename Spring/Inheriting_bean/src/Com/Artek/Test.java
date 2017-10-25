package Com.Artek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Emp.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e =(Employee)factory.getBean("emp2");
		e.show();
	}
}
