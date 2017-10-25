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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer eventid;
	
	private String eventName;
	@OneToOne(targetEntity=Manager.class,cascade=CascadeType.ALL)
	@JoinColumn(name="man_id",referencedColumnName="managerid")
	private Manager mg;
	
	@OneToOne(targetEntity=Speaker.class,cascade=CascadeType.ALL)
    @JoinColumn(name="spk_id",referencedColumnName="speakerid")
	private Speaker sp;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Audiance.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "Event_Id", referencedColumnName="eventid")
	private Set audiance;
	
	public Set getAudiance() {
		return audiance;
	}
	public void setAudiance(Set audiance) {
		this.audiance = audiance;
	}
	public Speaker getSp() {
		return sp;
	}
	public void setSp(Speaker sp) {
		this.sp = sp;
	}
	public Manager getMg() {
		return mg;
	}
	public void setMg(Manager mg) {
		this.mg = mg;
	}
	public Integer getEventid() {
		return eventid;
	}
	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
