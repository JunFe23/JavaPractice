package sist.com.exception;

public class Com implements Cloneable { // ���������� �ǹ� ������ Cloneable
	private String msg;
	
	public Com(String msg) {
		super();
		this.msg=msg;
		
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Com [msg=" + msg + "]";
	}
	
	
}
