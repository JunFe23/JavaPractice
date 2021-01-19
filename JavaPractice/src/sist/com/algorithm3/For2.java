package sist.com.algorithm3;

import java.util.Scanner;

public class For2 { // 반복할 숫자 처음에 입력 후, 그 숫자만큼 반복해서 두 개 수 더하기 수행하는 프로그램.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int y=sc.nextInt();
			int z=sc.nextInt();
			int c= y+z;
			System.out.println(c);
			
		}
	}
}
