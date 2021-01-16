package sist.com.obj.core4;

public class MarketingService extends AbstractService{
	private Dao dao; // 인터페이스 dao, 의존성 없는 상태

	public MarketingService(Dao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void fileUpload() {
		// TODO Auto-generated method stub
		dao.select();
		System.out.println("MarketingServicefileUpload");
	}

	@Override
	public void checkSize() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
