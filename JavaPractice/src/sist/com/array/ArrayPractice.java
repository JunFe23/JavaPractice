package sist.com.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc=new Scanner(System.in);
	int []m=new int[ArrayPractice.LEN];
	final static int LEN = 5;
	int cnt=0;
	
	public void inputData() {
		System.out.println("원하시는 메뉴를 선택해주세요. 1.add 2.modify 3.delete 4.clear");
		int input = sc.nextInt();
		switch(input) {
			case 1:
				System.out.println("add할 숫자를 입력해주세요.");
				int add1=sc.nextInt();
				add(add1);
				disp();
				inputData();
			case 2:
				System.out.println("modify할 숫자를 입력해주세요.(ex)모든 50을 10으로 바꿀 경우-50 10 a 입력");
				int fData=sc.nextInt(), sData=sc.nextInt();
				char state=sc.next().charAt(0);
				modify(fData, sData, state);
				disp();
				inputData();
			case 3:
				System.out.println("delete할 숫자를 입력해주세요.(ex)모든 50을 지울 경우 - 50 a 입력");
				int delData=sc.nextInt();
				char delState=sc.next().charAt(0);
				delete(delData, delState);
				disp(); 
				inputData();
			case 4:
				System.out.println("Data를 clear 하시겠습니까? y/n");
				char check = sc.next().charAt(0);
				if(check=='n') disp();
				else clear();
				disp();
				inputData();
		}
		}
	
	public boolean isFull() {
		return cnt>=m.length;
	}
	
	public boolean isEmpty() {
		return cnt==0;
	}
	
	public void increment() {
		if(isFull()) {
			int []imsi=new int[m.length*2];
			System.arraycopy(m, 0, imsi, 0, m.length);
			m=imsi;
		}
	}
	
	public void clear() {
		if(isEmpty()) return;
		for (int i = 0; i < m.length; i++) {
			m[i]=0;
		}
		cnt=0;
	}
	
	public void add(int data) {
		if(isFull()) {
			increment();
		}
		m[cnt++]=data;
	}
	
	public void add(int fData, int sData) {
		add(fData);
		add(sData);
	}
	
	public int search(int data) {
		for (int i = 0; i < m.length; i++) {
			if(m[i]==data) {
				return i;
			}
		}
		return -1;
	}
	
	public int search(int data, int fromIndex) {
		for (int i = fromIndex; i < m.length; i++) {
			if(m[i]==data)
				return i;
		}
		return -1;
	}
	
	public void deleteOrigin(int index) {
		for (int i = index; i < m.length; i++) {
			if(i==m.length-1) {
				m[i]=0;
				break;
			}
			m[i]=m[i+1];
		}
	}
	
	public void delete(int data, char state) {
		int index=search(data);
		if(index==-1) return;
		deleteOrigin(index);
		if(state=='a') delete(data, state);
	}
	
	public void delete(int data, int fromIndex) {
		int index=search(data, fromIndex);
		if(index==-1) return;
		deleteOrigin(index);
	}
	
	public void modify(int fData, int sData, char state) {
		int index=search(fData);
		if(index==-1)return;
		m[index]=sData;
		if(state=='a') modify(fData,sData,state);
		
	}
	
	public void disp() {
		if(cnt==0) {
			System.out.println("NoDataList");
			return;
		}
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%5d", m[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayPractice a=new ArrayPractice();
/*		a.add(10);
		a.add(10,20);
		a.add(30,40);
		a.add(30,40);
		a.delete(40,'a');
		a.disp();
*/		//a.modify(40, 60, 'a');
		a.inputData();
	}
}
