package Com.Artek;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		Session session = cfg.buildSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address = new Address("bhawarkuan", "indodddre", "TfN", "450001");
			// By using cascade=all option the address need not be saved
			// explicitly when the student object is persisted the address will
			// be automatically saved.
			// session.save(address);
			Student student1 = new Student("pradeep", address);
			Student student2 = new Student("tukaji", address);
			Student student3 = new Student("rajaram", address);
			Student student4 = new Student("gagan", address);
			
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.save(student4);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}