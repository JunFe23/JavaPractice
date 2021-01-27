package sist.com.io1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class IoEx7 extends JFrame implements ActionListener{
   JMenuBar jmb;
   JMenu file,edit,source;
   JMenuItem newItem,openItem,closeItem,saveItem,exitItem;
   JMenuItem fontItem, colorItem;
   String []path={"e:\\img\\new.gif","e:\\img\\save.gif","e:\\img\\close.gif"};
   ImageIcon []icon=new ImageIcon[path.length];
   JTextArea jta;
   JScrollPane jsp;
   JFileChooser fileCh=new JFileChooser();
   
   
   public JTextArea getJta() {
	   return jta;
   }
   public void setJta(JTextArea jta) {
	   this.jta = jta;
   }
   
   
@Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      Object obj=e.getSource();
      String command = e.getActionCommand(); // menuitem의 string값 반
      if(obj==newItem) {
         new IoEx7();
      }
      if(obj==exitItem) {
         //System.exit(0);
         this.dispose();
      }
      if(obj==saveItem) {
    	  save();
      }
      if(command.equals("open")){
      //if(obj==openItem) {
    	  System.out.println(command);
    	  int state = fileCh.showOpenDialog(this);
    	  if(state==JFileChooser.APPROVE_OPTION) {
    		  open();
    	  }
      }
      
      if(obj==colorItem) {
    	 Color color = JColorChooser.showDialog(this, "", Color.white);
    	 jta.setBackground(color); // 배경 색 변환.
      }
      if(obj==fontItem) {
    	  new FontDig(this);
      }
      
      
   }
   public void iconInit() {
      for (int i = 0; i < icon.length; i++) {
         icon[i]=new ImageIcon(path[i]);
      }
   }
   public void initMenu() {
      iconInit();
      jmb=new JMenuBar();
      file=new JMenu("File");
      
      file.add(newItem=new JMenuItem("new",icon[0]));
      newItem.addActionListener(this);
      file.addSeparator();
      file.add(openItem=new JMenuItem("open",icon[1]));
      openItem.addActionListener(this);
      file.addSeparator();
      file.add(closeItem=new JMenuItem("close",icon[2]));
      closeItem.addActionListener(this);
      file.addSeparator();
      file.add(saveItem=new JMenuItem("save"));
      saveItem.addActionListener(this);
      file.addSeparator();
      file.add(exitItem=new JMenuItem("exit"));
      exitItem.addActionListener(this);
      
      
      edit=new JMenu("Edit");
      
      
      source=new JMenu("Source");
      fontItem = new JMenuItem("Font");
      colorItem = new JMenuItem("Color");
      source.add(fontItem);
      fontItem.addActionListener(this);
      source.addSeparator();
      source.add(colorItem);
      colorItem.addActionListener(this);
      jmb.add(file);
      jmb.add(edit);
      jmb.add(source);
      this.setJMenuBar(jmb);
      
      
   }
   
   public void open() {
	   BufferedReader br = null;
	   try {
		   br = new BufferedReader(new FileReader(fileCh.getSelectedFile()));
		   String temp = "";
		   while((temp=br.readLine())!=null) {
			   jta.append(temp);
			   jta.append("\r\n");
		   }
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} finally {
		try {
			if(br!=null)br.close();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
   }
   
   public void save() {
       BufferedWriter bw=null;
       fileCh.showSaveDialog(this);
       try {
          bw=new BufferedWriter(new FileWriter(fileCh.getSelectedFile()));
          bw.write(jta.getText());
          bw.flush();
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      dispose();
   }
   public IoEx7() {
      super("메모장");
      initMenu();
      
      this.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            if(jta.getText().length()!=0) {               
               switch (JOptionPane.showConfirmDialog(IoEx7.this,"저장원해??")) {
               case JOptionPane.YES_OPTION:
                    int rs=fileCh.showSaveDialog(IoEx7.this);
                    if(rs==JFileChooser.APPROVE_OPTION) {
                       save();
                    }
                  break;
               case JOptionPane.NO_OPTION:
                  dispose();
               default:
                  break;
               }
               
            }else {
               System.exit(0);
            }
         }
         
      });
      this.add(jsp=new JScrollPane(jta=new JTextArea(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
      
      this.setBounds(100, 100, 500, 500);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   }
   public static void main(String[] args) {
      IoEx7 i=new IoEx7();
   }

}







