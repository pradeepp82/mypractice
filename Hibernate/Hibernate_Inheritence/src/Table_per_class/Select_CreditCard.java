package Table_per_class;
import java.util.Scanner;  

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Select_CreditCard {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter your choice");  
		   int id=sc.nextInt();  
		Object o =(Object)session.get(CreditCard.class, id);
		if(o==null){
			System.out.println("if");
			Object o1 =(Object)session.get(CreditCard.class, id-1);
		     CreditCard cq =(CreditCard)o1;
		System.out.println(cq.getPaymentid()+" "+cq.getAmount()+" "+cq.getCreditCardType());
	}
		else{
			System.out.println("else");
			CreditCard cq =(CreditCard)o;
			System.out.println(cq.getPaymentid()+" "+cq.getAmount()+" "+cq.getCreditCardType());

		}
	}
}
