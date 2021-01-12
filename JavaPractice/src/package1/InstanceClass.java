package package1;

public class InstanceClass {//같은 패키지에 후손은 아닌 class

	public InstanceClass() {
		Super sp = new Super();
		sp.publicData=10;
		sp.protectedData=10;
		sp.defaultData=10;
		//sp.privateData=10; //불가
	}
}
