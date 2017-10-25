package Con.Collection2;

import java.util.Iterator;
import java.util.List;

public class Question1 {
 private int id;
 private String name;
 private List<Answer> answer;
public Question1(int id, String name, List<Answer> answer) {
	super();
	this.id = id;
	this.name = name;
	this.answer = answer;
}
 
 public void displayinfo(){
	 
	 System.out.println(id +" "+name);
	 System.out.println("answer : -");
	 Iterator<Answer> itr = answer.iterator();
	 while (itr.hasNext()) {
		System.out.println(itr.next()); 
		
	}
 }
}
