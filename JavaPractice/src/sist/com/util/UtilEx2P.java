package sist.com.util;

import java.util.HashMap;
import java.util.HashSet;

public class UtilEx2P {

	public void process1() {
		int []i = {1,2,3,1,4,2,5,6,7,3,8,9,4,5,10,10,10};
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		System.out.println(set1.add(i[0])); // boolean Ÿ������ ����ϸ� true
		System.out.println(set1.add(i[0])); // boolean Ÿ������ ����ϸ� �̹� i[0]�ȿ� 0���� �ֱ⶧���� false, set�� �ߺ� ��� x
		
		set1.add(i[0]); // set1�� i[0] �߰�
		set1.add(i[0]); // set1�� i[0] �߰��Ϸ��ϳ� �ߺ��̶� �ȵ�.
		
		System.out.println(set1); // �׷��� ���� �ϳ��� ����.
		
		for (int j = 0; j < i.length; j++) {
			//if(set1.add(i[j]))
		}
	
	}
	
	
	
	public static void main(String[] args) {
		UtilEx2P u = new UtilEx2P();
		u.process1();
	}
}
