package Com.Artek;

public class Greeter {
   public void greek( greeting g){
	   g.perform();
	   
	   
   }
	public static void main(String[] args) {
		 Greeter g = new Greeter();
		

		//no need to create class instance to call method 
		greeting mylamdafunction =() -> System.out.println("hello world");
		
		
		mylamdafunction   .perform();
	}

}
// for declare type of lamda expression
 
