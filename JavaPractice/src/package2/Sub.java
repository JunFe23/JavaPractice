package package2;

import package1.Super;

public class Sub extends Super { //패키지가 다르고 후손영역인 class
	public Sub() {
		this.publicData=10;
		this.protectedData=10;
		//this.defaultData=10; //불가
		//this.privateData=10; //불가
	}
}
