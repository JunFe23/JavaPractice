package sist.com.innerClass;

public class StaticInner { // static ���� Ŭ����
	String ov="OuterValue";
	
	public StaticInner() {
		super();
		System.out.println("StaticOuterClass");
	}
	
	public static class StaticInnerClass { // static���� ���� ����.
		static String iv = "StaticInnerValue";

		public StaticInnerClass() {
			super();
			// TODO Auto-generated constructor stub
			System.out.println("StaticInnerClass");
		}	
		static void test() { // static method�� ���� ���� 
			
		}
	}	
}
