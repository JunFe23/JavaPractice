package sist.com.io1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// conToCon, conToFa
public class IoEx2 {
	
	public void conToFa1() throws IOException {
		byte []fileName = new byte[50];
		byte []contents = new byte[20];
		
		FileOutputStream fos = null;
		System.out.println("FileName : ");
		System.in.read(fileName);
		//System.out.println("abc ".equals("abc")); // false [a][b][c][13][10][/0]
		String sfileName = new String(fileName).trim(); // d:abc.txt
		//System.out.println(sfileName.trim().equals("d:/abc.txt"));
		fos = new FileOutputStream(sfileName);
		System.out.println("Contents : ");
		System.in.read(contents);
		fos.write(new String(contents).trim().getBytes());
		
	}
	
	// conToCon, conToFa, faToCon, fileCopy
	public void conToFa2() { // buffer�� �ӽñ����ġ
		BufferedReader br = null; // reader�� ������ ���� character ���, stream���� ������ ���� byte ���
		FileOutputStream fos = null;
		String imsi = null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in)); // console���� ���������� ���̺긮�� Ŭ������ inputstreamreader�� ���� stream�� �޾ƾ���
			System.out.println("FileName : ");
			fos = new FileOutputStream(br.readLine().trim()); // readline���� �ѹ��� �о��
			System.out.println("Contents : ");
			while(!(imsi=br.readLine().trim()).equals("quit")) { // while���� ���ؼ� ������ �Է�.
				fos.write(imsi.getBytes());
			}
			//fos.write(br.readLine().getBytes()); // readLine�� String���ε� write�� byte���� �����Ƿ� getBytes�� ���� byte������ ��ȯ
			//System.out.println(br.readLine());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(br!=null)br.close(); // �޸𸮸� ������������ ������(?)
				if(fos!=null)fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void faToCon() {
		BufferedReader br = null;
		FileOutputStream fos = null;
		FileInputStream fis=null;
		String imsi = null;
		try {
			
			/*br=new BufferedReader(new InputStreamReader(System.in)); // console���� ���������� ���̺긮�� Ŭ������ inputstreamreader�� ���� stream�� �޾ƾ���
			System.out.println("FileName : ");
			fos = new FileOutputStream(br.readLine().trim()); // readline���� �ѹ��� �о��
			System.out.println("Contents : ");
			while(!(imsi=br.readLine().trim()).equals("quit")) { // while���� ���ؼ� ������ �Է�.
				fos.write(imsi.getBytes());
			}*/
			File file = new File("d:\\JunFe.txt");
			fis = new FileInputStream(file);
			String i = "";
			while(true){
				System.out.write(i.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
			/*if(br!=null)br.close(); // �޸𸮸� ������������ ������(?)
			if(fos!=null)fos.close();*/
			if(fis!=null)fis.close();	
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		IoEx2 i = new IoEx2();
		i.conToFa1();
		//i.conToFa2();
		//i.faToCon();
	}
}
