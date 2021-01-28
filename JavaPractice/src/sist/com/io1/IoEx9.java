package sist.com.io1;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;

public class IoEx9 {

	public void ioStreamEx1() {
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		byte []rs = new byte[10];
		
		try {
			bis = new ByteArrayInputStream("abcdef".getBytes());
			bos = new ByteArrayOutputStream();
			int data = 0;
			bis.read(rs); // bis를 읽어서 rs에 넣음.
//			while((data=bis.read())!=-1) { // bis의 한글자씩 data에 넣으면서 읽음.
//				bos.write(data); // data의 한글자씩 bos에 씀.
//			}
//			rs = bos.toByteArray(); // byte값들을 byteArray로 만들음.
			System.out.println(String.valueOf(rs)); // byte배열 인자가 없어서 안나옴.
			System.out.println(Arrays.toString(rs));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null)bis.close();
				if(bos!=null)bos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void ioStreamEx2() {
		PrintWriter pw = null;
		try {
			//pw = new PrintWriter(new FileOutputStream(new File(new String("/Users/junfe/Desktop/JunFe/2.txt")))); // 내용 안들어감.
			pw = new PrintWriter(new FileWriter("/Users/junfe/Desktop/JunFe/3.txt"), true); // 내용 안들어감. autoflush가 안됨.
			pw.print(5>3);
			//pw.flush(); // printStream은 autoflush를 해주지만 printwriter는 flush를 해줘야 함.
			System.out.println("FileWrite Success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void ioStreamEx3() throws Exception{
		URL url = new URL("https://allg.tistory.com/16");
		URLConnection uc = url.openConnection();
		BufferedInputStream bs = null;
		PrintStream ps = new PrintStream(new File("/Users/junfe/Desktop/JunFe/url.txt"));
		bs = new BufferedInputStream(uc.getInputStream());
		System.out.println((char)bs.read());
		int temp = 0;
		while((temp = bs.read())!=-1) {
			//Thread.sleep(100);
			System.out.print((char)temp);
			ps.print((char)temp);
		}
	}
	
	public void ioStreamEx3_1() throws Exception { // 하다 말음.
		URL url = new URL("https://www.google.com/");
		URLConnection uc = url.openConnection();
		ByteArrayInputStream bais = null;
		PrintStream ps = new PrintStream(new File("/Users/junfe/Desktop/JunFe/ut.txt"));
		
	}
	
	public static void main(String[] args) throws Exception {
		IoEx9 i = new IoEx9();
		i.ioStreamEx1();
		//i.ioStreamEx2();
		//i.ioStreamEx3();
	}
}
