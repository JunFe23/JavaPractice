package sist.com.view;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class WindowEx1P extends JFrame {
	Object []gen = {"", "", ""};
	String []eastTeam = {"필라델피아", "밀워키", "보스턴", "인디애나", "브루클린", "클리블랜드", "애틀랜타", "뉴욕", "올랜도", "마이매미", "샬럿", "시카고", "토론토", "워싱턴", "디트로이트"};
	String []westTeam = {"LAC", "LAL", "유타", "피닉스", "골든스테이트", "포틀랜드", "멤피스", "샌안토니오", "댈러스", "덴버", "오클라호마 시티", "뉴올리언스", "새크라멘토", "휴스턴", "미네소타"};
	
	Vector<Vector> node1 = new Vector<Vector>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "NBA";
		}		
	};
	
	Vector<String> node1_1 = new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "East Conference";
		}		
	};
	Vector<String> node1_2 = new Vector<String>() {
		@Override
		public synchronized String toString() {
			// TODO Auto-generated method stub
			return "West Conference";
		}		
	};
	
	public void injection(Vector<String> v, String []data) {
		for (int i = 0; i < data.length; i++) {
			v.add(data[i]);
		} 
	}
	
	public void initTree() {
		node1.add(node1_1);
		node1.add(node1_2);
		injection(node1_1, eastTeam);
		injection(node1_2, westTeam);
		gen[0] = node1;
		
	
		JTree jTree = new JTree(gen);
		jTree.setRootVisible(true);
		JScrollPane js = new JScrollPane(jTree);
		this.add(js);
		
	}
	
	public WindowEx1P() {
		initTree();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new WindowEx1P();
	}

}
