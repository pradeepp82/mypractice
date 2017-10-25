package Testbean;
public class TestBean implements java.io.Serializable
{

    private String firstName = null;
    private String lastName = null;
             private int age = 0;
    public TestBean() {
                    }
	public String getFirstName(){
		return firstName;
		}
	public String getLastName(){
			return lastName
			;
			}
	 
   public void setFirstName(String firstName){
     this.firstName = firstName;
     }
   public void setLastName(String lastName){
     this.lastName = lastName;
       }
     
}