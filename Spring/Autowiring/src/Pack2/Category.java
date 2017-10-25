package Pack2;
public class Category {
 
	private String name;
	private Book bk;
	private Pen p;
 
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Book getBk() {
		return bk;
	}
 
	public void setBk(Book bk) {
		this.bk = bk;
	}
 
	public void show()
	{
		System.out.println("Categories name :"+name);
		System.out.println("Pen :"+p.getName());
		System.out.println("Book name :"+bk.getBookname()+" and Book Price :"+bk.getBookprice());
		System.out.println("child of book :"+bk.getC().getName());
	}
 
}