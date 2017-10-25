package Per_concrete_class;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Save {
   public static void main(String[] args) {
	  Configuration cfg = new Configuration();
	  cfg.configure();
	  
	  SessionFactory sf = cfg.buildSessionFactory();
	  Session session = sf.openSession();
	  Transaction tx = session.beginTransaction();
	  
	  CreditCard2 cc = new CreditCard2();
	    cc.setAmount(35000);
	    cc.setCreditCardType("pp");
	    
	    Cheque2 cq = new Cheque2();
	    cq.setAmount(38000);
	    cq.setChequeType("sbi");
	    
	    session.save(cc);
	    session.save(cq);
	    tx.commit();
	    session.close();
	    sf.close();
}
}
