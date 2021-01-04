package sist.com.obj.basic1;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.setName("cat");
		System.out.println(a.getName());
		a.setLeg(4);
		System.out.println(a.getLeg());
		a.setColor("Black");
		System.out.println(a.getColor());
		
	}
}
