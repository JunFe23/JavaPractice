package sist.com.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IoEx4 {

	public void fileCopyEx() {
		Scanner scanner = new Scanner(System.in);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			System.out.println("OriginFile : ");
			fis = new FileInputStream(scanner.next().trim());
			System.out.println("Copyfile : ");
			fos = new FileOutputStream(scanner.next().trim());
			int temp = 0;
			int size = 0;
			while((temp=fis.read())!=-1) {
				fos.write(temp);
				size++;
			}
			System.out.println("File Copy Success " + size + "byteSuccess");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		IoEx4 i = new IoEx4();
		i.fileCopyEx();
	}
}
