package sist.com.obj.core4Practice;

public class SportsNews implements News{
	private Sports sports;
	
	
	public SportsNews(Sports sports) {
		super();
		// TODO Auto-generated constructor stub
		this.sports=sports;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("��������� �ۼ�");
		sports.shoot();
		System.out.println("�� ���� ����Դϴ�.");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("��������� ����");
		sports.run();
		System.out.println("�� ���� ��� �����Դϴ�.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("��������� ����");
	}

}
