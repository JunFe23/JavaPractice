package sist.com.innerClass;

public class LocalInner { // Local����Ŭ����
	static String sov = "StaticOuterValue";
	String ov = "LocalOuterValue";
	
	public LocalInner() {
		super();
		// TODO Auto-generated constructor stub
		class LocalInnerClass{
			//static String siv = "StaticInnerValue"; // static���� �Ұ�, �޼ҵ尡 ȣ�⵵ �ȵƴµ� �������� ������� �� ���� ����
			String iv = "LocalInnerValue";

			public LocalInnerClass() {
			
				// TODO Auto-generated constructor stub
				System.out.println("LocalInnerClass");
			}
		}
		new LocalInnerClass();
	}
	
}
