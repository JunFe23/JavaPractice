package sist.com.util;

import java.util.ArrayList;
import java.util.HashMap;

public class UtilEx1P {
	public void utilExMethod11() {
		ArrayList<Double> list1 = new ArrayList<Double>(10); // elementsData Double�� ũ�Ⱑ 10�� �迭
		ArrayList<String> list2 = new ArrayList<String>(); // elementsData String�� �迭
		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // map�� key|value|
		
		System.out.println(list1.size()); // list1�� ������ �����Ƿ� ũ��� 10������ size�� 0�̳���
		//System.out.println(list1.get(0)); // Null�� �ƴ����� ���� �޸𸮰� ��������� ���� ���¶� ArrayIndexOutOfBoundException �߻�
		list1.add(1.1);
		list1.add(2.2);
		list1.add(3.3);
		list1.add(4.4);
		list1.add(5.5);
		list1.add(6.6);
		list1.add(7.7);
		list1.add(8.8);
		list1.add(9.9);
		list1.add(10.1);
		list1.add(11.1);
		System.out.println(list1); // ũ�� 10 �Ѿ�� �˾Ƽ� �߰�.
		System.out.println(list1.get(3)); // 4.4
		System.out.println(list1.add(12.2)); // boolean Ÿ������ true ����
		System.out.println(list1); // 12.2 �߰�
		
		list2.add("���ϰ�");
		list2.add("����");
		System.out.println(list2);
		System.out.println(list2.iterator().next()); // "���ϰ�"
		System.out.println(list2.iterator().next()); // "���ϰ�" -> ���� �����ȰŶ� ���� iterator�� �ٸ�
		
		map.put(1, "JunFe");
		map.put(2, "����");
		map.put(3, "����");
		System.out.println(map);
		System.out.println(map.get(2)); // Value���� get
		System.out.println(map.keySet()); // key���� Integer�� ����
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		UtilEx1P u = new UtilEx1P();
		u.utilExMethod11();
	}
}
