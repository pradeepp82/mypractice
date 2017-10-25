package Com.Artek;
// Generated 8 Jul, 2017 1:33:49 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Company generated by hbm2java
 */
@Entity
@Table(name = "company", catalog = "Event_mgmt_anot")
public class Company implements java.io.Serializable {

	private Integer companyid;
	private String companyname;
	private Set<Event> events = new HashSet<Event>(0);

	public Company() {
	}

	public Company(String companyname, Set<Event> events) {
		this.companyname = companyname;
		this.events = events;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "companyid", unique = true, nullable = false)
	public Integer getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}

	@Column(name = "companyname")
	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	public Set<Event> getEvents() {
		return this.events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

}
