package sist.com.io1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IoEx8 {

	public void ioStreamEx1() {
		PrintStream ps = null; // printstream : byte기반의 출력 
		try {
			ps = new PrintStream("/Users/junfe/Desktop/JunFe/1.txt");
			//ps.write(String.valueOf(5>3).getBytes()); // valueOf가 어떤형이든 String형으로 바꾸어줌. 그 바꾸어준걸 getByte로 byte 배열로 변환.
			ps.println("a");
			ps.println("b");
			System.out.println(5>3);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void ioStreamEx2() {
		PrintStream ps = null;
		try {
//			ps = new PrintStream(new File("/Users/junfe/Desktop/JunFe/1.txt"));
//			ps.print(100); // 기존파일에 append가 안되고 덮어씀.
			
			ps = new PrintStream(new FileOutputStream(new File("/Users/junfe/Desktop/JunFe/1.txt"),true)); // append를 허용.
			ps.print("A"); // printStream은 formatter가 있어서 가능하다.
			ps.append('c');
			ps.printf("%s는 %d입니다.\n", "맥프로", 500);
			ps.printf("%d는 8진수 = %o 16진수 = %x", 100,100,100);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(ps!=null) ps.close();
		}
	}
	public void ioStreamEx3() {
		PrintStream ps = null;
		try {
			ps = new PrintStream("/Users/junfe/Desktop/JunFe/1.txt");
			ps.write(100);
			ps.write(String.valueOf(100).getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx8 i = new IoEx8();
		//i.ioStreamEx1();
		//i.ioStreamEx2();
		i.ioStreamEx3();
	}
}
