package sist.com.obj.core2;

public class AnonymousEx2 {
	AbstractAction action=new AbstractAction() { // 내부클래스 영역
		
		@Override
		public void fileCheck() { // 추상메서드 fileCheck만 오버라이드
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
