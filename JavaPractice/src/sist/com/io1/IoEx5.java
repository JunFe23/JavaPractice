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
		BufferedOutputStream bos = null; // fos�� �����ϱ� ������ ���� ������ �ʿ� ����.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("FileName : ");
			System.in.read(fileName); // fileName�� �־���.
			//bos = new BufferedOutputStream(new FileOutputStream(new File(new String(fileName).trim())),5); // size�� 5����Ʈ, 5����Ʈ�� �� ���� ��������!!!!!!!buffer! �⺻�� 8,192����Ʈ
			bos = new BufferedOutputStream(new FileOutputStream(new File(new String(fileName).trim()),true)); // fileOutputStream ���� true�� append ���
			System.out.println("Contents : ");
			bos.write(br.readLine().getBytes()); // ���� ������ String�ε� �� String�� ����Ʈ �迭�� �ٲ�.
			//bos.flush(); // buffer�� �⺻ size�� �� ��ä���� ����ϰ� ���� -> flush
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close(); // close�� ���� ���� flush�� ������ �� �ִ�.
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
				bw.flush(); // close �� ���ָ� ������Ѵ�.
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
