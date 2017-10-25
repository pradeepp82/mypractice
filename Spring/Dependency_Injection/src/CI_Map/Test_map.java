    package CI_Map;  
      
    import org.springframework.beans.factory.BeanFactory;  
    import org.springframework.beans.factory.xml.XmlBeanFactory;  
    import org.springframework.core.io.ClassPathResource;  
    import org.springframework.core.io.Resource;  
      
    public class Test_map {  
    public static void main(String[] args) {  
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Question2 q=(Question2)factory.getBean("question2");  
        q.displayinfo();  
          
    }  
    }  