package sist.com.obj.basic5;

public class BookMain {

	public static void main(String[] args) {
		//Book book=new Book();//new�ϸ� �޸� heap book�� �Ӽ��� �޸𸮰� �Ҵ�
		//author, price, publisher, bookName�� �޸𸮿� �Ҵ�
		//book.author="JunFe";//Book �ȿ��� private�̱� ������ error��
		Book.getBookInstance().setPrice(5000);
		System.out.println(Book.getBookInstance().getPrice());//getBookInstance�� new�� return�ϴϱ� 0�̳���.
	}
}
