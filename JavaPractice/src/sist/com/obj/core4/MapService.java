package sist.com.obj.core4;

public class MapService extends AbstractService{
	private Dao dao; // 인터페이스 dao , 의존성 없는 상태
	
	public MapService(Dao dao) {
		super();
		this.dao = dao; // 의존 주입
	}

	@Override
	public void fileUpload() {
		// TODO Auto-generated method stub
		dao.select();
		System.out.println("MapServicefileUpload");
	}

	@Override
	public void checkSize() {
		// TODO Auto-generated method stub
		
	}

}
