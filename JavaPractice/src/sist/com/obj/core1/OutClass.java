package sist.com.obj.core1;

public class OutClass {
	private static int outValue;
	private static int stValue;
	public static class Inner{ // 2. static���� ����
		private int iValue;
		private static int staticInner; // 1. error-> ����Ŭ������ static�� �ַ��� ����Ŭ������ static���� ����
		public Inner() {
			iValue=20;
			outValue=500; // 3. error -> �ܺ�Ŭ���� ������ static���� ���ؾ� ���ٰ���.
			stValue=200;
		}
	}
	
	
	public static void main(String[] args) {
		OutClass.Inner i = new OutClass.Inner();
	}
}
