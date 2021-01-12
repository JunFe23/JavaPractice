package package2;

import package1.ParentClass;

public class Child2Class extends ParentClass {

	public void parentMethod() {
		super.parentMethod();
		System.out.println("Child2ParentMethod");
		
	}
	public static void main(String[] args) {
		Child2Class c = new Child2Class();
		
		c.parentMethod();
	}
	
}
