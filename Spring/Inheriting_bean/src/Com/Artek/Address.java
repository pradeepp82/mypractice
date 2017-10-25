package Com.Artek;

public class Address {

	private String addressline,city,state,country;

	public Address(String addressline, String city, String state, String country) {
		this.addressline = addressline;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String toString(){
		return addressline+" "+city+" "+state+" "+country;
	}
}
