package Com.Artek;

public class Travel implements Journey {

	private Vehicle v;
	public void setV(Vehicle v){
		this.v=v;
	}
	public void startjourney() {
	 System.out.println("Journry started");
	 v.move();
		
	}

}
