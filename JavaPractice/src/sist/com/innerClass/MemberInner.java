package sist.com.innerClass;

public class MemberInner { // �������Ŭ����
	int a = 1;
	static int b = 2 ;
	
	public static void MemberInner(){
		int e = 5;
		System.out.println("MemberOuterClass");
		
	}
	
	class InnerClass{
		//static int c = 3; // �ܺ�Ŭ������ �����Ǳ� ���� static�� �����ǹǷ� �Ұ�
		int d = 4;
		
		InnerClass() {
			System.out.println("MemberInnerClass");
		}
	}
}
