package sist.com.core.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
	public void arrayMethod1() {
		int [][]m=new int[3][4];
		
		int cnt=0;
		Random r=new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=r.nextInt(100);
			}
		}
		for(int a[]:m) {
			for(int j:a) {
				System.out.print(j+"\t");
			}
		System.out.println();
		}
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	public void arrayMethod2() {
		int []x={1,2,3,4,5};
		int []y={6,7,8,9,10};
		int []z={11,12,13};
		
		int [][]a=new int[3][];
		a[0]=x;
		a[1]=y;
		a[2]=z;
		
		System.out.println(a[2][2]);
		
		char []m= new char[5];
		m[0]= 'a';
		
		System.out.println(Arrays.toString(m));
	}
	
	public static void main(String[] args) {
		ArrayPractice a=new ArrayPractice();
		a.arrayMethod2();
	}
}
