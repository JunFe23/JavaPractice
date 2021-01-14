package sist.com.obj.core1;

public class StaticOutterEx1 {
	static int sValue=999;
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	public static class Inner{
		int iValue=99;
		public Inner() {
			System.out.println("Inner()");
			System.out.println(iValue);
			System.out.println(sValue);
		}
	}
}
