package sist.com.algorithm1;

import java.util.Scanner;

public class 입출력과사칙연산11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=b/100;
		int d=(b-100*c)/10;
		int e=b-100*c-10*d;
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*b);
	}
}
