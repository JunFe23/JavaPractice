package sist.com.operator;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a; //a * a값이 int형의 범위를 벗어나 값이 변질.
		int result2 = a / a * a; //나누기 먼저해서 int형 범위를 벗어나진 않음.
		
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
	}
}
