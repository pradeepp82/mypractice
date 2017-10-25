package Test_Constructor;

public class Employee {

	 private Integer id;
	 private String name;
	 
	 
	 public Employee(Integer id, String name) {

		this.id = id;
		this.name = name;
	}

	
	 
	 
	 public Employee() {
		 System.out.println("default cons");
	}
	 
	/*public Employee(Integer id) {
		this.id = id;

	}
	
	public Employee(String name) {
		this.name = name;
	}*/
	 
	 void show(){
		 
		 System.out.println(id+" :"+name);
	 }
}
