package sist.com.obj.basic1;

public class Person {//클래스 영역
	private String name;//속성, field, 상태, data
	private int age;//속성을 외부에서 바꾸면 안되기 때문에 private를 권장
	private String address;
	
	public void setName(String irum) {//입력
		
		this.name=irum;
	}
	
	public String getName() {//반납
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	/*public static void main(String[] args) {
		Person p1=new Person();//heap에 name, age, address가 만들어진다.
		p1.name = "abc";//같은 class기 때문에 private여도 접근이 가능하다.
	}
*/
}
