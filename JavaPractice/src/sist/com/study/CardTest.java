package sist.com.study;
//인스턴스변수(instance variable)
//- 클래스영역에 선언, 인스턴스가 생성되었을 때 생성, 독립적인 저장공간을 가짐(heap)

//클래스변수(class variable)
//- 인스턴스변수 앞에 static을 붙임, 클래스 영역에 선언, 클래스가 메모리에 올라갈 때 생성되어 프로그램이 종료될 때 까지 유지

//지역변수(local variable)
//클새스 영역 이외의 영역(메서드, 생성자, 초기화 블럭 내부) 선언, 변수 선언문이 수행되었을 때 생성
public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); // 클래스 변수 직접사용 가능
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart"; // 인스턴스변수 값을 변경
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50; // 클래스변수의 값을 변경한다.
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며 크기는 (" + c2.width + ", " + c2.height + ")");
		
	}
}
//인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 가긱 다른 값을 유지할 수 있지만, 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.