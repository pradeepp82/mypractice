package Com.Artek;
import java.util.Set;
public class Vendor {
   private int venderId;
   private String venderName;
   private Set children;
public int getVenderId() {
	return venderId;
}
public void setVenderId(int venderId) {
	this.venderId = venderId;
}
public String getVenderName() {
	return venderName;
}
public void setVenderName(String venderName) {
	this.venderName = venderName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}
}
