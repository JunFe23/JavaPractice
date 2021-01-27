package sist.com.io1;
//aa
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IoEx6 {
   
   public void fileEx1() {
      File file1 = new File("/Users/junfe/desktop"); ///Users/junfe   // 해당 경로의 파일 목록 출력. 
      for(String str : file1.list()) { //String형으로 받음.file1 - list
         System.out.println(str);
      }
   }
   
   public void fileEx1_1() {
      File file2 = new File("/Users/junfe/desktop"); // 해당 경로 내 파일들의 경로를 포함한 내용을 출력.
      for(File f : file2.listFiles()) { // File형으로 받음 - listFiles.
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
      File file1 = new File("/Users/junfe/desktop/JunFe"); // 해당 경로에 폴더 생성
      file1.mkdirs(); // mkdir은 중간 경로에 폴더 없으면 생성 안함, mdkirs는 중간에 없는 폴더도 생성해서 만들어줌.
      
      try {
         file1.createNewFile();
         System.out.println(file1.getAbsolutePath()); // 전체 경로.
         System.out.println(file1.isDirectory()); // 파일 존재여부 확인.
         System.out.println(new Date(file1.lastModified())); // 마지막으로 수정된 시간.
         System.out.println(file1.getFreeSpace()); // 하드디스크의 남은 공간을 return한다.
         
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      
   }
   
   public void fileEx3() {
      Date data = new Date();
      SimpleDateFormat f1, f2, f3, f4, f5;
      f1 = new SimpleDateFormat("yyyy/mm/dd");
      f2 = new SimpleDateFormat("yy/MM/DD");
      f3 = new SimpleDateFormat("yyyy년 MM월 dd월 E요일");
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
      File []fileArray = file.listFiles(); // listFiles가 1차원 배열.
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
         totalSpace = f.getTotalSpace()/Math.pow(1024, 3); // 1024의 3제곱으로 나누어주어 GB단위로 표현.  
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
      //i.fileEx1_1();
      //i.fileEx2();
      //i.fileEx3();
      //i.fileEx4("/Users/junfe/desktop");
      i.fileEx5();
   }
}