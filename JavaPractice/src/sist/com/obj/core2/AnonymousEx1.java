package sist.com.obj.core2;

public class AnonymousEx1 {
	public void action() {
		ListInner i = new ListInner() {
			@Override
			public void empty() {
				// TODO Auto-generated method stub
				System.out.println("empty");
			}

			@Override
			public void isFull() {
				// TODO Auto-generated method stub
				System.out.println("isFull");
			}

			@Override
			public void get() {
				// TODO Auto-generated method stub
				System.out.println("get");
			}
			
		};// ListInner �̸����� ���� Ŭ����->anonymous 
		i.empty();
		i.isFull();
	}
	
	
	public static void main(String[] args) {
		new AnonymousEx1().action();
		
	}
}
