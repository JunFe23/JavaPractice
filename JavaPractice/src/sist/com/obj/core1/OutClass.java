package sist.com.obj.core1;

public class OutClass {
	private static int outValue;
	private static int stValue;
	public static class Inner{ // 2. static으로 변경
		private int iValue;
		private static int staticInner; // 1. error-> 내부클래스에 static을 주려면 내부클래스를 static으로 선언
		public Inner() {
			iValue=20;
			outValue=500; // 3. error -> 외부클래스 변수도 static으로 변해야 접근가능.
			stValue=200;
		}
	}
	
	
	public static void main(String[] args) {
		OutClass.Inner i = new OutClass.Inner();
	}
}
