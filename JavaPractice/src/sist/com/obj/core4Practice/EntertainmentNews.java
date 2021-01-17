package sist.com.obj.core4Practice;

public class EntertainmentNews implements News {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("연예기사 작성");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("연예기사 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("연예기사 삭제");
	}
	
}
