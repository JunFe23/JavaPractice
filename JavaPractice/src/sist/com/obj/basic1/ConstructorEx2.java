package sist.com.obj.basic1;
//�������� ���� : instance������ �ʱ�ȭ
public class ConstructorEx2 {
	int iValue;
	   boolean state;
	   public void method() {
	      //��������[stack] 
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
	   public ConstructorEx2 getInstance() {//����������� �̿�.
	      return this;
	   }
	   public static void main(String[] args) {
	      ConstructorEx2 c1=new ConstructorEx2();//iValue|state
	      //c1.disp();
	      c1.getInstance().setIValue(500);
	      System.out.println(c1.getInstance().getIValue());//500
	      
	   }
}
