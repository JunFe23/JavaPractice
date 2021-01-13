package sist.com.obj.core1;
//����Ŭ���� (MemberInner, LocalInner, StaticInner, AnonymousInner)
public class Outterclass {
	private int outValue;
	public Outterclass() {
		System.out.println("Outterclass()");
		outValue=100;
	}
	public void outterMethod() {
		System.out.println("outterMethod");
	}
	public class Inner{
		private int innerValue;
		public Inner() {
			System.out.println("Inner()");
		}
		
		public void innerMethod() {
			outValue=200; // �ܺ�Ŭ������ ���� ȣ�� ����
			//Outterclass.outValue=300; // error, Outterclass.�� Ŭ��������(static����)�̹Ƿ� ������ static���� ����Ǿ�� ���� ����
			Outterclass.this.outValue=300; // ����. this�� �޾ұ⶧���� instance.
			System.out.println(outValue);
			outterMethod(); // ����Ŭ������ �ܺ�Ŭ������ �޼ҵ� ȣ�� ����
		}
	}
	
	public static void main(String[] args) {
		Outterclass.Inner o=new Outterclass().new Inner(); // Outterclass������ ���� ��, Inner������ ����.
		o.innerMethod();
		//o.outterMethod(); // ����Ŭ���� �ȿ����� ����
		
	}
}
