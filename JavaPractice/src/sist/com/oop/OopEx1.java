package sist.com.oop;

import java.io.FileWriter;
import java.io.IOException;

public class OopEx1 {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.floor(10.5)); // Math��� Ŭ������ floor�޼ҵ� ���, ���� ���
		System.out.println(Math.ceil(10.5)); // �ø� ���
		System.out.println(Math.PI); // ������
		
		FileWriter f1 = new FileWriter("data.txt"); //�� �ƶ��� �۾��� Ŭ������ �����ؼ� �۾�.
		f1.write("JunFe");
		f1.write(" cheer up");
		
		
		FileWriter f2 = new FileWriter("data2.txt"); //�� �ƶ��� �۾��� Ŭ������ �����ؼ� �۾�.
		f2.write("KunFe");
		f2.write(" bye");
		f2.close();
		
		f1.write(" no");
		f1.close();
	}
}
