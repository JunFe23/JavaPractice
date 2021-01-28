package sist.com.io2;

import java.io.Serializable;

public class Member implements Serializable { // 직렬화 대상 객체에 명시하는 인터페이스.
	private String id;
	transient private String name; // transient는 객체의 속성을 배제하는 키워드.
	private int age;
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
