package sist.com.algorithm3;

import java.util.Scanner;

public class For3 { // �־��� ���ڸ�ŭ ���ϱ�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		
		int sum=0;
		for (int i = 0; i < x+1; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
