package sist.com.obj.basic2;

public class Alphabet {

	public static void main(String[] args) {
		C c=new C(10,new B(20,new A(30)));
		System.out.println(c.getB().getA().getA());
		
		
		//성적처리
		//번호 이름 국어 영어 수학 총점 평균 등수 학점
	}
}
