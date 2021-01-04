package sist.com.obj.basic1;

public class PersonMain {

	public static void main(String[] args) {
		//객체는 사물 그 자체 this
		//객체는 기능을 갖고 있는 data이다.
		Person p1=new Person();
		Person p2=new Person();
		p1.setName("abc");
		System.out.println(p2.getName());
		//p1.age=25;
		p1.setAge(15);
		System.out.println((p1.getAge()));
	}
}
