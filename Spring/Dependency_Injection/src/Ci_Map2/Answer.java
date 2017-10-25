package Ci_Map2;

import java.util.Date;

public class Answer {

	private int id;
	private String name;
	private Date posteddate;
	public Answer(int id, String name, Date posteddate) {
		super();
		this.id = id;
		this.name = name;
		this.posteddate = posteddate;
	}
	
	
	public String toString(){
		return id+name+posteddate;
	}
}
