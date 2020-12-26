package sist.com.control;

import java.util.Scanner;

public class ControlEx1 {
	
	public void controlDemo1(double avg) {
		if(avg>=90) System.out.println("A");
		else if(avg>=80) System.out.println("B");
		else if(avg>=70) System.out.println("C");
		else if(avg>=60) System.out.println("D");
		else System.out.println("F");
	}
	
	public void controlDemo2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 숫자를 선택해주세요. 1(라면) 2(김밥)");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("맛을 선택해주세요. 1(순한맛) 2(중간맛) 3(매운맛)");
			int flavor = sc.nextInt();
			
			switch(flavor) {
			case 1:
				System.out.println("순한맛 라면을 선택하셨습니다.");
				return;
			case 2:
				System.out.println("중간맛 라면을 선택하셨습니다.");
				return;
			case 3:
				System.out.println("매운맛 라면을 선택하셨습니다.");
				return;
			}
		case 2:
			System.out.println("맛을 선택해주세요. 1(참치김밥) 2(치즈김밥) 3(불고기김밥)");
			int flavor2=sc.nextInt();
			switch(flavor2) {
			case 1:
				System.out.println("참치김밥을 선택하셨습니다.");
				return;
			case 2:
				System.out.println("치즈김밥을 선택하셨습니다.");
				return;
			case 3:
				System.out.println("불고기김밥을 선택하셨습니다.");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ControlEx1 c = new ControlEx1();
		//c.controlDemo1(50.6); // F
		c.controlDemo2(); // 입력받은 값으로 선택하는 switch문 
	}
}
