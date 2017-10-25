package Com.Artek;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insertagain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		Session session = cfg.buildSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Vendor v = new Vendor(/*4*/);
			//By using cascade=all option the address need not be saved explicitly when the student object is persisted the address will be automatically saved.
            session.save(v);
			Customer ct1 = new Customer(/*"Eswar", v*/);
			Customer ct2 = new Customer(/*"Joe", v*/);
			session.save(ct1);
			session.save(ct2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}