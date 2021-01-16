package sist.com.algorithm2;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b<45) {
			if(a==0) {
				a=23;
				b=60-(45-b);
				System.out.printf("%d %d",a,b);
			}else {
				a-=1;
				b=60-(45-b);
				System.out.printf("%d %d",a,b);
			}
		}else if(b>=45){
			b-=45;
			System.out.printf("%d %d",a,b);
		}
		
	}
}
