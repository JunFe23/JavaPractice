package sist.com.variable;

 

public class Casting {

	public void practice1() {

		double a = 173.5;

		int height = (int)a;//double타입의 변수 a를 int타입으로 형변환

		System.out.println("height = " + height);

		System.out.println("a = " + a);

	}

	public void practice2() {

		int a = 65;

		char b = 'A';

		float c = 1.6f;

		int d = 10;

		System.out.println((char)a);// int를 char로 형변환

		System.out.println((int)b);// char를 int로 형변환

		System.out.println((int)c);// float을 int로 형변환, 소수점은 버림

		System.out.println((float)d);// int를 float으로 형변환

	}

	public void practice3() {

		// int -> byte 형변환

		// int의 값이 byte의 값범위를 초과하지 않을 때

		int a = 10;

		byte b = (byte)a;

		System.out.printf("[int -> byte] a = %d -> b = %d%n", a, b);

		// int의 값이 byte의 값범위를 초과할 때

		a = 300;

		b = (byte)a;

		System.out.printf("[int -> byte] a = %d -> b = %d%n", a, b);

		// byte -> int 형변환

		b = 10;

		a = (int)b;

		System.out.printf("[byte -> int] b = %d -> a = %d%n", b, a);

		// 음수일 때, byte -> int 형변환

		b = -2;

		a = (int)b;

		System.out.printf("[byte -> int] b = %d -> a = %d%n", b, a);

		System.out.println("a = " + Integer.toBinaryString(a));// a = -2를 이진수로 표현

	}

	public void practice4() {

		float f = 9.1234567f;

		double d = 9.1234567;

		double d2 = (double)f;

		System.out.printf("f = %20.18f\n", f);

		System.out.printf("d = %20.18f\n", d);

		System.out.printf("d2 = %20.18f\n", d2);//같은 값을 저장해도 float과 double의 정밀도 차이때문에 서로 다른 값이 저장된다.

	}

	public void practice5() {

		int i = 91234567; // 8자리 10진수

		float f = (float)i; // int를 float으로 형변환

		int i2 = (int)f; // float를 다시 int로 형변환

		double d = (double)i; // int를 double로 형변환

		int i3 = (int)d; // double을 다시 int로 형변환

		float f2 = 1.666f; // 소수점 3자리를 포함한 실수

		int i4 = (int)f2; // float을 int로 형변환

		System.out.printf("i = %d\n", i); // int를 float으로 형변환할 때와 double로 형변환할 때 실수형의 정밀도 제한으로 인한 오차가 발생.

		System.out.printf("f = %f i2 = %d\n", f, i2);

		System.out.printf("d = %f i3 = %d\n", d, i3);

		System.out.printf("f2 = %f i4 = %d\n", f2, i4); // float을 int로 형변환할 때 소수점은 버려짐.

	}

	public double practice6(){

		int i = 3;

		double d = 1.0 + i; // i가 double로 자동형변환 됨.

		return d;

	}

	public void practice7(int a, float b) {

		double c;

		c=(double)a; // c에 double로 형변환한 a 대입

		a=(int)b; // a에 int로 형변환한 b 대입

		b=(float)c; // b에 float으로 형변환한 c 대입

		System.out.println("a = " + a);

		System.out.println("b = " + b);

	}

	public void practice8(int a, int b, String c) { // int형 <-> string형 형변환

		String str=Integer.toString(a+b)+"ing"; // a+b의 int형을 String형으로 형변환 

		System.out.println(str); // 110ing라는 문자열 출력

		System.out.println(str.length()); // 110ing는 6글자로 6출력

		System.out.println(c.length());

		int num = Integer.parseInt(c); // String형을 int형으로 형변환

		System.out.println(num);

		int d = a + b + num; // c가 형변환된 num은 int형이므로 계산이 가능

		System.out.println(d); // d값 출력 = 233

	}

	public void practice9(int a, boolean b) { // integer <-> boolean 형변환 

		// boolean c = (boolean) a; -> error

		//System.out.println(c);

		// int d = (int) b; -> error

		//System.out.println(d);

	}

	public void practice10(int a, boolean b) { // boolean -> int 형변환

		int e = (b) ? 1 : 0;

		System.out.println(e); // true니까 1 출력, false는 0

	}

	public static void main(String[] args) {

		Casting c = new Casting();

		//c.practice1();

		//c.practice2();

		//c.practice3();

		//c.practice4();

		//c.practice5();

		/*double d = c.practice6();

		System.out.printf("d = %f\n", d); // return d로 출력

		c.practice7(100, 1);*/

		c.practice8(100, 10, "123");

		c.practice9(1, true);

		c.practice10(1, true);

	}

}