package sist.com.operator;

public class OperatorEx1 {
	
	public void Ex1() {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = (long)a * b;
		System.out.println(c);
	}
	
	public void Ex2() {
		char c = 'a';
		for(int i=0;i<26;i++) {
			System.out.println(c++);
		}
		System.out.println();
		
		c='A';
		for(int i=0;i<26;i++) {
			System.out.println(c++);
		}
		System.out.println();
	}
	
	public void Ex3() { // for문 조건이 안맞으니깐 for문 실행 안함.
		for(int i=0;i>5;i++) {
			System.out.println("JunFe");
		}
	}
	
	public void loopEx1() { //for문을 이용한 구구
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		System.out.println();
		}
	}
	
	public void loopEx2() { // while문을 이용한 구구
		int i = 1;
		int j = 1;
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
			j=1; // j를 초기화 해주어야함.
		}
	}
	
	public static void main(String[] args) {
		OperatorEx1 o=new OperatorEx1();
		//o.Ex1();
		//o.Ex2();
		//o.Ex3();
		//o.loopEx1();
		o.loopEx2();
	}
}
