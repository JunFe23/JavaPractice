package sist.com.obj.basic1;

public class ConstructorEx3 {
	static int CNT;
	String message;
	static {//static 블락에서 선언, static은 정적으로 Ex3보다 먼저 메모리에 할당되므로 생성자에서 선언 불가
		CNT=200;
	}
	
//	public ConstructorEx3() {//final로 선언한 CNT를 생성자 안에서 초기화해도 된다.
//		CNT=777;
//		//CNT=2000;//final이기 때문에 error!
//	}
	
	public ConstructorEx3() {
		
	}
	public ConstructorEx3(String message) {
		this.message=message;
	}
	
	public static int getCnt() {
		//this.message="Test"; static메소드에서 this사용불가, instance사용 불가
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
		c1.setCnt(400);//CNT=400으로 변경
		System.out.println(c2.getMessage());//bye 출력
		c2.setMessage("sorry");//c2의 message를 sorry로 변경
		System.out.println(c2.getMessage());//변경된 sorry 출력
		System.out.println(c1.getCnt());//CNT=400출력
		System.out.println(c2.getCnt());//c1에서 CNT값을 선언했지만 static변수이기 떄문에 400출력
	}
}
