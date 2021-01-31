package sist.com.iopractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class ObjectStreamEx {
   
   Vector<Member> vector = new  Vector<Member>();
   static final String PATH = "C:\\Users\\ogum0\\OneDrive\\πŸ≈¡ »≠∏È\\abc.txt";
   
   public static Vector<Member> getVectorList() {
      Vector<Member> v = null;
      ObjectInputStream ois = null;
      
      try {
         ois = new ObjectInputStream(new FileInputStream(PATH));
         v = (Vector<Member>) ois.readObject();
         
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      } finally {
         try {
            if(ois!=null)ois.close();
            
         } catch (Exception e2) {
            // TODO: handle exception
            e2.printStackTrace();
         }
      } return v;
   }
   
   public void addMember() {
      vector.add(new Member("±Ë¡ÿ√∂", "JunFe", "1234"));
      vector.add(new Member("√÷¡§ø¨", "±‡¡§ø¨", "1234"));
      vector.add(new Member("±Ëº∫∫Û", "King", "1234"));
      vector.add(new Member("π⁄»ø¡¯", "Ω∫π˜", "1234"));
      
      ObjectOutputStream oos = null;
      try {
         oos = new ObjectOutputStream(new FileOutputStream(PATH));
         oos.writeObject(vector);
         oos.flush();
         System.out.println("File Save Success");
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      } finally {
         try {
            if(oos!=null)oos.close();
         } catch (Exception e2) {
            // TODO: handle exception
            e2.printStackTrace();
         }
      }
   }
   
   public void disp() {
      Vector<Member> v = this.getVectorList();
      for(Member m: v) {
         System.out.println(m.getName()+" "+m.getId()+" "+m.getPassword());
      }
   }
   
   public static void main(String[] args) {
      ObjectStreamEx o = new ObjectStreamEx();
      o.addMember();
      o.disp();
   }
}