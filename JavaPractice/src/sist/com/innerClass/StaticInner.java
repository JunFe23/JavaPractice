package sist.com.innerClass;

public class StaticInner { // static 내부 클래스
	String ov="OuterValue";
	
	public StaticInner() {
		super();
		System.out.println("StaticOuterClass");
	}
	
	public static class StaticInnerClass { // static으로 선언 가능.
		static String iv = "StaticInnerValue";

		public StaticInnerClass() {
			super();
			// TODO Auto-generated constructor stub
			System.out.println("StaticInnerClass");
		}	
		static void test() { // static method도 선언 가능 
			
		}
	}	
}
