package sist.com.operator;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; //a * b는 이미 int 값이므로 float으로 형변환해도 값이 돌아오지 않음.
		long d = (long)a * b;
		
		System.out.println(c);
		System.out.println(d);
	}
}
