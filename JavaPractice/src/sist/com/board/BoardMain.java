package sist.com.board;

import java.util.Scanner;

public class BoardMain {
   Scanner scanner=new Scanner(System.in);
   Board[]boards=new Board[5];//[][][][][]
   int cnt;
   
   public boolean uniqueNumber(int no) {
      for (int i = 0; i < cnt; i++) {
           if(boards[i].getNo()==no)return true;  
      
       }
      return false;
   }
   public void writeBoard() {
      /*int no;
       String writer;   
       String subject;
       String password;
       String contents;
       String regdate;*/
      
      Board board=new Board();
      int no;
      do {
       System.out.println("No:");
        no=scanner.nextInt();
      }while(uniqueNumber(no));
      board.setNo(no);
      System.out.println("writer:");
      board.setWriter(scanner.next());
      System.out.println("subject:");
      board.setSubject(scanner.next());
      System.out.println("password:");
      board.setPassword(scanner.next());
      System.out.println("Contents:");
      board.setContents(scanner.next());
      System.out.println("Regdate:");
      board.setRegdate(scanner.next());
      if(isFull())increment();
      boards[cnt++]=board;      
   }
   public boolean isFull() {
      return cnt==boards.length-1;
   }
   public void increment() {
      //
   }
   public void list() {
     for (int i = 0; i < cnt; i++) {
      System.out.println(boards[i]);
     }
   }
   public int search(int number) {
      for (int i = 0; i < cnt; i++) {
      if(boards[i].getNo()==number)return i;
      }
      return -1;
   }
   public Board getBoard(int number) {
      return boards[number];
   }
   public void infoBoard() {
      System.out.println("글번호");
      int index=search(scanner.nextInt());
      System.out.println(index==-1?"No SuchElement":getBoard(index));
      
   }
   public void modifyBoard() {
      System.out.println("수정할 글번호:");     
      int index=search(scanner.nextInt());
      if(index==-1) {
         System.out.println("No SuchElement");
         return;
      }
      Board board=getBoard(index);
      System.out.println("Modifywriter:");
      board.setWriter(scanner.next());
      System.out.println("Modifysubject:");
      board.setSubject(scanner.next());
      System.out.println("password:");
      board.setPassword(scanner.next());
      System.out.println("ModifyContents:");
      board.setContents(scanner.next());
      System.out.println("수정완료");
      
   }
   public void deleteBoard() {
      System.out.println("삭제 할 글번호:");     
      int index=search(scanner.nextInt());
      if(index==-1) {
         System.out.println("No SuchElement");
         return;
      }
      for (int i = index; i < cnt; i++) {
             if(i==cnt-1) {
                boards[i]=null;
                break;
             }
             boards[i]=boards[i+1];
      }
      cnt--;
   }
   public void menu() {
      while(true) {
      System.out.println("1.글쓰기  2.전체조회 3.상세조회  4.수정 5.삭제");
      switch (scanner.nextInt()) {
      case 1:
         writeBoard();
         break;
      case 2:
         list();
         break;
      case 3:
         infoBoard();
         break; 
      case 4:
         modifyBoard();
         break;
      case 5:
         deleteBoard();
         break;
      default:
         break;
      }
      }
   }
   public static void main(String[] args) {
      BoardMain b=new BoardMain();
      b.menu();
      
      
   }
}