package sist.com.obj.basic1;

public class PersonMain {

	public static void main(String[] args) {
		//��ü�� �繰 �� ��ü this
		//��ü�� ����� ���� �ִ� data�̴�.
		Person p1=new Person();
		Person p2=new Person();
		p1.setName("abc");
		System.out.println(p2.getName());
		//p1.age=25;
		p1.setAge(15);
		System.out.println((p1.getAge()));
	}
}
