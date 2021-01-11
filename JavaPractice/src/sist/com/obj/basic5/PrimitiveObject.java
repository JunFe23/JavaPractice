package sist.com.obj.basic5;

public class PrimitiveObject {

	public void castObject(Object data) {
		if(data instanceof String) {
			System.out.println(((String)data).charAt(0));
		}else if(data instanceof Double){
			System.out.println(((Double)data).doubleValue());
		}else if(data instanceof Integer) {
			System.out.println(((Integer)data).intValue());
		}
		
	}
	
	public void castObject2(Object data) {//Object data=new App();    App(  Object()  )
		//data.appAction();
		//System.out.println(data instanceof App);//true
		//((App)data).appAction();//downcast
		//System.out.println(data.toString());//object의 것이 호출
		//System.out.println(((App)data).toString());//App에 String이 없지만 선조것이 호출이됨.
		//System.out.println(data);//App(   Object   (toString X)  toString O )
		
		System.out.println(data.toString());
	}
	
	public void castObject3(Object data) {
		System.out.println(data.hashCode());//App(   Object   (hashCode X)  hashCode O   )
	}
	
	public static void main(String[] args) {
		PrimitiveObject p = new PrimitiveObject();
		//p.castObject(new String("JunFe"));//Object data=new String("JunFe");  String(  Object()  )
		//p.castObject(new Double(10.5));//Object data=new Double(10.5);   Double(  Object()  )
		//p.castObject(new Integer(100));//Object data = new Integer(100);   Integer(  Object()  )
		p.castObject2(new App());
		p.castObject3(new App());
	}
}
