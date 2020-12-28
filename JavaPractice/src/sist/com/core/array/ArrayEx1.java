package sist.com.core.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx1 {

	public void arrayMethod1() {
//		int [][]m=new int [][]; error
//		int [][]m=new int [][5]; error
		int [][]m=new int [2][5]; //no error 2행 5
									//m[0] -> [0,0][0,1][0,2][0,3][0,4]
									//m[1] -> [1,0][1,1][1,2][1,3][1,4]
		int cnt=0;
		Random r = new Random();
		for (int i = 0; i < m.length; i++) { //m.length는 행의 길이 
			for (int j = 0; j < m[i].length; j++) { //m[i].length는 m행의 열길이  
				m[i][j]=r.nextInt(100);
			}
		}
		for (int i = 0; i < m.length; i++) { //m.length는 행의 길이 
			for (int j = 0; j < m[i].length; j++) { //m[i].length는 m행의 열길이  
				System.out.printf("%s[%d][%d] = %d\n",'m',i,j,m[i][j]);
			}
		}
		for (int i = 0; i < m.length; i++) { //2행 5열 표
        System.out.println(Arrays.toString(m[i]));   
     	}
		
		for(int []a:m) { //2행 5열 표시
			for(int j:a) {
				System.out.print(j+"\t");//5칸 간격으로 표시
			}
			System.out.println();
     }
	
	}
	
	
	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1();
		a.arrayMethod1();
	}
}
