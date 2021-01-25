package sist.com.io1;

import java.io.FileOutputStream;

public class IoEx2P {
	
	public void conToFa1() {
		byte []fileName = new byte[50];
		byte []contents = new byte[200];
		
		FileOutputStream fos = null;
		System.out.println("FileName : ");
		try {
			System.in.read(fileName);
			String sfileName = new String(fileName).trim();
			fos = new FileOutputStream(sfileName);
			System.out.println("Contents : ");
			System.in.read(contents);
			fos.write(new String(contents).trim().getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx2P i = new IoEx2P();
		i.conToFa1();
	}
}
