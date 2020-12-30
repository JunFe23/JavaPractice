package sist.com.core.array;

import java.util.Arrays;

public class ArrayEx2 {

	public void arrayMethod2() {
		/*int []x = {1,2,3,4,5,99};
		int []y = {6,7,8,9,10,98};
		int []z = {11,12,13};
		
		int [][]a = new int [3][];
		
		a[0]=x;
		a[1]=y;
		a[2]=z;
		
		System.out.println(a[0][0]);*/
		
		//char []m = new char [5];
		char []m = {'a', 'b', 'c', 'd', 'e'};
		m[0]='1';
		System.out.println(Arrays.toString(m));
	}
	
	public static void main(String[] args) {
		ArrayEx2 a = new ArrayEx2();
		a.arrayMethod2();
	}
	
}
