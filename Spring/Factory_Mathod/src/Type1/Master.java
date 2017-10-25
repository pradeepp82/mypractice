package Type1;

public class Master {

	private static final Master obj= new Master();
	
	private Master(){
		System.out.println("private constructor");
	}
	public static Master getMaster(){
		System.out.println("factory method");
		return obj;
	}
	
	public void msg(){
		
		System.out.println("hello user");
	}
}
