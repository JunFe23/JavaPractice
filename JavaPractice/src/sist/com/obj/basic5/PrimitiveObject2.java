package sist.com.obj.basic5;

public class PrimitiveObject2 extends Object {
	
	public void process2(PrimitiveObject2 param) {
		//System.out.println(this.equals(param)); //p2.process2(p2) �� true
		/*String str=new String("Abc");//value[A][b][c]
		System.out.println(str.equals(str));*/
		/*System.out.println(this.getClass());
		System.out.println(this.hashCode());*/
		
		//hashCode[key] | hashCodeValue //��ü�� �����ϴ� �ڵ尪
		//10 |����
		//11 |����
		//11 |���� ->�ϸ� 11�� ���Ⱑ ������. �̷� �ڷᱸ���� hash table�̶� ��.
		
		String str1 = "abc";
		String str2 = "abc";
		//System.out.println(str1==str2);//true, ���� ���� �ּҸ� ����Ŵ
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str3==str4);
		System.out.println(str3.hashCode()==str4.hashCode());
	}
	
	public static void main(String[] args) {
		PrimitiveObject2 p1=new PrimitiveObject2();//
		PrimitiveObject2 p2=new PrimitiveObject2();
		
		p2.process2(p2);//this�� p2, param�� p2 = true
		//p1.process2(p2);
	}
}
