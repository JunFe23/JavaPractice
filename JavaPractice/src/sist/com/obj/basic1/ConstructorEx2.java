package sist.com.obj.basic1;
//생성자의 목적 : instance변수를 초기화
public class ConstructorEx2 {
	int iValue;
	   boolean state;
	   public void method() {
	      //지역변수[stack] 
	   }
	   public void disp() {
	      System.out.println(this.iValue+" "+this.state);
	   }
	   public void setIValue(int iValue) {
	      this.iValue=iValue;
	   }
	   public int getIValue() {
	      return this.iValue;
	   }
	   public ConstructorEx2 getInstance() {//사용자정의형 이용.
	      return this;
	   }
	   public static void main(String[] args) {
	      ConstructorEx2 c1=new ConstructorEx2();//iValue|state
	      //c1.disp();
	      c1.getInstance().setIValue(500);
	      System.out.println(c1.getInstance().getIValue());//500
	      
	   }
}
