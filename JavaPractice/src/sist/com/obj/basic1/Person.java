package sist.com.obj.basic1;

public class Person {//Ŭ���� ����
	private String name;//�Ӽ�, field, ����, data
	private int age;//�Ӽ��� �ܺο��� �ٲٸ� �ȵǱ� ������ private�� ����
	private String address;
	
	public void setName(String irum) {//�Է�
		
		this.name=irum;
	}
	
	public String getName() {//�ݳ�
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	/*public static void main(String[] args) {
		Person p1=new Person();//heap�� name, age, address�� ���������.
		p1.name = "abc";//���� class�� ������ private���� ������ �����ϴ�.
	}
*/
}
