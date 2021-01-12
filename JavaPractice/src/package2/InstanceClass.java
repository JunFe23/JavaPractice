package package2;

import package1.Super;

public class InstanceClass { // 패키지도 아니고 후손도 아닌 class

	public InstanceClass() {
		Super sp=new Super();
		sp.publicData=10;
		//sp.protectedData=10; // 불가
		//sp.defaultData=10; // 불가
		//sp.privateData=10; // 불가
	}
}
