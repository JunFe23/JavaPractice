package sist.com.obj.basic9;
public class MakerEx1 {
   
   public void makerSource1() {
      String str="Abc";
      String imsi=str;
      str+="def";
      System.out.println(imsi==str);
      StringBuilder su;
      StringBuffer sb=new StringBuffer();//[d][e][f][g][h][][][][][][][][][][][]
      sb.append("abc");
      sb.append("def");
      //sb.append("def").append("gh").append("ij");
      
      /*System.out.println(sf==sb);
      
      new StringBuffer(new String() );
      new StringBuffer(new StringBuffer());
      new StringBuffer(new StringBuilder());
      
      
      //length charAt
      CharSequence cs=new String("abc");//String( CharSequence(length,charAt) length )
      
      System.out.println(cs.length());
      cs=new StringBuffer("def");
      System.out.println(cs.length());*/
      
      
      
   }
   
   public void makerSource2() {
      char []vlaue1=new char[16];
      final char []value2= {'a','b','c'};
      System.out.println(vlaue1.length);
      System.out.println(value2.length);
   }
   
   public static void main(String[] args) {
      MakerEx1 m=new MakerEx1();
      //m.makerSource2();
      String str2="abcdefgh";
      char []value=new char[10];
      str2.getChars(0, 5, value, 0);
      System.out.println(value);
   }

}









