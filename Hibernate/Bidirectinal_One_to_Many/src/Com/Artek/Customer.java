package Com.Artek;

public class Customer {
     private Integer customerid;
     private String customername;
    private Integer forevenid;
      private Vendor parentobject;
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Integer getForevenid() {
		return forevenid;
	}
	public void setForevenid(Integer forevenid) {
		this.forevenid = forevenid;
	}
	public Vendor getParentobject() {
		return parentobject;
	}
	public void setParentobject(Vendor parentobject) {
		this.parentobject = parentobject;
	}
   
}
