package sist.com.obj.core1;

public class InstanceMain {
	
	public static void main(String[] args) {
		System.out.println(StaticOutterEx1.sValue);
		StaticOutterEx1.staticMethod(); // 각 클래스마다 스태틱 영역이 다르다.
		new StaticOutterEx1.Inner();
	}
}
