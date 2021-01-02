package sist.com.array;

public class ArrayPractice {
	int []m=new int[ArrayPractice.LEN];
	final static int LEN = 5;
	int cnt=0;
	
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
	
	public void deleteOrigin(int data) {
		for (int i = 0; i < m.length; i++) {
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
		deleteOrigin(data);
		if(state=='a') delete(data, state);
	}
	
	public void delete(int data, int fromIndex) {
		int index=search(data, fromIndex);
		if(index==-1) return;
		deleteOrigin(data);
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
		a.add(10);
		a.add(10,20);
		a.add(30,40);
		a.add(30,40);
		//a.delete(10,'a');
		//a.modify(40, 60, 'a');
		a.disp();
	}
}
