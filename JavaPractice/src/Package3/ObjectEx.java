package Package3;

public class ObjectEx extends Object implements Cloneable {
	private int objData; //은닉화

	public ObjectEx() {
		super();
	}
	
	public ObjectEx(int objData) {
		super();
		this.objData = objData;
	}
	
	public void copyObject() {
		try {//에러가 나도 도전, 나면 catch			
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
