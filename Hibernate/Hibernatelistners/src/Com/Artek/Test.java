package Com.Artek;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.lock.UpdateLockingStrategy;
 
import Com.Artek.Book;
 
public class Test {
 
    private static SessionFactory factory; 
    public static void main(String args[])
    {
 
        Configuration cfg = new Configuration().configure();
        factory = cfg.buildSessionFactory();
        Session session =     factory.openSession();
        Transaction tx = session.beginTransaction();
 
        Book book = new Book();
        book.setName("Hibernate tutorial");
        int id = (Integer)session.save(book);
 
        tx.commit();
        session.close();  
 
        session= factory.openSession();
 
        tx= session.beginTransaction();
        book = (Book)session.get(Book.class, id);
        book.setName("Updated");
 
        tx.commit();
        session.close();
        factory.close();
    }
}