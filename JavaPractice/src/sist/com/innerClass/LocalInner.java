package sist.com.innerClass;

public class LocalInner { // Local내부클래스
	static String sov = "StaticOuterValue";
	String ov = "LocalOuterValue";
	
	public LocalInner() {
		super();
		// TODO Auto-generated constructor stub
		class LocalInnerClass{
			//static String siv = "StaticInnerValue"; // static변수 불가, 메소드가 호출도 안됐는데 변수부터 만들어질 수 없기 때문
			String iv = "LocalInnerValue";

			public LocalInnerClass() {
			
				// TODO Auto-generated constructor stub
				System.out.println("LocalInnerClass");
			}
		}
		new LocalInnerClass();
	}
	
}
