package sist.com.obj.basic1;

public class ConstructorPractice {
	
	public void makerEx() {
		String []data= {"한성준#941210-1010789#051)675-1234",
				"윤하김#980105-2010786#02)975-1234",
				"엄찬미#990910-2107899#031)478-1234",
				"김원겸#910510-1010589#02)985-1234",
				"조태연#580101-1010689#02)378-9234"};
		for (int i = 0; i < data.length; i++) {
			String []subData=data[i].split("#");//#을 기준으로 데이터를 나눔
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
