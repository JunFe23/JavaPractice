package sist.com.io2;

import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

public class LoginFrame extends JFrame implements ActionListener{
	JScrollPane jScrollPane;
	ImageIcon icon;
	TextField tfId;
	JPasswordField passwordField;
	JButton jButton;
	Label labelid, labelpassword;
	
	
	public void resetField() {
		JOptionPane.showMessageDialog(this, "ID 혹은 PASSWORD를 작성해주세요.");
		tfId.setText("");
		passwordField.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(jButton == e.getSource()) {
			String id = tfId.getText();
			String pass = String.valueOf(passwordField.getPassword());
			System.out.println(tfId.getText()+" "+String.valueOf(passwordField.getPassword()));
			if(id.length()==0||pass.length()==0) {
				resetField();
				return;
			}
			if(DaoProduct.idPassCheck(id, pass)) {
				new MemberList();
				this.dispose();
			} else {
				resetField();
			}
			
		}
	}

	public void backImage() {
		icon = new ImageIcon("/Users/junfe/Desktop/JunFe/a/a.jpeg");
		JPanel jPanel = new JPanel(null) {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			
		}; // JPanel anonymousclass
		
		labelid = new Label("ID");
		labelid.setBounds(125,185,250,15);
		tfId = new TextField(20);
		tfId.setBounds(125,200,250,30);
		labelpassword = new Label("PASSWORD");
		labelpassword.setBounds(125,235,250,18);
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 250, 250, 30);
		jButton = new JButton("Login");
		jButton.addActionListener(this);
		jButton.setBounds(125, 300, 250, 30);
		
		jPanel.add(labelid);
		jPanel.add(tfId);
		jPanel.add(labelpassword);
		jPanel.add(passwordField);
		jPanel.add(jButton);
		jScrollPane = new JScrollPane(jPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(jScrollPane);
	}
	
	public LoginFrame() {
		backImage();
		this.setBounds(100, 100, 500, 1000);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		LoginFrame login = new LoginFrame();
		
	}
}
