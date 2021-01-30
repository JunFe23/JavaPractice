package sist.com.io2;

import java.io.File;
import java.io.RandomAccessFile;

public class ScreamEx3 {
	
	public void streamFun1() {
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile(new File("/Users/junfe/Desktop/JunFe/random.txt"), "rw");
			String str = "hello";
			//ra.seek(str.length()); // length의 끝으로 포인트를 옮김.
			ra.write(str.getBytes());
			System.out.println(ra.getFilePointer()); // 'hello' 5글자라 5
			System.out.println(ra.read()); // -1이 기본.
			ra.seek(0);
			System.out.println(ra.read()); // 첫글자 h 아스키코드 
			System.out.println((char)ra.read()); // 다음 글자 e
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(ra!=null)ra.close();
		} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void streamFun2() { // randomaccess를 통한 읽기.
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile("/Users/junfe/Desktop/JunFe/a/Arraycopy.java", "rw");
			String temp = "";
			while((temp=ra.readLine())!=null) {
				System.out.println(temp);
			}
			System.out.println(ra.getFilePointer());
			ra.seek(ra.getFilePointer()); // 마지막 포인터 찾아서 마지막에 내용 추가 하기 위해 ...
			ra.seek(0); // 맨처음 부분으로 포인터 지정.
			ra.writeBytes("bye"); // bye 추가.
			ra.write("End".getBytes()); // End 추가.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void streamFun3() {
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile("/Users/junfe/Desktop/JunFe/a/random12.txt", "rw");
			ra.writeInt(100);
			//ra.writeInt(800);
			//ra.writeInt(25);
			//ra.write("바보".getBytes());
			System.out.println(ra.getFilePointer()); // integer 3개니깐 12바이트.
			ra.seek(5);
			System.out.println(ra.readInt());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		 ScreamEx3 s = new  ScreamEx3();
		 //s.streamFun1();
		 //s.streamFun2();
		 s.streamFun3();
	}
}
