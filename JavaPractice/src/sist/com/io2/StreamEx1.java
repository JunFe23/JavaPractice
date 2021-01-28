package sist.com.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class StreamEx1 {
	
	public void streamMethod(String path) {
		PrintStream ps = null;
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(ps = new PrintStream(new File(new String(path))));
			oos.writeObject(new Member("blue","JunFe", 29));
			oos.flush();
			System.out.println("Success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(oos!=null)oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void streamMethod2(String path) {
		ObjectInputStream ois = null; // object를 가져오는 stream.
		try {
			ois = new ObjectInputStream(new FileInputStream(path)); // 목적지로부터 가져오는 stream객체.
			System.out.println(ois.readObject()); // 직렬화.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void streamMethod3(String path) {
		ObjectOutputStream oos = null; // Object를 내보내는 클래스.
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeInt(100);
			oos.writeUTF("1000doo");
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void streamMethod4(String path) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			System.out.println(ois.readInt()); // 읽는 순서 중요. 큐 형식. 선입선출(FIFO)
			System.out.println(ois.readUTF());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		StreamEx1 s = new StreamEx1();
		//s.streamMethod("/Users/junfe/Desktop/JunFe/obj1.dat");
		//s.streamMethod2("/Users/junfe/Desktop/JunFe/obj1.dat");
		s.streamMethod3("/Users/junfe/Desktop/JunFe/obj1.dat");
		s.streamMethod4("/Users/junfe/Desktop/JunFe/obj1.dat");
	}
}
