package Com.Artek;

public class Account {

	private int accountnumber;
	private String owner;
	private double balance;
	
	
	public Account() {
		 
	}
	
	
	public Account(int accountnumber, String owner, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.owner = owner;
		this.balance = balance;
	}


	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
