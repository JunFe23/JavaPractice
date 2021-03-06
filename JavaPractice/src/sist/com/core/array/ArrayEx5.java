package sist.com.core.array;

import java.util.Arrays;

public class ArrayEx5 {
	int [][]m=new int[2][5];
	int row=0,col=0;
	int cnt=0;
	
	public boolean isFull() {
		return col>=m[0].length-1&&row>=m.length-1;
	}
	
	public void increment() {
		int [][]imsi = new int[m.length*2][m[0].length];
		for (int i = 0; i < m.length-1; i++) {
			System.arraycopy(m[i], 0, imsi[0], 0, m[i].length);
		}
		m=imsi;
	}
	public void add(int data) {
		if(isFull()) {
			increment();
		}
		m[row][col++]=data;
		if(col>m[row].length-1) {
			col=0;
			row++;
		}
			
			
			
				
	}
	public void disp() {
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayEx5 a=new ArrayEx5();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		a.add(50);
		a.add(50);
		a.add(50);
		a.add(50);
		
		
		
		a.disp();
	}
}
