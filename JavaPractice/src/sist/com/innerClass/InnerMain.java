package sist.com.innerClass;

public class InnerMain {
	
	public static void main(String[] args) {
		//MemberInner.InnerClass inner = new MemberInner.new InnerClass(); // member 내부클래스 인스턴스 생성
		//StaticInner.StaticInnerClass staticInner = new StaticInner.StaticInnerClass(); // static 내부클래스 인스턴스 생성, 내부클래스가 static에 이미 생성되어 있어서(?)  외부클래스는 ()을 붙이지 않아도 된다?
		LocalInner inner = new LocalInner(); // Local내부클래스 인스턴스 선언
		//new AnonymousClass(); // anonymous 클래스 인스턴스 선언
	}
}
