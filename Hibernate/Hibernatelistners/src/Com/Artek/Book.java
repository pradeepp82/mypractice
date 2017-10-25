package Com.Artek;

public class Book {
    private int isbn;
    private String name;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    @Override
    public String  toString(){
    	return"Book [isbn="+isbn+", name= " + name + "]";
    }
}
