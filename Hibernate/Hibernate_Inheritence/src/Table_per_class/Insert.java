package Table_per_class;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Insert {
   public static void main(String[] args) {
   
	      Configuration cfg = new Configuration();
	      cfg.configure();
	      
	      SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	      Transaction tx = session.beginTransaction();
	      
	      CreditCard c = new CreditCard();
	      c.setAmount(2500);
	      c.setCreditCardType("visa");
	      
	      Cheque cq = new Cheque();
	      cq.setAmount(2400);
	      cq.setChequeType("sbi");
	      
	      
	      session.save(c);
	      session.save(cq);
	      
	      tx.commit();
	      session.close();
	      sf.close();
}
}
