package Com.Artek;

import java.util.Set;

public class Company {

	private Integer Companyid;
	private String CompanyName;
	
	private Set Event;

	public Integer getCompanyid() {
		return Companyid;
	}

	public void setCompanyid(Integer companyid) {
		Companyid = companyid;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public Set getEvent() {
		return Event;
	}

	public void setEvent(Set event) {
		Event = event;
	}
}
