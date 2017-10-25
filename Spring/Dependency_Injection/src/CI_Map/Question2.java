package CI_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question2 {

	private int id;
	private String name;
	private Map<String,String> answer;
	
	public Question2(int id, String name, Map<String, String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void displayinfo(){
		
		System.out.println("Question id :"+id);
		System.out.println("Question name :"+name);
		System.out.println("Answers:-");
		Set<Entry<String,String>> set = answer.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry =itr.next();
			System.out.println("Answer"+entry.getKey()+"posted by:"+entry.getValue());
			
		}
	}
}
