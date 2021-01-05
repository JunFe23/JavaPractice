package sist.com.obj.basic1;

import java.util.Arrays;

public class ConstructorEx4 {

	public void makerEx1() {
		String str1=new String("abc");//value[a][b][c]
		String str2=new String("def");//value[d][e][f]
		
		System.out.println(str1.charAt(0));//str1�� abc���� a�� char������ ���
		System.out.println(str2.codePointAt(0));//str2�� def���� e�� int������ ���
	}
	
	public void makerEx2() {
		String str1="A#$7y";
		String str2="abcdea";
		String str3="����ö";
		System.out.println(str1.substring(str1.indexOf('$'),str1.indexOf('$')+1));//$���
		System.out.println(str2.indexOf("a",2));//index2���� a�� ã�� �� index���� ���. ->5
		System.out.println(str2.lastIndexOf("a",1));//index�ڿ��� 1��°���� a�� ã�� �� index���� ���. -> 0
		String s=String.valueOf(5>3).charAt(0)=='t'?"��":"����";
		//System.out.println(s.concat("�Դϴ�."));
	}
	
	public void makerEx3() {
		//�̸� ���� ���û��� ���� ���� ��ȭ��ȣ
		
		String []data= {"�Ѽ���#941210-1010789#051)675-1234",
						"���ϱ�#980105-2010786#02)975-1234",
						"������#990910-2107899#031)478-1234",
						"�����#910510-1010589#02)985-1234",
						"���¿�#580101-1010689#02)378-9234"};
		
		String []age={"0","0","0","0","0"};
		for (int i = 0; i < data.length; i++) {
			age[i]=data[i].substring(4,6);
		}
		
		String []birthday={"0","0","0","0","0"};
		for (int i = 0; i < data.length; i++) {
			birthday[i]=data[i].substring(6, 10);
			if(birthday[i].equals("0105")){
				birthday[i]="���� ��ī��";
			}else {
				birthday[i]="���� ���Ͽ�";
			}
		}
		
		String []mf={"0","0","0","0","0" };
		for (int i = 0; i < data.length; i++) {
			mf[i]=data[i].substring(11,12);
			if(mf[i].equals("1")) {
				mf[i]="����";
			}else {
				mf[i]="����";
			}
		}
		
		String []tel=new String[5];
		for (int i = 0; i < tel.length; i++) {
			tel[i]=data[i].substring(19);
		}
						
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%5s",data[i].substring(0,3));//�̸�
			System.out.printf("%5d", 2020-(1900+Integer.parseInt(age[i]))+1);
			System.out.printf("\t%5s", birthday[i]);
			System.out.printf("%5s", mf[i]);
			System.out.printf("\t%5s\n", tel[i]);
		}
	}
	
	public static void main(String[] args) {
		ConstructorEx4 c=new ConstructorEx4();
		//c.makerEx1();
		//c.makerEx2();
		c.makerEx3();
	}
}
