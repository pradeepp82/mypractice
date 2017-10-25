package Pack2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Pack_logic {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("pack.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Category c = (Category)factory.getBean("cat");
		c.show();
	}
}
