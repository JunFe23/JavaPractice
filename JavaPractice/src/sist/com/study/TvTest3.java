package sist.com.study;

public class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; // t1이 저장하고 있는 값(주소)을 t2에 저장한다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 " + t1.channel + "로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// 하나의 인스턴스를 여러 개의 참조변수가 가리키는 경우 - 가능
		// 여러 인스턴스를 하나의 참조변수가 가리키는 경우  - 불가능
	}
}
