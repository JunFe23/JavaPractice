package sist.com.innerClass;

public class InnerMain {
	
	public static void main(String[] args) {
		//MemberInner.InnerClass inner = new MemberInner.new InnerClass(); // member ����Ŭ���� �ν��Ͻ� ����
		//StaticInner.StaticInnerClass staticInner = new StaticInner.StaticInnerClass(); // static ����Ŭ���� �ν��Ͻ� ����, ����Ŭ������ static�� �̹� �����Ǿ� �־(?)  �ܺ�Ŭ������ ()�� ������ �ʾƵ� �ȴ�?
		LocalInner inner = new LocalInner(); // Local����Ŭ���� �ν��Ͻ� ����
		//new AnonymousClass(); // anonymous Ŭ���� �ν��Ͻ� ����
	}
}
