package sist.com.matrixeffect;

import java.util.Random;

public class Ex2 {
	final int WIDTH=120, HEIGHT=10;
	char[][] buffer;
	int[] rank;
	private static final String TEXT =new String ("あたアカサザジズゼゾシスセソキクケコイウエオジャな");

	public Ex2() {
		buffer = new char[HEIGHT][WIDTH];
		rank = new int[WIDTH];
		
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				buffer[i][j] = ' ';
			}
		}
		
		for (int i = 0; i < WIDTH; i++) {
			rank[i] = 0;
		}
	}
	
	public void compute() {
		for(int i=HEIGHT-1;i>0;i--) {
			for (int j = 0; j < WIDTH; j++) {
				buffer[i][j] = buffer[i-1][j];
			}
		}
		
		for(int j=0; j<WIDTH; j++) {
			buffer[0][j] = getChar(j);
			if(buffer[0][j]==' ')
				rank[j] = 0;
			else
				rank[j]++;
		}
	}
	
	public char getChar(int p) {
		Random r = new Random();
		
		char n = (char)(r.nextInt(25)+65);
		
		return rank[p]>0?(r.nextInt(100)<70?n:' '):(r.nextInt(100)<1?n:' ');
	}
	
	public void print() {
		
		for(int i=0; i<HEIGHT; i++)
			System.out.println(getLine(i));
		System.out.flush();
	}
	
	public String getLine(int row) {
		String result = "";
		
		for (int i = 0; i < WIDTH; i++) {
			result += buffer[row][i];
		}
		return result;
	}
	public static void main(String[] args) throws InterruptedException {
		Ex2 e = new Ex2();
		
		do {
			e.compute();
			e.print();
			Thread.sleep(50);
		} while (true);
	}
}
