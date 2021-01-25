package sist.com.io1;

import java.io.IOException;

// Stream [Byte, Character, Object] 단방향, Input Output
public class IoEx1 {
	public void conToCon() {
		int temp = 0;
		try {
			System.out.println("Data:");
			while((temp=System.in.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void conToCon2() {
		byte []temp=new byte[10]; // [][][][][][][][][]
		try {
			System.out.println("Data : ");
			System.in.read(temp,0,2);
			System.out.println(new String(temp).trim().equals("abc"));
			
			/*for(byte b:temp) {
				System.out.println(b);
			}*/
			System.out.println(System.in.read(temp)); // 할당한 주소를 넣음
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void conToCon3() {
		byte []temp = new byte[10];
		System.out.println("Data : ");
		try {
			int cnt = System.in.read(temp, 1, 9);
			System.out.println("cnt="+cnt);
			for(int i=0;i<temp.length;i++) {
				System.out.println(temp[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	public void conToCon4() {
		String temp = null;
		byte []by = new byte[20];
		try {
			do {
			System.out.println("Data : ");
			System.in.read(by);
			temp = new String(by).trim(); // by로 받은 값을 String형으로 만들어서
			System.out.println(temp);
			}while(!temp.equals("exit")); // exit과 다르면 do 반복
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args) {
		IoEx1 i = new IoEx1();
		//i.conToCon();
		//i.conToCon2();
		//i.conToCon3();
		i.conToCon4();
		
	}
}
