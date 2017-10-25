package Com.Artek;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer companyid;
	private String companyname;
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Event.class,cascade=CascadeType.ALL)
	@JoinColumn(name="compid",referencedColumnName="companyid")
	private Set event;
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	 
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Set getEvent() {
		return event;
	}
	public void setEvent(Set event) {
		this.event = event;
	}

}
