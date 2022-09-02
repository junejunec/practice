public class Book extends TangibleAsset{
	private String isbn;
	public Book(String ame, int price, String colour, String isbn){
		super(name, price, colour);
		this.isbn = isbn;
	}

	public String getIsbn(){
		return this.isbn
	}
}
