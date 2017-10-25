package Com.Artek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="speaker")
public class Speaker {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer speakerid;
	
	private String speakerName;

	public Integer getSpeakerid() {
		return speakerid;
	}

	public void setSpeakerid(Integer speakerid) {
		this.speakerid = speakerid;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}
}
