package sist.com.obj.core4Practice;

public class EconomicNews implements News {

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("경제기사 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("경제기사 삭제");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("경제기사 작성");
	}
	
}
