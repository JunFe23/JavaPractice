package sist.com.obj.basic9;

public class MakerEx2 {
	
	public void makerProcess1() {
		Integer n=new Integer(10);
		Double d=new Double(20.5);
		System.out.println(n.compareTo(11)<0?"�Ķ���Ͱ� �� ũ��":"n�� �� ũ��");
		System.out.println(d.compareTo((double)11)<0?"�Ķ���Ͱ� �� ũ��":"n�� �� ũ��");
	}
	
	public static void main(String[] args) {
		MakerEx2 m = new MakerEx2();
		m.makerProcess1();
	}
}
