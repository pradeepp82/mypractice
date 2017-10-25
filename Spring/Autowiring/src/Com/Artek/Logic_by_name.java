package Com.Artek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic_by_name {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config3.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Categories c =(Categories)factory.getBean("cat");
		c.show();
		//by type and by constructor is same working procedure
	}
}
