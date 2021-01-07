package sist.com.obj.basic2;

public class B {
	private int b;
	private A a;
	public B() {
		
	}
	public B(int b) {
		this.b=b;
	}
	public B(int b,A a) {
		this.b=b;
		this.a=a;//의존성을 주입
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return this.b;
	}
	public void setA(A a) {
		this.a=a;
	}
	public A getA() {
		return this.a;
	}
}
