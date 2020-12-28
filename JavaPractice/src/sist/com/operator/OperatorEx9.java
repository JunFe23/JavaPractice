package sist.com.operator;

public class OperatorEx9 {
	public static void main(String[] args) {
		long a = 1_000_000*1_000_000; //계산 후 int형으로 돼서 값이 변해버림.
		long b = 1_000_000*1_000_000L; //계산 중 하나를 L형으로 바꿔줘서 값이 잘 나옴.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
