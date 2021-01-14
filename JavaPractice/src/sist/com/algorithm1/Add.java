package sist.com.algorithm1;

import java.util.Scanner;

public class Add {
	
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		new Add().input();
	}
	
}
