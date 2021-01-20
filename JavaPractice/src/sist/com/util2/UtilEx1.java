package sist.com.util2;

import java.util.StringTokenizer;

public class UtilEx1 {
	
	public void actionEx1() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO, ENMAE, SAL ")
		  .append("FROM EMP ")
		  .append("WHERE SAL = 3000 ")
		  .append("GROUP BY DEPTNO");
		sb.insert(0, 5>3); // ���� ���ڿ��� ����, boolean���� ������ true, false
		sb.deleteCharAt(0); // True���� 0��°�� T�� ���ư�
		sb.delete(0, 4); // 0~4 ���� ���ڿ� ����
		System.out.println(sb.capacity()); // capacity : �迭�� ���̰�
		sb.reverse(); // ������
		System.out.println(sb);
	}
	
	public void actionEx2(String data) {
		if(data.startsWith("[STONE]")) { // [STONE]���� �����ϸ� true
			int x = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[0].split("=")[1]); // " "���� 0��°�� "="���� 1��° ��
			int y = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[1].split("=")[1]);
			System.out.println(x + " + "+y+" = "+(x+y));
		}
	}
	
	public void actionEx3(String value) {
		System.out.println(value.replace('a', 'z')); // �׳� �� ����. value�� �ٲ��ٰ� �����ϱ� ����.
		System.out.println(value.replace("b", "UU")); // ���ڿ� ��ȯ
		value = value.replace('a', 'z'); // replace�� �ؼ� ��ȯ�� ���� return �ϴ� �ͻ����� ������ �ٲ�� ���� �ƴϴ�. �׷��� value�� ����.
		System.out.println(value);
		System.out.println(value.equals("ZBC")); // false
		System.out.println(value.equals("ZBC".toLowerCase())); // �ҹ��ڷ� ����, true
		System.out.println(value.trim().equals("zbc")); // trim�� ���ڿ� �¿� ���� ������.
		System.out.println(value.replace(" ", "").equals("zbc")); // ������ ���ڿ� ���̿� ���� ��� replace�� ����
		
	}
	
	public void actionEx4() {
		StringTokenizer s = new StringTokenizer("2021/9/1","/"); // �Ķ���� ���� �����ڴ� ���ǹ�
		System.out.println(s.countTokens());
		/*while(s.hasMoreElements()) {
			System.out.println(s.nextElement() instanceof Integer); // Integer�� ����ȯ�� �� ����. String���� instanceof �غ��� true
		};*/
		for(;s.hasMoreTokens();) { // ���� while���� ���� �����ϸ� next�� �� ���� �����̱� ������ �̰� �ȵ��ư�.
			System.out.println(s.nextToken());
		}
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		//u.actionEx1();
		//u.actionEx2("[STONE]X=100 Y=250");
		//u.actionEx2("[WIN]BLUE");
		//u.actionEx3("ab c");
		u.actionEx4();
		
	}
}
