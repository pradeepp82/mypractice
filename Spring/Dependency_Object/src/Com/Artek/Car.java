package Com.Artek;

public class Car implements Vehicle {

	 private String fueltype;
	 private int maxspeed;
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	public void move() {
	
		System.out.println("fuel type :"+fueltype);
		System.out.println("max speed :"+maxspeed);
        System.out.println("car started");
		
	}

}
