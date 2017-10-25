package Com.Artek;

public class Main {

	private String msg;

	public Main(){
		System.out.println("default constructor");
	}
	
   public void destroy(){
		
		System.out.println("bean is going thorugh destroy");
	}
	public String getMsg() {
		return msg;
	}
	public void initre(){
	      System.out.println("Bean is going through init.");
	   }

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void display(){
		
		System.out.println(msg);
	}
}
