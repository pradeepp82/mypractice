package Com.Artek;

public class Categories {

	private String name;
	private Book bk;
	
	/*public Categories(){
		System.out.println("default categories");
	}*/
	public Categories(Book bk)
    {
		System.out.println("through constructor");
           this.bk=bk;
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
		System.out.println("throuhg setter");
		this.bk = bk;
	}
	public void show(){
		
		System.out.println("categories name :"+name);
		System.out.println("Bookname :"+bk.getBookname()+" book price :"+bk.getBookprice());
	}
}
