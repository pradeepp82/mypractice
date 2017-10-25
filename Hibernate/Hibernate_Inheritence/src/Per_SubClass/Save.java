package Per_SubClass;
 
import org.hibernate.*;
import org.hibernate.cfg.*;
 
public class Save { 
 
    public static void main(String[] args)
    {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction(); 
        
    Creditcard1 c = new Creditcard1();
        c.setAmount(2500);
        c.setCreditcardtype("visa");
        Cheque1 cq = new Cheque1();
        cq.setAmount(3400);
        cq.setChequetype("icici");
        
        
          session.save(c);
        session.save(cq);
       tx.commit();
       session.close();
     
        
 
   }
    
}