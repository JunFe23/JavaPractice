package sist.com.obj.basic1;

public class ConstructorEx3 {
	static int CNT;
	String message;
	static {//static ������� ����, static�� �������� Ex3���� ���� �޸𸮿� �Ҵ�ǹǷ� �����ڿ��� ���� �Ұ�
		CNT=200;
	}
	
//	public ConstructorEx3() {//final�� ������ CNT�� ������ �ȿ��� �ʱ�ȭ�ص� �ȴ�.
//		CNT=777;
//		//CNT=2000;//final�̱� ������ error!
//	}
	
	public ConstructorEx3() {
		
	}
	public ConstructorEx3(String message) {
		this.message=message;
	}
	
	public static int getCnt() {
		//this.message="Test"; static�޼ҵ忡�� this���Ұ�, instance��� �Ұ�
		return CNT;
	}
	public static void setCnt(int CNT) {
		ConstructorEx3.CNT=CNT;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
	
	
	
	
	public static void main(String[] args) {
		ConstructorEx3 c1=new ConstructorEx3("hi");//message
		ConstructorEx3 c2=new ConstructorEx3("bye");//message
		ConstructorEx3 c3=new ConstructorEx3("good");//message
		c1.setCnt(400);//CNT=400���� ����
		System.out.println(c2.getMessage());//bye ���
		c2.setMessage("sorry");//c2�� message�� sorry�� ����
		System.out.println(c2.getMessage());//����� sorry ���
		System.out.println(c1.getCnt());//CNT=400���
		System.out.println(c2.getCnt());//c1���� CNT���� ���������� static�����̱� ������ 400���
	}
}
