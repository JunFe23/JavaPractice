package sist.com.obj.basic7;

public abstract class AbstractCollectionEx implements CollectionEx {
	//3개만 오버라이드하고 추상클래스로 설정...

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Add");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("remove");
	}

	@Override
	public void isEmpty() {
		// TODO Auto-generated method stub
		System.out.println("isEmpty");
	}

	

	
}
