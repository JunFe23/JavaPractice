package sist.com.util2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class UtilEx4 {

	public void listMethod1() {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("��ö");
		v1.addElement("�켮");
		v1.addElement("����");
		v1.addElement("����");
		v1.addElement("�α�");
		
		/*for (int i = 0; i < v1.size(); i++) {
			//System.out.println(v1.get(i));
			System.out.println(v1.elementAt(i));
		}*/
		Iterator<String> i = v1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		i = v1.iterator(); // ���� ���� i�� �״�� ���鼭 iterator ��ü ���� ����
		for(;i.hasNext();) {
			System.out.println(i.next());
		}
		System.out.println();
		
		Enumeration<String>e = v1.elements(); // �̰� ���� �ݺ��ڴ�. StringTokenizer�� ��� 
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		System.out.println();
		System.out.println(v1.firstElement()); // ù��° �� = "��ö"
		int a = v1.indexOf("����")+v1.indexOf("��ö"); // ��ö index = 0, ���� index = 3
		System.out.println(a); // 0+3 = 3
		
		System.out.println();
		v1.insertElementAt("��", 5); // index 5���� "��" �߰�
		System.out.println(v1); // �߰��� ���
		
		v1.set(0, "����"); // index 0�� ���� "����" ����
		System.out.println(v1); // ����� Ȯ��
		
	}
	
	public void listMethod1_1() {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("��ö");
		v1.addElement("�켮");
		v1.addElement("����");
		v1.addElement("����");
		v1.addElement("�α�");
		
		ListIterator<String> i = v1.listIterator();
		System.out.println(i.nextIndex()); // 0 -> ���� next �� �ؼ� 0
		i.next();
		System.out.println(i.nextIndex()); // 1
		
		System.out.println();
		while(i.hasNext()) // ������� ���ٰ�
			System.out.println(i.next());
		while(i.hasPrevious()) // ������
			System.out.println(i.previous());
		
			
		System.out.println(); // nextIndext�� cursor��, previousIndex�� cursor - 1
		System.out.println(i.nextIndex()); // next: 0, previous : -1
		System.out.println(i.next()); // next: 1, previous : 0
		System.out.println(i.nextIndex());
		System.out.println(i.next()); // next: 2, previous : 1
		System.out.println(i.next()); // next: 3, previous : 2
		System.out.println(i.previousIndex());
		System.out.println(i.nextIndex());
		System.out.println(i.previous()); // next: 2, previous : 1
		System.out.println(i.previousIndex());
		System.out.println(i.previous()); // next: 1, previous : 0
		System.out.println(i.previous()); // next: 0, previous : -1  �� ó�� ����
		System.out.println(i.previous()); // NoSuchElementException 
		System.out.println(i.hasPrevious()); // ������ ������ true, ������ false
		
	}
	
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
		//u.listMethod1();
		u.listMethod1_1();
	}
}
