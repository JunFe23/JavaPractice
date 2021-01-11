package sist.com.obj.basic4;

public abstract class AbstractSub extends AbstractSuper{//abstract 메소드가 없어도 abstract 클래스로 선언 가능.
	public void subMethod() {
		System.out.println("subMethod");
	}
	public abstract void abstractSub();
	
	public void abstractSuperMethod() {
		
	}
}
