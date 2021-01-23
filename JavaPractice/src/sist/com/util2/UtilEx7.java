package sist.com.util2;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

import sist.com.view.WindowEx7;
import sist.com.view.WindowEx8;

//Vector,Map,ArrayList,HashSet
//IO
public class UtilEx7 {
   Scanner scanner=new Scanner(System.in);
   
   public void addMember() {
	  Member member=new Member();
	  String id=null;
      do {
    	  System.out.println("ID:");
    	  id=scanner.next();
      }while(Dao.getDao().idCheck(id));
      member.setId(id);
      System.out.println("Name:");
      member.setName(scanner.next());
      System.out.println("Emal:");
      member.setEmail(scanner.next());
      System.out.println("Address:");
      member.setAddress(scanner.next());
      Dao.getDao().memberAdd(member);
      
   }
   
   public void memberModify() {
	   Member member=new Member();
	   String id=null;
	   do {
	       System.out.println("ID:");
	       id=scanner.next();
	   }while(Dao.getDao().idCheck(id));
	   member.setId(id);
	   System.out.println("Name:");
	   member.setName(scanner.next());
	   System.out.println("Emal:");
	   member.setEmail(scanner.next());
	   System.out.println("Address:");
	   member.setAddress(scanner.next());
	   Dao.getDao().memberModify(member);
   }
   public void memberList() {      
      //System.out.println(Arrays.toString(Dao.getDao().getVector().toArray()));      
       for(Member m :Dao.getDao().getVector()) {
          System.out.println(m);
       }
        /*Enumeration<Member>e=Dao.getDao().getVector().elements();
        for(;e.hasMoreElements();) {
           System.out.println(e.nextElement());
        }*/
      /* Iterator<Member>i= Dao.getDao().getVector().iterator();
       
       for(;i.hasNext();)
          System.out.println(i.next());*/      
   }
   public int searchData() {
      System.out.println("ID:");
      return Dao.getDao().searchIndex(scanner.next());
   }
   public void infoMember() {
      int index=searchData();
      System.out.println(index==-1?"No SuchElement":Dao.getDao().getMember(index));
   }
   public void deleteMember() {
      int index=searchData();
      if(index==-1)return;
      System.out.println(Dao.getDao().getVector().remove(index).getName().concat("님삭제"));
   }
  
   public void modifyMember() {
	   int index=searchData();
	   if(index==-1)return;
	   memberModify();
   }
  /* public void viewTable() {
	   new WindowEx7(Dao.getDao().getVector());
   }*/
   
   public void viewTable() {
	   new WindowEx8();
   }
   
   public void print() {
      while(true) {
         System.out.println("1.회원가입 2.회원목록  3.삭제 4.수정 5.상세보기 6.Member View");
          switch (scanner.nextInt()) {
         case 1:   
            addMember();
            break;
         case 2:
            memberList();
            break;
         case 3:
            deleteMember();
            break;
         case 4:
        	modifyMember();
        	break;
         case 5:
            infoMember();
            break;
         case 6:
        	viewTable();
         default:
            break;
         }
      }
   }   
   public static void main(String[] args) {
      UtilEx7 u=new UtilEx7();
      u.print();
      
      
   }

}












