package Si_Map2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question3 {
	private int id;
	private String name;
	private Map<Answer3, User3> answers;
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
	public Map<Answer3, User3> getAns() {
		return answers;
	}
	public void setAns(Map<Answer3, User3> answers) {
		this.answers = answers;
	}
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<Answer3, User3>> set=answers.entrySet();  
	    Iterator<Entry<Answer3, User3>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answer3, User3> entry=itr.next();  
	        Answer3 ans=entry.getKey();  
	        User3 user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}  

}
