package sist.com.obj.basic1;
//����ó��
//��ȣ �̸� ���� ���� ���� ���� ��� ��� ����

import java.util.Scanner;

public class �������� {
	Scanner sc=new Scanner(System.in);
	����[] informations=new ����[5];
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
		
		���� info=new ����();
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
		����[] imsi=new ����[informations.length*2];
		System.arraycopy(informations, 0, imsi, 0, informations.length);
		informations=imsi;
	}
	
	
	
	public static void main(String[] args) {
		�������� m=new ��������();
		m.addInfo();
		
	}
}
