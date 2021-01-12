package package1;

public class Sub extends Super {
	
	public Sub()
	{
		this.publicData=10;
		this.protectedData=10;
		this.defaultData=10;
		//this.privateData=10; //private는 후손이어도 접근 불가
	}
}
