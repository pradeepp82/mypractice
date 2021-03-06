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
 * Audiance generated by hbm2java
 */
@Entity
@Table(name = "audiance", catalog = "Event_mgmt_anot")
public class Audiance implements java.io.Serializable {

	private Integer audianceid;
	private Event event;
	private String audianceName;

	public Audiance() {
	}

	public Audiance(Event event, String audianceName) {
		this.event = event;
		this.audianceName = audianceName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "audianceid", unique = true, nullable = false)
	public Integer getAudianceid() {
		return this.audianceid;
	}

	public void setAudianceid(Integer audianceid) {
		this.audianceid = audianceid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Event_Id")
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Column(name = "audianceName")
	public String getAudianceName() {
		return this.audianceName;
	}

	public void setAudianceName(String audianceName) {
		this.audianceName = audianceName;
	}

}
