package Com.Aartek.Model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	private static final String FetchType = null;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;
	@Column
	private String Name;
	
	
	 @OneToMany(targetEntity=Client.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "ref", referencedColumnName="userid")
	
	
	private List<Client> children;
	
	
	 
	public List<Client> getChildren() {
		return children;
	}
	public void setChildren(List<Client> children) {
		this.children = children;
	} 
	@Column
	private String Address;
	@Column
	private String City;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Column
	private String email;
     @Column
	private String password;
     
     public Integer getUserid() {
 		return userid;
 	}
 	public void setUserid(Integer userid) {
 		this.userid = userid;
 	}
	public String getEmail()  {
		
		return email;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}	

}
