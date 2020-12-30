package sist.com.core.array;

import java.util.Arrays;

public class ArrayEx4 {
	
	
	
	
	public void sum(int [][]m) {
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
				m[i][m[i].length-1]+=m[i][j];
				m[m.length-1][i]+=m[j][i];
			}
			m[m.length-1][m[i].length-1]+=m[i][i];
		}
	}
	
	 public void disp(int [][]m) {
	      for (int i = 0; i < m.length; i++) {
	         for (int j = 0; j < m[i].length; j++) {
	            System.out.printf("%5d",m[i][j]);
	         }
	         System.out.println();
	      }
	      System.out.println();
	 }
	 
	 public void initArray(int [][]array) {
		 int cnt=0;
		 	for (int i = 0; i < array.length; i++) {
		 		for (int j = 0; j < array[i].length; j++) {
		 			array[i][j]=++cnt;
		 		}
		 	}	
	}
	   
	 public void changeData(int [][]a, int[][]b) {
		int h=0, y=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]=a[h][y];
				if(y<a[i].length-1) {
					y++;
				}
				else{
					h++;
					y=0;
				}
			}
		}
	 }

	
	 public static void main(String[] args) {
		 int [][]m = {{10, 20, 30, 0},
					{40, 50, 60, 0},
					{70, 80, 90, 0},
					{0,  0,  0,  0}};
		 final int ROW=4, COL=3;
		 int [][]x=new int[ROW][COL];
		 int [][]y=new int[COL][ROW];
		 ArrayEx4 a = new ArrayEx4();
		 a.sum(m);
		 a.initArray(x);
		 a.disp(x);
		 a.changeData(x, y);
		 a.disp(y);
	 }	
}
