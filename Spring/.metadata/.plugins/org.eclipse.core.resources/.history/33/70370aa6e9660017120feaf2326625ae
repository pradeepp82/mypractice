package Type2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	Resource resource = new ClassPathResource("config2.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	Printable  p = (Printable)factory.getBean("print");
	
	 
}
