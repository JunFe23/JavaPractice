package sist.com.obj.core4;

public class MarketingService extends AbstractService{
	private Dao dao; // �������̽� dao, ������ ���� ����

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
