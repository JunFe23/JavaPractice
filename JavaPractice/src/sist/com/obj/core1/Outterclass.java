package sist.com.obj.core1;
//내부클래스 (MemberInner, LocalInner, StaticInner, AnonymousInner)
public class Outterclass {
	private int outValue;
	public Outterclass() {
		System.out.println("Outterclass()");
		outValue=100;
	}
	public void outterMethod() {
		System.out.println("outterMethod");
	}
	public class Inner{
		private int innerValue;
		public Inner() {
			System.out.println("Inner()");
		}
		
		public void innerMethod() {
			outValue=200; // 외부클래스의 변수 호출 가능
			//Outterclass.outValue=300; // error, Outterclass.은 클래스영역(static영역)이므로 변수가 static으로 선언되어야 접근 가능
			Outterclass.this.outValue=300; // 가능. this로 받았기때문에 instance.
			System.out.println(outValue);
			outterMethod(); // 내부클래스가 외부클래스의 메소드 호출 가능
		}
	}
	
	public static void main(String[] args) {
		Outterclass.Inner o=new Outterclass().new Inner(); // Outterclass생성자 실행 후, Inner생성자 실행.
		o.innerMethod();
		//o.outterMethod(); // 내부클래스 안에서만 가능
		
	}
}
