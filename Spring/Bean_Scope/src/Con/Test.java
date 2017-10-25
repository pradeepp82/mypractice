package Con;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
   public static void main(String[] args) {
     Resource resource = new ClassPathResource("single.xml");
      BeanFactory factory = new XmlBeanFactory(resource);
	  // ApplicationContext context = new ClassPathXmlApplicationContext("single.xml");
      Hello objA = (Hello)factory.getBean("helloWorld");


      objA.info();
      System.out.println(objA.hashCode());

      Hello objB = (Hello) factory.getBean("helloWorld");
     
      objB.info();
      System.out.println(objB.hashCode());
   }
}