package sist.com.obj.basic2;

public class C  {
   private int c;
   private B b;
   public C() {      
   }
   public C(int c) {
      this.c=c;
   }
   public C(int c,B b) {
      this.c=c;
      this.b=b;
   }
   public void setC(int c) {
      this.c=c;
   }
   public int getC() {
      return this.c;
   }
   public void setB(int c,B b) {
      this.c=c;
      this.b=b;
   }
   public void setB(B b) {      
      this.b=b;
   }
   public B getB() {
	   return this.b;
   }

}