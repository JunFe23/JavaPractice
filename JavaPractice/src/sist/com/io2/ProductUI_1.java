package sist.com.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ProductUI_1 {
	//Scanner scanner = new Scanner(new File(null)); // Fil로부터 스캔도 가능.
	Scanner scanner = new Scanner(System.in);
	String id;
	String password;
	String name;
	
	public void menu() {
		System.out.println("1.로그인 2.회원가입 3.회원정보수정 4.회원탈퇴");
		switch (scanner.nextInt()) {
		case 1:
			logIn();
			
			break;
		
		case 2:
			System.out.println("회원가입 화면");
			break;
	
		case 3:
			System.out.println("회원정보 수정");
			System.out.println("수정할 ID : ");
			id = scanner.next();
					
			break;

		default:
			break;
		}
	}
	
	public void search(String path) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			ois.read();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void logIn() {
		System.out.println("로그인 화면");
		System.out.print("ID : ");
		id = scanner.next();
		System.out.print("PASSWORD : ");
		password = scanner.next();
		search(AdminProcess.PATH);
		//System.out.println("ID : " + id + " PASSWORD : " +password);
	}
	
	public void signIn() {
		System.out.println("회원가입 화면");
		System.out.println("NAME : ");
		name = scanner.next();
		System.out.println("ID : ");
		id = scanner.next();
		System.out.println("PASSWORD : ");
		password = scanner.next();
		
		
	}
	
	public static void main(String[] args) {
		ProductUI_1 p = new ProductUI_1();
		p.menu();
		
	}
}
