package sist.com.core.array;

import java.util.ArrayList;

public class ArrayEx7 {
	
	public void makerClass1() {
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			list.add(i+1);//[1][2][3][4][5][6][7][8][9][10]
			
		list.remove(5);//해당 index 삭제.
		System.out.println(list); 
	}
	
	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		a.makerClass1();
	}
}
