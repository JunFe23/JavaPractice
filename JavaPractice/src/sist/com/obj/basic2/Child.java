package sist.com.obj.basic2;

public class Child extends Parents {
	int childValue;
	
	public Child() {
		this.childValue=100;
		this.parentsValue=10;
		//this.parentsMoney=200;//priavate������ �ܺο��� ���� �Ұ�, super���ؼ� ���� ����?
	}
	
	public static void main(String[] args) {
		new Child();
	}
}
