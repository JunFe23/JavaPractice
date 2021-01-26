package sist.com.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

// ByteStream, CharacterSTream, ObjectStream
public class IoEx5 {
	
	public void conToFa() {
		byte []fileName = new byte[50];
		byte []contents = new byte[200];
		BufferedOutputStream bos = null; // fos를 포함하기 때문에 따로 선언할 필요 없다.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("FileName : ");
			System.in.read(fileName); // fileName에 넣어줌.
			//bos = new BufferedOutputStream(new FileOutputStream(new File(new String(fileName).trim())),5); // size가 5바이트, 5바이트가 다 차야 내보내짐!!!!!!!buffer! 기본이 8,192바이트
			bos = new BufferedOutputStream(new FileOutputStream(new File(new String(fileName).trim()),true)); // fileOutputStream 에서 true로 append 허용
			System.out.println("Contents : ");
			bos.write(br.readLine().getBytes()); // 한줄 읽으면 String인데 그 String을 바이트 배열로 바꿈.
			//bos.flush(); // buffer의 기본 size를 다 못채워도 출력하게 해줌 -> flush
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close(); // close를 했을 때는 flush를 생략할 수 있다.
				if(bos!=null)bos.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void faToCon() {
		BufferedReader brconsole = null, brFile =null;
		try {
			brconsole = new BufferedReader(new InputStreamReader(System.in)); // console
			System.out.println("FileName : ");
			brFile = new BufferedReader(new InputStreamReader(new FileInputStream(brconsole.readLine().trim())));
			String temp = null;
			while((temp=brFile.readLine())!=null) {
				Thread.sleep(100);
				System.out.println(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(brconsole!=null)brconsole.close();
				if(brFile!=null)brFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void faToConMine() {
		byte []fileName = new byte[50];
		BufferedInputStream bis = null;
		try {
			System.out.println("FileName : ");
			System.in.read(fileName);
			bis = new BufferedInputStream(new FileInputStream(new File(new String(fileName).trim())));
			int temp = 0;
			while((temp=bis.read())!=-1){
				Thread.sleep(100);
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void fileCopy() {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		String temp = null;
		try {
			System.out.println("OriginFile : ");
			br = new BufferedReader(new FileReader(new File(scan.next().trim())));
			System.out.println("ChangeFile : ");
			bw = new BufferedWriter(new FileWriter(new File(scan.next().trim())));
			while((temp=br.readLine())!=null) {
				bw.write(temp);
				bw.newLine();
				bw.flush(); // close 안 해주면 해줘야한다.
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//aaa
	public static void main(String[] args) {
		IoEx5 i = new IoEx5();
		//i.conToFa();
		//i.faToCon();
		//i.faToConMine();
		i.fileCopy();
	}
}
