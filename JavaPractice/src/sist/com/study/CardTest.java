package sist.com.study;
//�ν��Ͻ�����(instance variable)
//- Ŭ���������� ����, �ν��Ͻ��� �����Ǿ��� �� ����, �������� ��������� ����(heap)

//Ŭ��������(class variable)
//- �ν��Ͻ����� �տ� static�� ����, Ŭ���� ������ ����, Ŭ������ �޸𸮿� �ö� �� �����Ǿ� ���α׷��� ����� �� ���� ����

//��������(local variable)
//Ŭ���� ���� �̿��� ����(�޼���, ������, �ʱ�ȭ �� ����) ����, ���� ������ ����Ǿ��� �� ����
public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); // Ŭ���� ���� ������� ����
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart"; // �ν��Ͻ����� ���� ����
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸� ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸� ũ��� (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50; // Ŭ���������� ���� �����Ѵ�.
		c1.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸� ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸� ũ��� (" + c2.width + ", " + c2.height + ")");
		
	}
}
//�ν��Ͻ������� �ν��Ͻ��� ������ �� ���� �����ǹǷ� �ν��Ͻ����� ���� �ٸ� ���� ������ �� ������, Ŭ���� ������ ��� �ν��Ͻ��� �ϳ��� ��������� �����ϹǷ�, �׻� ����� ���� ���´�.