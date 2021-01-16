package sist.com.obj.core4;

public class JdbcDao implements Dao{

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
		System.out.println("JdbcDaodelete");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
		System.out.println("JdbcDaoupdate");
	}

	public void select() {
		System.out.println("Connect");
		System.out.println("JdbcDaoSelect");
	}
}
