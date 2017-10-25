package Com.Artek;

public class Bus implements Vehicle {

	private int maxspeed; 
	
	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public void move() {
		System.out.println("max speed"+maxspeed);
		System.out.println("Bus started");
		
	}

	
}
