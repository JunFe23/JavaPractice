package sist.com.view;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class WindowEx1 extends JFrame{ // JFrame : 웹에선 쓰이지 않음, Java에서 쓰이는 것
	Object []gen = {"Program", "System", "Design"};
	String []lesson1 = {"Operator", "Control", "OOP", "Collection"};
	String []lesson2 = {"Dom", "Sox", "Dtd", "Xslt"};
	
	String[] off_Student = {"준철", "성빈", "효진"};
	String[] on_Student = {"성준", "승우", "지연", "수현"};
	
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
			//return super.toString().concat("Java"); // 선조랑 내꺼 같이 return하고싶을 때
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
			return "쌍용";
		}		
	}; 
	Vector<String> node5= new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "오프라인";
		}
	};
	Vector<String> node6= new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "온라인";
		}
	};
	
	public void injection(Vector<String> v, String []data) { // String 배열을 Vector에 주입
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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 메모리에서 프레임을 날려라(꺼라), 이거 안해도 꺼지는 것처럼 보이지만 사실 hidden되는것
	}
	
	public static void main(String[] args) {
		new WindowEx1();
	}

}
