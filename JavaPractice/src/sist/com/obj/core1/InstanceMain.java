package sist.com.obj.core1;

public class InstanceMain {
	
	public static void main(String[] args) {
		System.out.println(StaticOutterEx1.sValue);
		StaticOutterEx1.staticMethod(); // �� Ŭ�������� ����ƽ ������ �ٸ���.
		new StaticOutterEx1.Inner();
	}
}
