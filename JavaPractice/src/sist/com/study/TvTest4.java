package sist.com.study;
//��ü �迭
//Tv tv1, tv2, tv3; -> Tv[] tvArr = new Tv[3];
//��ü�� �����ؼ� �迭�� �� ��ҿ� ����
//tvArr[0] = new Tv();
//tvArr[1] = new Tv();
//tvArr[2] = new Tv();

//Tv[] tvArr = {new Tv(), new Tv(), new Tv() };

//Tv[] tvArr = new Tv[100];
//for(int i=0;i<tvArr.length;i++){
	//tvArr[i] = new Tv(); }


public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� Tv��ü �迭
		
		// Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
	}//main ��
}

//Ŭ������ �� �ٸ� ����
//1.Ŭ���� - �����Ϳ� �Լ��� ����

//1. ���� : �ϳ��� �����͸� ������ �� �ִ� ����
//2. �迭 : ���� ������ ���� �����͸� �ϳ��� �������� ������ �� �ִ� ����
//3. ����ü : ���� ���õ� ���� �����͸� ������ ������� �ϳ��� �������� ������ �� �ִ� ����
//4. Ŭ���� : �����Ϳ� �Լ��� ����(����ü + �Լ�)

//2 Ŭ���� - ��������� Ÿ��(user-defined type)

