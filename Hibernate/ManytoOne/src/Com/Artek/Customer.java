package Com.Artek;

public class Customer {
   private Integer customerid;
   private String customerName;
   private Vendor parentObject;
/*public Customer(String customerName, Vendor parentObject) {
	 this.customerName=customerName;
	 this.parentObject=parentObject;
}*/
public Integer getCustomerid() {
	return customerid;
}
public void setCustomerid(Integer customerid) {
	this.customerid = customerid;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Vendor getParentObject() {
	return parentObject;
}
public void setParentObject(Vendor parentObject) {
	this.parentObject = parentObject;
} 	
   
}