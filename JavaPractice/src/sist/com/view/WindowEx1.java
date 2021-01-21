package sist.com.view;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class WindowEx1 extends JFrame{ // JFrame : ������ ������ ����, Java���� ���̴� ��
	Object []gen = {"Program", "System", "Design"};
	String []lesson1 = {"Operator", "Control", "OOP", "Collection"};
	String []lesson2 = {"Dom", "Sox", "Dtd", "Xslt"};
	
	String[] off_Student = {"��ö", "����", "ȿ��"};
	String[] on_Student = {"����", "�¿�", "����", "����"};
	
	Vector<Vector> node1 = new Vector<Vector>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "Lesson";
		}		
	}; 
	
	Vector<String> node2 = new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			//return super.toString().concat("Java"); // ������ ���� ���� return�ϰ���� ��
			return "Java";
		}
	};
	Vector<String> node3 = new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "Xml";
		}
	};
	
	Vector<Vector> node4 = new Vector<Vector>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "�ֿ�";
		}		
	}; 
	Vector<String> node5= new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "��������";
		}
	};
	Vector<String> node6= new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "�¶���";
		}
	};
	
	public void injection(Vector<String> v, String []data) { // String �迭�� Vector�� ����
		for (int i = 0; i < data.length; i++) {
			v.add(data[i]);
		}
	}
	
	public void initTree() {
		node1.add(node2);
		node1.add(node3);
		injection(node2, lesson1);
		injection(node3, lesson2);
		gen[0]=node1;
		
		node4.add(node5);
		node4.add(node6);
		injection(node5, off_Student);
		injection(node6, on_Student);
		gen[1]=node4;
		
		JTree jTree = new JTree(gen);
		jTree.setRootVisible(true);
		JScrollPane js = new JScrollPane(jTree);
		this.add(js);
		
		
	}
			
	public WindowEx1() {
		initTree();
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ �޸𸮿��� �������� ������(����), �̰� ���ص� ������ ��ó�� �������� ��� hidden�Ǵ°�
	}
	
	public static void main(String[] args) {
		new WindowEx1();
	}

}
