    package Com.Artek;  
      
    import org.hibernate.Session;  
    import org.hibernate.SessionFactory;  
    import org.hibernate.cfg.Configuration;  
      
    public class SecondLevelCache {  
    public static void main(String[] args) throws InterruptedException {  
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");  
    SessionFactory factory=cfg.buildSessionFactory();  
          
        Session session1=factory.openSession();  
        CacheTest emp1=(CacheTest)session1.get(CacheTest.class,1);  
        System.out.println(emp1.getId()+" "+emp1.getFirstname()+" "+emp1.getLastname());  
        session1.close();  
        Thread.sleep(2000);
          
        Session session2=factory.openSession();  
        CacheTest emp2=(CacheTest)session2.load(CacheTest.class,1);  
        System.out.println(emp2.getId()+" "+emp2.getFirstname()+" "+emp2.getLastname());  
        session2.close();  
        Thread.sleep(2000);  
        
        Session session3=factory.openSession();  
        CacheTest emp3=(CacheTest)session3.load(CacheTest.class,1);  
        System.out.println(emp3.getId()+" "+emp3.getFirstname()+" "+emp3.getLastname());  
        session3.close();  
        Thread.sleep(2000);
        factory.close();
    }  
    }  