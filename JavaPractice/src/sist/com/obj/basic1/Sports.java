package sist.com.obj.basic1;
//클래스개념 구조변수(instance, static, local), 메소드(생성자, 일반(instance, static))
public class Sports {
	private String name;
	private int players;
	private int playtime;
	
	public Sports() {//생성자
		this(" ");
		System.out.println("Sports()");
	}
	public Sports(String name) {
		this(name, 0);//this생성자
		System.out.println("Sports(String name)");
	}
	
	public Sports(String name, int players) {//오버로드
		this(name, players, 0);
		System.out.println("Sports(String name, int players)");
	}
	
	public Sports(String name, int players, int playtime) {//오버로드
		this.name=name;
		this.players=players;
		this.playtime=playtime;
		System.out.println("Sports(String name, int players, int playtime)");
	}
	
	public void disp() {
		System.out.println(this.name+" "+this.players+" "+this.playtime);
	}
	
	public static void main(String[] args) {
		Sports s1=new Sports();
//		Sports s2=new Sports();
		System.out.println("ConstructorEnd");
		//s1.disp();
	}
}
