package Com.Artek;

public class Lamda_Thread {

	public static void main(String[] args) { 
    
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello ");
				
			}
		});
		myThread.run();
		// no need to do all this things
	Thread	mylamdaThread = new Thread(()->System.out.println("hello"));
		 mylamdaThread.run();
 }
}
