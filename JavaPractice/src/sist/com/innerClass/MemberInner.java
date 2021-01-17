package sist.com.innerClass;

public class MemberInner { // 멤버내부클래스
	int a = 1;
	static int b = 2 ;
	
	public static void MemberInner(){
		int e = 5;
		System.out.println("MemberOuterClass");
		
	}
	
	class InnerClass{
		//static int c = 3; // 외부클래스가 생성되기 전에 static이 생성되므로 불가
		int d = 4;
		
		InnerClass() {
			System.out.println("MemberInnerClass");
		}
	}
}
