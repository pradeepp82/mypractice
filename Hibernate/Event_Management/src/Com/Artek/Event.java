package Com.Artek;

import java.util.Set;

public class Event {

	private Integer Eventid;
	private String EventName;
	private Integer foreventid;
	
	private Set audiance;
	
	private Manager m;	
	private Speaker s;
	public Speaker getS() {
		return s;
	}
	public void setS(Speaker s) {
		this.s = s;
	}
	public Manager getM() {
		return m;
	}
	public void setM(Manager m) {
		this.m = m;
	}
	public Integer getForeventid() {
		return foreventid;
	}
	public void setForeventid(Integer foreventid) {
		this.foreventid = foreventid;
	}
	
	public Integer getEventid() {
		return Eventid;
	}
	public void setEventid(Integer eventid) {
		Eventid = eventid;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	
	public Set getAudiance() {
		return audiance;
	}
	public void setAudiance(Set audiance) {
		this.audiance = audiance;
	}
	
}
