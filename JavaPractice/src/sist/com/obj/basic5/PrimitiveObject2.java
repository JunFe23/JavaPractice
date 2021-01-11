package sist.com.obj.basic5;

public class PrimitiveObject2 extends Object {
	
	public void process2(PrimitiveObject2 param) {
		//System.out.println(this.equals(param)); //p2.process2(p2) 시 true
		/*String str=new String("Abc");//value[A][b][c]
		System.out.println(str.equals(str));*/
		/*System.out.println(this.getClass());
		System.out.println(this.hashCode());*/
		
		//hashCode[key] | hashCodeValue //객체를 저장하는 코드값
		//10 |딸기
		//11 |딸기
		//11 |수박 ->하면 11번 딸기가 없어짐. 이런 자료구조를 hash table이라 함.
		
		String str1 = "abc";
		String str2 = "abc";
		//System.out.println(str1==str2);//true, 둘이 같은 주소를 가리킴
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str3==str4);
		System.out.println(str3.hashCode()==str4.hashCode());
	}
	
	public static void main(String[] args) {
		PrimitiveObject2 p1=new PrimitiveObject2();//
		PrimitiveObject2 p2=new PrimitiveObject2();
		
		p2.process2(p2);//this는 p2, param은 p2 = true
		//p1.process2(p2);
	}
}
