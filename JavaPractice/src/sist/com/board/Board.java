package sist.com.board;

import javax.print.DocFlavor.STRING;
import javax.swing.text.StringContent;

public class Board {
   int no=1;
    String writer;   
    String subject;
    String password;
    String contents;
    String regdate;
    static String kind;
    static {
      kind="BBS";   
    }
   public int getNo() {
      return no;
   }
   public void setNo(int no) {
      this.no = no;
   }
   public String getWriter() {
      return writer;
   }
   public void setWriter(String writer) {
      this.writer = writer;
   }
   public String getSubject() {
      return subject;
   }
   public void setSubject(String subject) {
      this.subject = subject;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getContents() {
      return contents;
   }
   public void setContents(String contents) {
      this.contents = contents;
   }
   public String getRegdate() {
      return regdate;
   }
   public void setRegdate(String regdate) {
      this.regdate = regdate;
   }
   public static String getKind() {
      return kind;
   }
   public static void setKind(String kind) {
      Board.kind = kind;
   }
@Override
public String toString() {
	return "Board [no=" + no + ", writer=" + writer + ", subject=" + subject + ", password=" + password + ", contents="
			+ contents + ", regdate=" + regdate + "]";
}
  
   
//   @Override
//   public String toString() {
//	   return no+" "+writer+" "+subject+" "+contents+" "+regdate;
//   }
   
    
}