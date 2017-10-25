package Com.Artek;

 
import java.io.Serializable;
import java.util.Iterator;
 
import org.hibernate.EmptyInterceptor;
import org.hibernate.Session;
import org.hibernate.type.Type;
public class ConsoleLogInterceptor extends EmptyInterceptor{
	
	private static  final  long serialVersionUId =1L;
	
	@Override
	
	public void onDelete(Object entity, Serializable id,Object [] state , String [] propertyNames,Type[] types )
	{
		System.out.println("on delete method is invoking");
		System.out.println("detils of Entity are");
		if(entity instanceof Book){
			
			System.out.println("Id of entity is"+id);
			System.out.println("Property names");
			for (int i=0;i<propertyNames.length;i++){
				
				System.out.println(propertyNames[i]);
				 
			}
			Book book = (Book)entity;
			System.out.println("Book state is");
			System.out.println(book);
		}
	
	}
	@Override
	public boolean onLoad(Object entity, Serializable id,Object [] state , String [] propertyNames,Type[] types){
		
		System.out.println("onload method is invoking");
		System.out.println("details of entity are");
		if(entity instanceof Book){
			
			System.out.println("id of enity is" + id);
			System.out.println("PropertyNames");
			for(int i=0;i<propertyNames.length;i++){
				System.out.println(propertyNames[i]);
				if("name".equals(propertyNames[i])){
					state[i]="updated";
				}
			}
			Book book = (Book)entity;
			System.out.println("Book state is ");
			System.out.println(book);
		}
		return true;
	}
	@Override
	public boolean onSave(Object entity, Serializable id,Object [] state , String [] propertyNames,Type[] types){
		
		System.out.println("onSave method is invoking");
		System.out.println("details of entity are");
		if(entity instanceof Book){
			
			System.out.println("id of enity is" + id);
			System.out.println("PropertyNames");
			for(int i=0;i<propertyNames.length;i++){
				System.out.println(propertyNames[i]);
				if("name".equals(propertyNames[i])){
					state[i]="updated";
				}
			}
			Book book = (Book)entity;
			System.out.println("Book state is ");
			System.out.println(book);
		}
		return true;
	}
	
}