package sist.com.io2;

import java.io.File;
import java.util.Scanner;

public class ProductUI {
	//Scanner scanner = new Scanner(new File(null)); // File로부터 스캔도 가능.
	Scanner scanner = new Scanner(System.in);
	
	
	public void menu() {
		System.out.println("1.로그인 2.회원가입 3.회원정보수정 4.회원탈퇴");
		switch (scanner.nextInt()) {
		case 1:
			loginProcess();
			
			break;
		
		case 2:
			System.out.println("회원가입 화면");
			break;
	
		case 3:
			System.out.println("회원정보 수정");
			System.out.println("수정할 ID : ");
					
			break;

		default:
			break;
		}
	}
	
	public void loginProcess() {
		System.out.println("로그인 화면");
		System.out.print("ID : ");
		String id = scanner.next();
		System.out.print("PASSWORD : ");
		String password = scanner.next();
		Boolean state = DaoProduct.idPassCheck(id, password);
		
		if(state==true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 및 비밀번호를 확인하세요");
		}
			
		
	}
	
	public void signIn() {
		System.out.println("회원가입 화면");
		System.out.println("NAME : ");
		String name = scanner.next();
		System.out.println("ID : ");
		String id = scanner.next();
		System.out.println("PASSWORD : ");
		String password = scanner.next();
		
		
	}
	
	public static void main(String[] args) {
		ProductUI p = new ProductUI();
		p.menu();
		
	}
}
