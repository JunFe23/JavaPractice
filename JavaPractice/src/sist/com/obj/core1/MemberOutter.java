package sist.com.obj.core1;

public class MemberOutter {
	private int outterValue;
	MemberInner inner=new MemberInner();
	private void outterMethod() {
		System.out.println("outterMethod");
		return;
		//inner.innerMethod();
		
	}
	public class MemberInner{
		private int innerValue;
		private void innerMethod() {
			System.out.println("innerMethod");
			outterMethod();
		}
	}
	
	public static void main(String[] args) {
		MemberOutter.MemberInner i = new MemberOutter().new MemberInner();
		i.innerMethod();
	}
}