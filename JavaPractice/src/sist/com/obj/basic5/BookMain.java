package sist.com.obj.basic5;

public class BookMain {

	public static void main(String[] args) {
		//Book book=new Book();//new하면 메모리 heap book의 속성의 메모리가 할당
		//author, price, publisher, bookName이 메모리에 할당
		//book.author="JunFe";//Book 안에서 private이기 때문에 error남
		Book.getBookInstance().setPrice(5000);
		System.out.println(Book.getBookInstance().getPrice());//getBookInstance가 new를 return하니깐 0이나옴.
	}
}
