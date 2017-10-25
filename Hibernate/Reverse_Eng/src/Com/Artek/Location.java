package Com.Artek;
// Generated 8 Jul, 2017 1:33:49 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Location generated by hbm2java
 */
@Entity
@Table(name = "location", catalog = "Event_mgmt_anot")
public class Location implements java.io.Serializable {

	private Integer locationid;
	private Event event;
	private String locationName;

	public Location() {
	}

	public Location(Event event, String locationName) {
		this.event = event;
		this.locationName = locationName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "locationid", unique = true, nullable = false)
	public Integer getLocationid() {
		return this.locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_id")
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Column(name = "locationName")
	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
