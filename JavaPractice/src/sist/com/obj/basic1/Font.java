package sist.com.obj.basic1;

//Ŭ������ ���赵�̴�....
//Ŭ����(�Ӽ�(static|instance) + ���)
public class Font {
   private  String color;
   private int size;
   private String face;
   public  Font() {
      this("");
      System.out.println("Font()");
   }
   public Font(String color) {   
     //this.color=color;
      this(color,0);
      System.out.println("Font(String color)");
   }
   public Font(String color,int size) {   
      /*this.color=color;
      this.size=size;*/
      this(color,size,"");
      System.out.println("Font(String color,int size)");
   }
   public Font(String color,int size,String face) {   
      this.color=color;
      this.size=size;
      this.face=face;
      System.out.println("Font(String color,int size,String face)");
   }
   public  Font(Font font) {//���������
      this.color=font.color;
      this.size=font.size;
      this.face=font.face;
   }
   public void disp() {
      System.out.println(this.color+" "+this.size+" "+this.face);
   }
   public static void main(String[] args) {
      Font f4=new Font();//color|size|face
      
      System.out.println("ConstructorEnd");
      
      /*f4.disp();
      Font f5=new Font();//color|size|face
      f5.disp();*/
      
      /*//color="red";
      new Font().color="red";//color|size|face
      new Font().color="blue";//color|size|face
      System.out.println(new Font().color);//color|size|face
*/      
      /*Font f1= new Font("red");//color|size|face
      f1.disp();
      Font f2=new Font("blue",20,"����");//color|size|face
      f2.disp();
      Font f3=new Font("cyan",5);//color|size|face
      f3.disp();*/
      
      
      
      
      
      
   }
   

}