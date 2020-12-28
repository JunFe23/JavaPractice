package sist.com.operator;

public class OperatorEx7 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b; //error -> 연산을 하면 기본형이 int
		byte c = (byte)(a + b);
		System.out.println(c);
	}
}
