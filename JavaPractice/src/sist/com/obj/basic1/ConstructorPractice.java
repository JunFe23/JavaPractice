package sist.com.obj.basic1;

public class ConstructorPractice {
	
	public void makerEx() {
		String []data= {"�Ѽ���#941210-1010789#051)675-1234",
				"���ϱ�#980105-2010786#02)975-1234",
				"������#990910-2107899#031)478-1234",
				"�����#910510-1010589#02)985-1234",
				"���¿�#580101-1010689#02)378-9234"};
		for (int i = 0; i < data.length; i++) {
			String []subData=data[i].split("#");//#�� �������� �����͸� ����
			for (int j = 0; j < subData.length; j++) {
				System.out.println(subData[j]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		ConstructorPractice c=new ConstructorPractice();
		c.makerEx();
	}
}
