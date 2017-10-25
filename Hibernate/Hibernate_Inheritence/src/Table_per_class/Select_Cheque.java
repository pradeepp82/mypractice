package Table_per_class;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select_Cheque {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Object o =(Object)session.get(Cheque.class, 2);
		
		Cheque cq =(Cheque)o;
		
		System.out.println(cq.getPaymentid()+" "+cq.getAmount()+" "+cq.getChequeType());
	}

}
