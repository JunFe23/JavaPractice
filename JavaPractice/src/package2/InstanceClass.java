package package2;

import package1.Super;

public class InstanceClass { // ��Ű���� �ƴϰ� �ļյ� �ƴ� class

	public InstanceClass() {
		Super sp=new Super();
		sp.publicData=10;
		//sp.protectedData=10; // �Ұ�
		//sp.defaultData=10; // �Ұ�
		//sp.privateData=10; // �Ұ�
	}
}
