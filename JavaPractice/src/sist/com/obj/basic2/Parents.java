package sist.com.obj.basic2;

public class Parents extends Object {
	int parentsValue;
	private int parentsMoney;
	
	public Parents() {
		
	}
	public Parents(int parentsMoney) {//private변수이지만 내부에서는 접근 가능.
		this.parentsMoney=parentsMoney;
	}
}
