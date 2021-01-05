package sist.com.obj.basic1;

import java.util.Arrays;

public class ConstructorEx4 {

	public void makerEx1() {
		String str1=new String("abc");//value[a][b][c]
		String str2=new String("def");//value[d][e][f]
		
		System.out.println(str1.charAt(0));//str1의 abc에서 a를 char값으로 출력
		System.out.println(str2.codePointAt(0));//str2의 def에서 e를 int값으로 출력
	}
	
	public void makerEx2() {
		String str1="A#$7y";
		String str2="abcdea";
		String str3="김준철";
		System.out.println(str1.substring(str1.indexOf('$'),str1.indexOf('$')+1));//$출력
		System.out.println(str2.indexOf("a",2));//index2부터 a를 찾아 그 index값을 출력. ->5
		System.out.println(str2.lastIndexOf("a",1));//index뒤에서 1번째부터 a를 찾아 그 index값을 출력. -> 0
		String s=String.valueOf(5>3).charAt(0)=='t'?"참":"거짓";
		//System.out.println(s.concat("입니다."));
	}
	
	public void makerEx3() {
		//이름 나이 오늘생일 성별 지역 전화번호
		
		String []data= {"한성준#941210-1010789#051)675-1234",
						"윤하김#980105-2010786#02)975-1234",
						"엄찬미#990910-2107899#031)478-1234",
						"김원겸#910510-1010589#02)985-1234",
						"조태연#580101-1010689#02)378-9234"};
		
		String []age={"0","0","0","0","0"};
		for (int i = 0; i < data.length; i++) {
			age[i]=data[i].substring(4,6);
		}
		
		String []birthday={"0","0","0","0","0"};
		for (int i = 0; i < data.length; i++) {
			birthday[i]=data[i].substring(6, 10);
			if(birthday[i].equals("0105")){
				birthday[i]="생일 추카해";
			}else {
				birthday[i]="다음 생일에";
			}
		}
		
		String []mf={"0","0","0","0","0" };
		for (int i = 0; i < data.length; i++) {
			mf[i]=data[i].substring(11,12);
			if(mf[i].equals("1")) {
				mf[i]="남자";
			}else {
				mf[i]="여자";
			}
		}
		
		String []tel=new String[5];
		for (int i = 0; i < tel.length; i++) {
			tel[i]=data[i].substring(19);
		}
						
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%5s",data[i].substring(0,3));//이름
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
