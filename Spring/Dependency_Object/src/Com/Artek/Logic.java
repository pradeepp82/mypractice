package Com.Artek;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String[] args) {
		
		Resource resource1 = new ClassPathResource("spconfig1.xml");
        BeanFactory factory1 = new XmlBeanFactory(resource1);
        
    	Resource resource2 = new ClassPathResource("spconfig2.xml");
        BeanFactory factory2 = new XmlBeanFactory(resource2,factory1);
        
        Object o =factory2.getBean("travel");
        Journey j =(Journey)o;
        j.startjourney();
	}
}
