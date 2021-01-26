package sist.com.io1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IoEx6 {
	
	public void fileEx1() {
		File file1 = new File("c:\\");
		for(String str : file1.list()) {
			System.out.println(str);
		}
	}
	
	public void fileEx1_1() {
		File file2 = new File("c:\\");
		for(File f : file2.listFiles()) {
			try {
				Thread.sleep(500);
				System.out.println(f.getAbsolutePath());
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void fileEx2() {
		File file1 = new File("e:\\abc\\def\\test.txt"); // 해당 경로에 폴더 생성
		file1.mkdirs();
		
		try {
			file1.createNewFile();
			System.out.println(file1.getAbsolutePath());
			System.out.println(file1.isDirectory());
			System.out.println(new Date(file1.lastModified()));
			System.out.println(file1.getFreeSpace());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void fileEx3() {
		Date data = new Date();
		SimpleDateFormat f1, f2, f3, f4, f5;
		f1 = new SimpleDateFormat("yyyy/mm/dd");
		f2 = new SimpleDateFormat("yy/mm/hh");
		f3 = new SimpleDateFormat("yyyy년 mm월 dd월 E요일");
		f4 = new SimpleDateFormat("HH:MM:SS");
		f5 = new SimpleDateFormat("hh:m:s");
		
		System.out.println(f1.format(data));
		System.out.println(f2.format(data));
		System.out.println(f3.format(data));
		System.out.println(f4.format(data));
		System.out.println(f5.format(data));
		System.out.println(data);
	}
	
	public void fileEx4(String path) {
		File file = new File(path);
		File []fileArray = file.listFiles();
		for (int i = 0; i < fileArray.length; i++) {
			if(fileArray[i].exists()&&fileArray[i].isDirectory()) {
				System.out.println(fileArray[i].getName() + " 디렉토리");
			}
			else if(fileArray[i].exists()&&fileArray[i].isFile()) {
				System.out.println(fileArray[i].getName() + " 파일");
			}
		}
	}
	
	public void fileEx5() {
		String driver = "";
		double totalSpace, useableSpace, freeSpace, useSpace;
		File[] roots = File.listRoots();
		for(File f:roots) {
			driver = f.getAbsolutePath();
			totalSpace = f.getTotalSpace()/Math.pow(1024, 3);			
			useableSpace = f.getUsableSpace()/Math.pow(1024, 3);
			useSpace = totalSpace - useableSpace;
			freeSpace = f.getFreeSpace()/Math.pow(1024, 3);
			System.out.println(driver);
			System.out.println(totalSpace);
			System.out.println(freeSpace);
			System.out.println(useSpace);
			
		}
	}
	
	public static void main(String[] args) {
		IoEx6 i = new IoEx6();
		//i.fileEx1();
		//i.fileEx2();
		//i.fileEx3();
		//i.fileEx4("c:\\");
		i.fileEx5();
	}
}
