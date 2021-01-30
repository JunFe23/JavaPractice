package sist.com.io2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class StreamEx2 {

	public void streamEx1() {
		byte []b1 = {97,98,99,100};
		byte []b2 = {105,106,107,108};
		byte []b3 = {109,110,115,119};
		Vector<ByteArrayInputStream> v = new Vector<ByteArrayInputStream>();
		v.add(new ByteArrayInputStream(b1));
		v.add(new ByteArrayInputStream(b2));
		v.add(new ByteArrayInputStream(b3));
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); //	byte배열 3개를 하나로 합쳐서 파일로 보냄.
		SequenceInputStream input = new SequenceInputStream(v.elements());
		
		int data = 0;
		try {
			while((data=input.read())!=-1) {
				bos.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(byte b:bos.toByteArray()) {
			System.out.println(b);
		}
	}
	
	public void streamEx2() {
		FileInputStream [] fis = new FileInputStream[3]; // 3개 파일 불러올거야.
		String []loc = {"/Users/junfe/Desktop/JunFe/a/ArrayPractice.java", "/Users/junfe/Desktop/JunFe/a/ArrayEx11.java","/Users/junfe/Desktop/JunFe/a/ArrayEx12.java"};
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		FileOutputStream fos = null;
		
		try { // 파일 객체 3개 만들거
			for (int i = 0; i < fis.length; i++) {
				fis[i] = new FileInputStream(new File(loc[i]));
				v.add(fis[i]);
			}
			fos = new FileOutputStream(new File("/Users/junfe/Desktop/JunFe/a/ArrayCopy.txt"));
			SequenceInputStream si = new SequenceInputStream(v.elements());
			int data = 0;
			int size = 0;
			while((data=si.read())!=-1) {
				fos.write(data);
				size++;
			}
			System.out.println("FileCopy "+size+"byte Success");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				for (int i = 0; i < fis.length; i++) {
					if(fis!=null)fis[i].close();
					
				}
				if(fos!=null)fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		StreamEx2 s = new StreamEx2();
		//s.streamEx1();
		s.streamEx2();
	}
}
