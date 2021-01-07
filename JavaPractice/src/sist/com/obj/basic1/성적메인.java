package sist.com.obj.basic1;
//성적처리
//번호 이름 국어 영어 수학 총점 평균 등수 학점

import java.util.Scanner;

public class 성적메인 {
	Scanner sc=new Scanner(System.in);
	정보[] informations=new 정보[5];
	int cnt;
	
	
	public boolean isFull() {
		return cnt==informations.length-1;
	}
	public void addInfo() {
		/*private int num=1;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private int avg;
		private int no;
		private String grade;*/
		
		정보 info=new 정보();
		int num=1;
		info.setNum(num++);
		System.out.println("name : ");
		info.setName(sc.next());
		System.out.println("korScore : ");
		info.setKor(sc.nextInt());
		System.out.println("engScore : ");
		info.setEng(sc.nextInt());
		System.out.println("mathScore : ");
		info.setMath(sc.nextInt());
		if(isFull()) increment();
		informations[cnt++]=info;
				
	}
	
	public void increment() {	
		정보[] imsi=new 정보[informations.length*2];
		System.arraycopy(informations, 0, imsi, 0, informations.length);
		informations=imsi;
	}
	
	
	
	public static void main(String[] args) {
		성적메인 m=new 성적메인();
		m.addInfo();
		
	}
}
