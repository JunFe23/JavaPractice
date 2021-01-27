package sist.com.io1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//aaa
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
   public void conToFa2() { // buffer는 임시기억장치
      BufferedReader br = null; // reader로 끝나는 것은 character 기반, stream으로 끝나는 것은 byte 기반
      FileOutputStream fos = null;
      String imsi = null;
      try {
         br=new BufferedReader(new InputStreamReader(System.in)); // console에서 가져오려면 하이브리드 클래스인 inputstreamreader를 통해 stream을 받아야함
         System.out.println("FileName : ");
         fos = new FileOutputStream(br.readLine().trim()); // readline으로 한번에 읽어옴
         System.out.println("Contents : ");
         while(!(imsi=br.readLine().trim()).equals("quit")) { // while문을 통해서 여러번 입력.
            fos.write(imsi.getBytes());
         }
         //fos.write(br.readLine().getBytes()); // readLine이 String형인데 write는 byte형을 받으므로 getBytes를 통해 byte형으로 변환
         //System.out.println(br.readLine());
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      } finally{
         try {
            if(br!=null)br.close(); // 메모리를 자유공간으로 돌려줌(?)
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
         
         /*br=new BufferedReader(new InputStreamReader(System.in)); // console에서 가져오려면 하이브리드 클래스인 inputstreamreader를 통해 stream을 받아야함
         System.out.println("FileName : ");
         fos = new FileOutputStream(br.readLine().trim()); // readline으로 한번에 읽어옴
         System.out.println("Contents : ");
         while(!(imsi=br.readLine().trim()).equals("quit")) { // while문을 통해서 여러번 입력.
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
         /*if(br!=null)br.close(); // 메모리를 자유공간으로 돌려줌(?)
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