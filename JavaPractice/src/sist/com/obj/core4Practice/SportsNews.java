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
		System.out.println("스포츠기사 작성");
		sports.shoot();
		System.out.println("에 관한 기사입니다.");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("스포츠기사 수정");
		sports.run();
		System.out.println("에 대한 기사 수정입니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("스포츠기사 삭제");
	}

}
