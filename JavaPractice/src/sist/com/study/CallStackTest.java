package sist.com.study;
//JVM의 메모리 구조

//1. 메서드 영역(method area)
//2. 힙(heap)
//3. 호출스택(call stack or execution stack)

//메소드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
//메서드가 수행을 마치고 나면 사용했던 메모리를 반환하고 스택에서 제거된다.
//호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
//아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static메서드는 객체 생성없이 호출가능하다.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod");
	}
}
