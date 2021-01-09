package sist.com.obj.basic3;

public abstract class Person {//추상클래스, 객체생성 불가
	public Person() {
		
	}
	
	public abstract void eat();//미완성메소드, 추상메소드
	
	public void sleep() {//일반 메소드
		System.out.println("집에서 잔다.");
	}
}
