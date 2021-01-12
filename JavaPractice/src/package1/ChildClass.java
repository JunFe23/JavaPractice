package package1;

public class ChildClass extends ParentClass{

	@Override
	protected void parentMethod() {
		// TODO Auto-generated method stub
		super.parentMethod();
		System.out.println("ChildParentMethod");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
		c.parentMethod();
	}
	
	
}
