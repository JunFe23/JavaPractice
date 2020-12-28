package sist.com.array;

import java.util.Arrays;

public class ArrayEx11 {
	int []m = new int [5]; // [99][9][7][][]
	int cnt; // 초기값은 0, String은 null
	final static int LEN = 5;
	
	public boolean isFull() { //메모리가 가득찼는지 확인 
		return cnt>=m.length;
	}
	
	public boolean isEmpty() { //메모리가 비어있는 상태 
		return cnt==0;
	}
	
	public void clear() { //메모리를 최초 상태로 
		if(isEmpty()) return;
		for (int i = 0; i < m.length; i++) {
			m[i]=0;
		//m=new int[ArrayEx11.LEN];
		}
		cnt=0;
	}
	public void increment() {
		int []imsi=new int[m.length*2];//[][][][][]*2
		System.arraycopy(m, 0, imsi, 0, m.length); //배열복사 
		m=imsi;
	}
	
	public void add(int fData) {
		if(isFull()) {
			increment();
		}
		m[cnt++]=fData;
		
		//disp();
	}public void add(int fData, int sData) {
		add(fData);
		add(sData);
	}
	
	public void disp() {
		if(cnt==0) {
			System.out.println("NoDataList");
			return;
		}
		for(int i=0;i<cnt;i++) {
			System.out.printf("%5d",m[i]);
		}
		System.out.println();
		//System.out.println(Arrays.toString(m));
	}
	
	public int search(int data) { //0부터 찾는 서치 
		for(int i=0;i<m.length;i++) {
			if(m[i]==data) {
				return i;
			}
		}
		return -1;
	}
	public int search(int data, int fromIndex) { //지정한 숫자부터 찾는 서치(오버로드)
		for(int i=fromIndex;i<m.length;i++) {
			if(m[i]==data) {
				return i;
			}
		}
		return -1;
	}
	
	public void deleteOrgin(int index) {
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
		if(index==-1)return;
		deleteOrgin(index);
		if(state=='a')delete(data, state);
		}
	public void delete(int data, int fromIndex) {
		int index=search(data, fromIndex);
		if(index==-1)return;
		deleteOrgin(index);
	}
	
	public void modifyOrigin(int index, int change) {
		m[index]=change;
	}
	public void modify(int origin, int change, char state) {
		int index=search(origin);
		if(index==-1)return;
		modifyOrigin(index, change);
		if(state=='a') modify(origin, change, state);
	}
	public void modify(int origin, int change, int fromIndex) {
		int index=search(origin, fromIndex);
		if(index==-1)return;
		modifyOrigin(index, change);
	}
	
	public static void main(String[] args) {
		ArrayEx11 a = new ArrayEx11();
		a.add(10,20); //[10][20][30][40][50]
		a.add(30);
		a.add(40,30);
		a.modify(30,300,3);
		a.disp();
	
		//System.out.println(a.search(300));
	}
}
