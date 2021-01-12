package sist.com.study;
//메서드(Method) - 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것이다.

//메서드를 사용하는 이유

//1. 높은 재사용성(reusability)
//2. 중복된 코드의 제거
//3. 프로그램의 구조화


//메서드의 선언과 구현

//반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
//{
//			코드
//}

//메서드의 호출

//메서드이름(값1, 값2, ...);  //메서드를 호출하는 방법

//인자(argument)와 매개변수(parameter)
//메서드를 호출할 때 괄호 ()안에 지정해준 값들을 '인자(argument)'또는 '인수'라고 하는데, 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와 일치해야 한다.

//return문
//반환값(return value)
//매개변수의 유효성 검사

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multifly(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}
