package sist.com.obj.core4;

public class MapService extends AbstractService{
	private Dao dao; // �������̽� dao , ������ ���� ����
	
	public MapService(Dao dao) {
		super();
		this.dao = dao; // ���� ����
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
