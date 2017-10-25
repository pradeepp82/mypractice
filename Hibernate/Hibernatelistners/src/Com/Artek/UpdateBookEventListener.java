package Com.Artek;

import org.hibernate.event.PostUpdateEvent;
import org.hibernate.event.PostUpdateEventListener;
import org.hibernate.event.PreUpdateEvent;
import org.hibernate.event.PreUpdateEventListener;

public class UpdateBookEventListener implements PostUpdateEventListener,PreUpdateEventListener {

	@Override
	public boolean onPreUpdate(PreUpdateEvent preupdate) {
		
		System.out.println("pre update event");
		if(preupdate.getEntity() instanceof Book){
			Book book = (Book)preupdate.getEntity();
			System.out.println(book.getName());
			
		}
		return true;
	}

	@Override
	public void onPostUpdate(PostUpdateEvent postupdate) {
		
		System.out.println("post update event");
		
        if(postupdate.getEntity() instanceof Book)	{
        	Book book =(Book)postupdate.getEntity();
        	System.out.println(book.getName());
        }	
	}

}
