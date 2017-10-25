package Com.Artek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="audiance")
public class Audiance {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer audianceid;
	
    private String audianceName;

	public Integer getAudianceid() {
		return audianceid;
	}

	public void setAudianceid(Integer audianceid) {
		this.audianceid = audianceid;
	}

	public String getAudianceName() {
		return audianceName;
	}

	public void setAudianceName(String audianceName) {
		this.audianceName = audianceName;
	}
 }
