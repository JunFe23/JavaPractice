package Package3;

public class ObjectEx extends Object implements Cloneable {
	private int objData; //����ȭ

	public ObjectEx() {
		super();
	}
	
	public ObjectEx(int objData) {
		super();
		this.objData = objData;
	}
	
	public void copyObject() {
		try {//������ ���� ����, ���� catch			
			Object o = this.clone();
			System.out.println(o);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
		return "ObjectEx [objData=" + objData + "]";
	}

	public static void main(String[] args) {
		ObjectEx o=new ObjectEx(10);
		ObjectEx o2=new ObjectEx(100);
		o2.copyObject();
	}
	
	
}
