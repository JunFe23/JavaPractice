package sist.com.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowEx5P extends JFrame implements ActionListener{
	private Label ip, id;
	private TextField tf;
	private JButton jbtn;
	private JTextArea jTextArea;
	private JPanel jp1,jp2;
	private Font font = new Font("굴림", Font.BOLD, 15);
	
	public void initFrame() {
		jp1 = new JPanel(new BorderLayout());
		jp1.setFont(font); // 폰트 들어옴.
		jp1.add("East", ip = new Label("777.77.77.77"));
		jp1.add("West", id = new Label("살려주세요"));
		jp2=new JPanel();
		jp2.add(tf=new TextField(50));
		tf.addActionListener(this);
		jp2.add(jbtn=new JButton("Exit"));
		
		this.add("North",jp1);
		// 옆쪽 스크롤바는 항상 보이고, 아래쪽 스크롤바는 필요할 때 보여짐.
		this.add(new JScrollPane(jTextArea=new JTextArea(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		jTextArea.setEditable(false);
		this.add("South",jp2);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) {
			if(tf.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "글자입력");
				return;
			}
			jTextArea.append(tf.getText()+"\n");
			tf.setText("");
	}
	}



	public WindowEx5P() {
		initFrame();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				tf.requestFocus();
			}
			
			
		});
		this.add(new JScrollPane());
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new WindowEx5P();
	}
}
