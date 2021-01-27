package sist.com.io1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//aa
// feilToConsole, FileCopy
public class IoEx3 {
   
   public void fileToConsole() {
      byte []fileName = new byte[50];
      byte []copyFileName = new byte [50];
      FileInputStream fis = null;
      FileOutputStream fos = null;
      try {
         System.out.println("FileName : ");
         System.in.read(fileName);
         fis = new FileInputStream(new String(fileName).trim());
         int temp = 0;
         while((temp=fis.read())!=-1) {
            Thread.sleep(100);
            System.out.print((char)temp);
         }
         System.out.println();
         System.out.println("CopyFileName : ");
         System.in.read(copyFileName);
         String sfileName = new String(copyFileName).trim();
         fis = new FileInputStream(new String(fileName).trim());
         fos = new FileOutputStream(sfileName);
         System.out.println(temp);
         int size = 0;
         while((temp=fis.read())!=-1) {
            fos.write(temp);
            size++;
         }
         System.out.println("File Copy Success " + size + "byteSuccess");
      } catch (IOException e) {
         // TODO: handle exception
      } catch (InterruptedException e) {
         
      }finally {
         try {
            if(fis!=null)fis.close();
            if(fos!=null)fos.close();
         } catch (Exception e2) {
            // TODO: handle exception
         }
      }
   }
   
   public void fileToConsole2() {
      BufferedReader br = null;
      FileOutputStream fos = null;
      FileInputStream fis = null;
      byte []contents = new byte[1024]; // [][][][][][][][][][]......
      try {
         br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("FileName : ");
         fis = new FileInputStream(br.readLine().trim()); // readLine이 한줄 받아와서 String으로 반환
         fis.read(contents);
         System.out.println(new String(contents).trim());
         
         
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }finally {
         try {
            if(br!=null) br.close();
            if(fis!=null) fis.close();
         } catch (Exception e2) {
            // TODO: handle exception
         }
      }
   }
   
   
   
   
   public static void main(String[] args) {
      IoEx3 i = new IoEx3();
      i.fileToConsole();
      //i.fileToConsole2();
      
   }
}