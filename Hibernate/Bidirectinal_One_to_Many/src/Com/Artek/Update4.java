package Com.Artek;

import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Update4 {
	public static void main(String[] args) {
	   
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 Object o = (Object)s.get(Vendor.class, 3);
             Vendor v =(Vendor)o;
	     System.out.println("vendor name :"+v.getVendorname());
	     System.out.println("select child object ");
	         Set s1 =v.getChildren();
	         
	         for(Object o1:s1){
	         	
	        	    Customer c = (Customer)o1;
	        	       int id = c.getCustomerid();
	        	       System.out.println(id);
	        	       
	        	    if(c.getCustomerid()==2){
	        	    	System.out.println("BEFORE update "+id+""+c.getCustomername());
	        	    c.setCustomername("bandya");
	        	    System.out.println("after update "+id+""+c.getCustomername());
	        	    }
	        	    else if(c.getCustomerid()==1){
	        	    	System.out.println("BEFORE update "+id+""+c.getCustomername());
	        	        c.setCustomername("tukaram ");
	        	        System.out.println("after update "+id+""+c.getCustomername());
	        	       }
	        	    if(c.getCustomerid()==3){
	        	    	System.out.println("BEFORE update "+id+""+c.getCustomername());
	        	        c.setCustomername("dagadya daji");
	        	        System.out.println("after update "+id+""+c.getCustomername());
	        	       }
	        	     s1.add(c);
	        	    }
	        	    v.setChildren(s1);
	        	    s.update(v);
	        	   tx.commit();
	        	  
     
	     	     s.close();
		          sf.close();    
		 
		  	
	}

}