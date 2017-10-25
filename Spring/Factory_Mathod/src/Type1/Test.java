package Type1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("config1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Master m = (Master)factory.getBean("master");
		m.msg();
	}
}
