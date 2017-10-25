package Ci_Map2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
 
	private int id;
	private String name;
	private Map<Answer, User> answer;
	public Question(int id, String name, Map<Answer, User> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void displayinfo(){
		System.out.println("question id:"+id);
		System.out.println("question name:"+name);
		System.out.println("Answers:-");
		
		Set<Entry<Answer, User>> set =answer.entrySet();
		Iterator<Entry<Answer, User>> itr =set.iterator();
		while (itr.hasNext()) {
			Entry<Answer, User> entry = itr.next();
			Answer ans= entry.getKey();
			User user =entry.getValue();
			
			System.out.println("Answer Information");
			System.out.println(ans);
			System.out.println("Posted by:");
			System.out.println(user);
		}
	}
}
