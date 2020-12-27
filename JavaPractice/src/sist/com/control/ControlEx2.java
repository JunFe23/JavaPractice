package sist.com.control;
//for, while, do~while
public class ControlEx2 {

	public void controlProcess1() { 
		/*for(;;) //삼항연산자의 조건이 없어서 무한 반
			System.out.println(";;");*/
		
		/*for(int x=0;x<5;x+=3) {
			System.out.println(";;");
		}*/
		
		/*for(int i=0;i<5;i++) {
			System.out.println("JunFe");
		}*/
		
		/*for(int i=0;i<5;i++) { // Zzang 5번, 0~4 출력 
			System.out.println("Zzang");
			System.out.println(i);
			
		}*/
		
		/*int i=0; //JunFe 5번 돌고 마지막에 i값 출력 
		for(;i<5;i++)
			System.out.println("JunFe");
			System.out.println(i);*/
		
		/*int i=0,j=0; // j를 초기화 해주지 않으면 3번만 출력하고 안돌
		for(;i<5;i++) {
			for(;j<3;j++) {
				System.out.println("i="+i+"j="+j);
				System.out.println("JunFe");
			}*/
	}
	public void controlProcess2(int cnt) {
		for(int i=1;i<=cnt;i++) { // 8의 배수에서 줄바꿈,  짝수 출
			if(i%8==0)System.out.println();
			if(i%2!=0)continue;
			System.out.printf("%5d",i);
		}
	}
	
	public void controlProcess3() {
		boolean state=true;
		int cnt=0;
		while(state) {
			if(cnt>5) break;
			System.out.println("JunFe");
			cnt++;
		}
		state=false;
		System.out.println("KJC");
	}
	
	public int controlProcess4(int cnt, char mode) { // 전체합, 짝수합, 홀수합, 3의배수
		int i=0,sum=0,odd=0,even=0,sam=0; //while문 이용 
		while(i<=cnt) {
			if(i%2==0)even+=i;
			else odd+=i;
			if(i%3==0)sam+=i;
			sum=sum+i++;
		}
		switch(mode) {
		case 's':
			return sum;
		case 'o':
			return odd;
		case 'e':
			return even;
		default:
			return sam;
		}
	}
	
	public void controlProcess5() { // for문 이용 
		int sum=0,odd=0,even=0,sam=0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
			if(i%2==0) even=even+i;
			else odd=odd+i;
			if(i%3==0) sam=sam+i;
		}
		System.out.println("모든 수의 합은 = "+sum);
		System.out.println("짝수의 합은 = "+even);
		System.out.println("홀수의 합은 = "+odd);
		System.out.println("3의 배수들 합은 = "+sam);
	}
	
	public static void main(String[] args) {
		ControlEx2 c = new ControlEx2();
		//c.controlProcess1();
		//c.controlProcess2(100);
		//c.controlProcess3();
		//System.out.println(c.controlProcess4(100, 'a'));
		c.controlProcess5();
	}
}
