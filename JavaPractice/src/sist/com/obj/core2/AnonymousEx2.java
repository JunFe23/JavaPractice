package sist.com.obj.core2;

public class AnonymousEx2 {
	AbstractAction action=new AbstractAction() { // ����Ŭ���� ����
		
		@Override
		public void fileCheck() { // �߻�޼��� fileCheck�� �������̵�
			// TODO Auto-generated method stub
			System.out.println("fileCheck");
			
		}
	};
	
	public AnonymousEx2() {
		
		action.validate();
	}
	
	public static void main(String[] args) {
		new AnonymousEx2();
	}
}
