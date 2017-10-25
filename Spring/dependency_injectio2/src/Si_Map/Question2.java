package Si_Map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question2 {

	private int id;
	private String name;
	private Map<String, String> answer;
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
	public void displayinfo(){
		
		System.out.println(id+" :"+name);
		System.out.println("Answers are:-");
		Set<Entry<String, String>> set = answer.entrySet();
		Iterator<Entry<String, String>> itr =set.iterator();
		while (itr.hasNext()) {
		  Entry<String, String> entry = itr.next();
		  System.out.println("Answer :"+entry.getKey()+" "+"Posted by :"+entry.getValue());
		}
		 
	}
}
