package sist.com.oop;

import java.io.FileWriter;
import java.io.IOException;

public class OopEx1 {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.floor(10.5)); // Math라는 클래스의 floor메소드 사용, 버림 기능
		System.out.println(Math.ceil(10.5)); // 올림 기능
		System.out.println(Math.PI); // 원주율
		
		FileWriter f1 = new FileWriter("data.txt"); //긴 맥락의 작업은 클래스를 복제해서 작업.
		f1.write("JunFe");
		f1.write(" cheer up");
		
		
		FileWriter f2 = new FileWriter("data2.txt"); //긴 맥락의 작업은 클래스를 복제해서 작업.
		f2.write("KunFe");
		f2.write(" bye");
		f2.close();
		
		f1.write(" no");
		f1.close();
	}
}
