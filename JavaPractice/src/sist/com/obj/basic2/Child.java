package sist.com.obj.basic2;

public class Child extends Parents {
	int childValue;
	
	public Child() {
		this.childValue=100;
		this.parentsValue=10;
		//this.parentsMoney=200;//priavate변수라 외부에서 접근 불가, super통해서 접근 가능?
	}
	
	public static void main(String[] args) {
		new Child();
	}
}
