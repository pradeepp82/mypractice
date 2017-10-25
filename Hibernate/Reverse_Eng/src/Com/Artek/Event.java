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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Event generated by hbm2java
 */
@Entity
@Table(name = "event", catalog = "Event_mgmt_anot")
public class Event implements java.io.Serializable {

	private Integer eventid;
	private Company company;
	private Manager manager;
	private Speaker speaker;
	private String eventName;
	private Set<Audiance> audiances = new HashSet<Audiance>(0);
	private Set<Location> locations = new HashSet<Location>(0);

	public Event() {
	}

	public Event(Company company, Manager manager, Speaker speaker, String eventName, Set<Audiance> audiances,
			Set<Location> locations) {
		this.company = company;
		this.manager = manager;
		this.speaker = speaker;
		this.eventName = eventName;
		this.audiances = audiances;
		this.locations = locations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "eventid", unique = true, nullable = false)
	public Integer getEventid() {
		return this.eventid;
	}

	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compid")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "man_id")
	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spk_id")
	public Speaker getSpeaker() {
		return this.speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Column(name = "eventName")
	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<Audiance> getAudiances() {
		return this.audiances;
	}

	public void setAudiances(Set<Audiance> audiances) {
		this.audiances = audiances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<Location> getLocations() {
		return this.locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

}