package sist.com.obj.basic1;
//Ŭ�������� ��������(instance, static, local), �޼ҵ�(������, �Ϲ�(instance, static))
public class Sports {
	private String name;
	private int players;
	private int playtime;
	
	public Sports() {//������
		this(" ");
		System.out.println("Sports()");
	}
	public Sports(String name) {
		this(name, 0);//this������
		System.out.println("Sports(String name)");
	}
	
	public Sports(String name, int players) {//�����ε�
		this(name, players, 0);
		System.out.println("Sports(String name, int players)");
	}
	
	public Sports(String name, int players, int playtime) {//�����ε�
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
