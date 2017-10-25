package Com.Artek;
import java.util.Set;
public class Company {
   private int Companyid;
   private String CompanyName;
   private Set children;
public int getCompanyid() {
	return Companyid;
}
public void setCompanyid(int companyid) {
	Companyid = companyid;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}
 
}
