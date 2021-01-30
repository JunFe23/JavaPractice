package sist.com.io2;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class ProductUI {
	//Scanner scanner = new Scanner(new File(null)); // File로부터 스캔도 가능.
	Scanner scanner = new Scanner(System.in);
	
	
	public void menu() {
		while(true) {
		System.out.println("1.로그인 2.회원가입 3.회원정보수정 4.회원탈퇴 5.전체조회");
		switch (scanner.nextInt()) {
		case 1:
			loginProcess();
			break;
		
		case 2:
			addMember();
			break;
	
		case 3:
			modifyMember();
			break;
			
		case 4:

			break;
		case 5:
			selectMember();
			break;
		}
		}
	}
	

	
	public void modifyMember() {
		System.out.println("정보수정 화면");
		System.out.print("ID : ");
		String id = scanner.next();
		System.out.println("PASSWORD : ");
		String password = scanner.next();
		Boolean state = DaoProduct.idPassCheck(id, password);
		if(state==true) {
			
		}
	}
	
	public void selectMember() {
		Vector<ProductMember> v = DaoProduct.getAllData();
		for(ProductMember p:v) {
			System.out.println(p.getName()+" "+p.getId()+" "+p.getPassword());
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
	
	public void addMember() {
		System.out.println("회원가입 화면");
		ProductMember productMember = new ProductMember();
		System.out.print("NAME : ");
		productMember.setName(scanner.next());
		String id = null;
		do {
			System.out.print("ID : ");
			id=scanner.next();
		} while (DaoProduct.idUnique(id));
		productMember.setId(id);
		System.out.print("PASSWORD : ");
		productMember.setPassword(scanner.next());
		DaoProduct.insertMember(productMember);
	}
	
	public static void main(String[] args) {
		ProductUI p = new ProductUI();
		p.menu();
		
	}
}
