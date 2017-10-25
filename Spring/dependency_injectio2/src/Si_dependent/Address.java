package Si_dependent;

public class Address {
	
	private String addressl,city,state,country;

	public String getAddressl() {
		return addressl;
	}

	public void setAddressl(String addressl) {
		this.addressl = addressl;
	}

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString(){
		
		return addressl+" "+city+" "+state+" "+country;
	}
}
