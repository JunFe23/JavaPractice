package sist.com.io1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IoEx7 extends JFrame implements ActionListener {
	JMenuBar jmb;
	JMenu file, edit, source;
	JMenuItem newItem, openItem, closeItem, saveItem, exitItem, cut, copy, delete;
	String []path = {"e:\\icon\\new.gif","e:\\icon\\open.gif","e:\\icon\\close.gif","e:\\icon\\save.gif","e:\\icon\\exit.gif"};
	ImageIcon []icon = new ImageIcon[5];
	JTextArea jta;
	JScrollPane jsp;
	JFileChooser fileCh=new JFileChooser();
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==newItem) {
			new IoEx7();
		}
		if(obj==exitItem) {
			// System.exit(0); // 창이 다 꺼짐
			this.dispose();
//			this.actionlistener
		}
	}

	public void iconInit() {
		for (int i = 0; i < icon.length; i++) {
			icon[i] = new ImageIcon(path[i]);
		}
	}
	
	public void initMenu() {
		iconInit();
		jmb = new JMenuBar();
		file = new JMenu("File"); // 메뉴바에 File이라는 메뉴 만들음
		
		file.add(newItem = new JMenuItem("new", icon[0]));
		newItem.addActionListener(this);
		file.addSeparator(); // 위, 아래 칸 나누어줌.
		file.add(openItem = new JMenuItem("open", icon[1]));
		openItem.addActionListener(this);
		file.addSeparator();
		file.add(closeItem = new JMenuItem("close", icon[2]));
		closeItem.addActionListener(this);
		file.addSeparator();
		file.add(saveItem = new JMenuItem("save", icon[3]));
		saveItem.addActionListener(this);
		file.addSeparator();
		file.add(exitItem = new JMenuItem("exit", icon[4]));
		exitItem.addActionListener(this);
				
		edit = new JMenu("Edit");
		
		edit.add(cut = new JMenuItem("cut"));
		edit.addSeparator();
		edit.add(copy = new JMenuItem("copy"));
		edit.addSeparator();
		edit.add(delete = new JMenuItem("delete"));
		
		source = new JMenu("Source");
		
		
		
		jmb.add(file);
		jmb.add(edit);
		jmb.add(source);
		this.setJMenuBar(jmb);
		
	}
	
	public void save() {
		
	}
	
	public IoEx7() {
		super("메모장"); // 창 위에 이름 표시
		initMenu();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				if(jta.getText().length()!=0) {
					//JOptionPane.showMessageDialog(IoEx7.this, "종료할거야?"); // 글이 없으면 바로 꺼지고, 있으면 대화상자 나옴.
					int rs = JOptionPane.showConfirmDialog(IoEx7.this, "저장?");
					if(rs==0) { // 예
						fileCh.showSaveDialog(IoEx7.this);
						save();
						System.exit(0);
					} else if(rs==1) { // 아니오
						System.exit(0);
					} else { // 취소
						
					};
				} else {
					System.exit(0);
				}
			}
			
		});
		this.add(jsp=new JScrollPane(jta=new JTextArea(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // x 를 눌러도 종료되지 않음
	}
	public static void main(String[] args) {
		IoEx7 i = new IoEx7();
	}
}
