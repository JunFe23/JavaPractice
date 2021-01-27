package sist.com.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoEx3P {
	public void fileToConsole() {
		byte []fileName = new byte [50];
		byte []copyFileName = new byte [50];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			System.out.println("FileName : ");
			System.in.read(fileName); // 콘솔에서 입력받은걸 fileName으로 받음..
			//fis = new FileInputStream(fileName.toString().trim()); // fileName이 char 배열이기 때문에 배열의 주소를 string화 하는것...값이아니다..
			fis = new FileInputStream(new String(fileName).trim());
			int temp = 0;
			while((temp=fis.read())!=-1) {
				Thread.sleep(100);
				System.out.println(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void test() {
		byte []fileName = new byte [50];
		try {
			System.in.read(fileName);
			System.out.println(fileName.toString().trim());
			String t = new String(fileName).trim();
			String s = fileName.toString().trim();
			System.out.println();
			System.out.println(t);
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx3P i = new IoEx3P();
		i.test();
	}
}
