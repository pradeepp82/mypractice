package Pack2;
public class Book {
 
	private String bookname;
	private int bookprice;
	private Copy c;
 
	public Copy getC() {
		return c;
	}
	public void setC(Copy c) {
		this.c = c;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}	   
 
}