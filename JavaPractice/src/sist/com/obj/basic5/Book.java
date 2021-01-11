package sist.com.obj.basic5;

public class Book {
	private String author;//속성
	private int price;
	private String publisher;
	private String bookName;
	
	private static Book book;
	
	private Book() {//alt+shift+s+o+deselect
		super();
	}
	
	private Book(String author, int price, String publisher, String bookName) {//alt+shift+s+o 생성자 생성
		super();
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.bookName = bookName;
	}
	
	public static Book getBookInstance() {//static에서는 this를 부를 수 없음
		//1번만 생성 -> 싱글턴
		if(book==null) {
			book=new Book();
		}
		return book;
	}
	
	//alt+shift+s+r : getter&setter
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	
}
