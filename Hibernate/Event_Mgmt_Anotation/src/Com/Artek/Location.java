package Com.Artek;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer locationid;
	
	private String locationName;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="event_id",referencedColumnName="eventid")
	private Event event;


	public Integer getLocationid() {
		return locationid;
	}


	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}


	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}
}
