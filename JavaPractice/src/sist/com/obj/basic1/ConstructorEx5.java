package sist.com.obj.basic1;

import java.util.Calendar;

public class ConstructorEx5 {
   
   public void makerEx1() {
      /*String str1=new String("abc");//value[a][b][c]
      String str2=new String("def");//value[d][e][f]
      
      System.out.println();*/
      
      /*String str1="abc";
      String imsi=str1;
      str1+="def";
      System.out.println(str1==imsi);*/
      
      String str1="abc";
      String str2="def";
      /*System.out.println(str1.equals("java"));
      System.out.println(str2.equalsIgnoreCase("oracle"));
      */
      System.out.println(str1.codePointAt(0));
      
   }   
   public void makerEx2() {
      String str1="A#$7y";
      String str2="abcdefa";
      System.out.println(str2.lastIndexOf("a",str2.lastIndexOf("a")-1));
      //System.out.println(str2.indexOf("a",str2.indexOf("a")+1));
      //System.out.println(str1.substring(str1.indexOf('$'),str1.indexOf('$')+2).indexOf("#"));//-1
      //System.out.println(str1.substring(3));//
      String s=String.valueOf(5>3).charAt(0)=='t'?"��":"����";      
      System.out.println(s.concat("�Դϴ�"));
   }
   public int getAge(int year) {
      return (Calendar.getInstance().get(Calendar.YEAR)-year)+1;
   }
   public void makerEx3() {
      //�̸�, ����, ���û���, ����, ����, ��ȭ��ȣ, ��,
      //Calendar.getInstance().get(Calendar.YEAR)
      
      String []data= {"�Ѽ���#941210-1010789#051)675-1234",
                    "���ϱ�#980105-2010786#02)975-1234",
                    "������#990910-210789#031)475-1234",
                    "�����#910510-1010589#02)985-1234",
                    "���¿�#580101-1010689#02)378-9234"};
      Man []man=new Man[data.length];//[][][][][]
   
      
      Calendar c=Calendar.getInstance();
      String temp="";
      temp=c.get(Calendar.MONTH)+1<=9?"0".concat(String.valueOf(c.get(Calendar.MONTH)+1)):String.valueOf( c.get(Calendar.MONTH)+1);
      temp+=c.get(Calendar.DATE)<=9?"0".concat(String.valueOf(c.get(Calendar.DATE))):String.valueOf( c.get(Calendar.DATE));
      
      
      for (int i = 0; i < data.length; i++) {
         String[]subData=data[i].split("#");
         man[i]=new Man();
         for (int j = 0; j < subData.length; j++) {
            switch (j) {
            case 0:
               man[i].setName(subData[j]);
               break;
            case 1:
               man[i].setAge(getAge((1900+Integer.parseInt( subData[j].substring(0,2)))));
               man[i].setBirth((subData[j].substring(2,6).equals(temp)?"��ī��ī":""));
               
                   break;
            default:
               break;
            }
         }
      }//for
      disp(man);
      
   }   
   public void disp(Man[]m) {
      for(Man man:m) {
         System.out.println(man);
      }
   }
   public static void main(String[] args) {
      ConstructorEx5 c=new ConstructorEx5();
      c.makerEx3();
   }

}














