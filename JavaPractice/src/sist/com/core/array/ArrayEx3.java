package sist.com.core.array;

import java.util.Scanner;

public class ArrayEx3 {
	Scanner sc = new Scanner(System.in);
	public void arrayEx2() {
		System.out.println("행:");
		int row=sc.nextInt();
		System.out.println("열:");
		int col=sc.nextInt();
		int [][]r=new int[row][col];
		for(int []k:r) {
			for (int i = 0; i < k.length; i++) {
				k[i]=(int)(Math.random()*100);
			}
		}
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		ArrayEx3 a = new ArrayEx3();
		
	}
}
