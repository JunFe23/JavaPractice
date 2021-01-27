package sist.com.io1;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FontFrameP extends JFrame{
	JPanel []jp = new JPanel[8];
	JList<Object>list;
	private Label font, size, effect, disp;
	
	TextField tf;
	String []i= {"굴림", "신명조", "돋움체"};
	Integer[]j= {10,11,12,13,14,15,16,17,18,19,20};
	String []k= {"보통", "굵게", "기울임", "밑줄"};
	public void inintFrame1(){
	
		
		for(int i = 0; i<4;i++) {
			jp[i] = new JPanel(i!=3?new BorderLayout(): new FlowLayout());
		}
		for(int i = 4; i<8; i++) {
			jp[i] = new JPanel(i==4&&i==5?new BorderLayout():i==6?new GridLayout(1,2): new GridLayout(2,1));
		}
		jp[3].add(jp[0]);
		jp[3].add(jp[1]);
		jp[3].add(jp[2]);
		
		jp[6].add(jp[5]);
		jp[6].add(jp[4]);
		
		
		list=new JList<Object>(i);
		list.setFixedCellWidth(100);
		jp[0].add("North",font = new Label("Font"));
		jp[0].add(tf=new TextField());
		jp[0].add("South",new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ));
        
		list=new JList<Object>(j);
		list.setFixedCellWidth(100);
		jp[1].add("North", size = new Label("Size"));
		jp[1].add(tf=new TextField());
		jp[1].add("South",new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ));
		
		list=new JList<Object>(k);
		list.setFixedCellWidth(100);
		jp[2].add("North",effect = new Label("Effect"));
		jp[2].add(tf=new TextField());
		jp[2].add("South", new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ));
		
		jp[4].add("North", disp = new Label("Display"));
		jp[4].add(tf= new TextField());
  
  
		
		jp[7].add("North",jp[3]);
		jp[7].add("South",jp[5]);
		
		this.add(jp[7]);
		this.setBounds(100, 100, 300, 300);
	}
   public FontFrameP() {
      inintFrame1();
      list.addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println(i[list.getSelectedIndex()]);
            tf.setText(String.valueOf(i[list.getSelectedIndex()]));
         }
         
         
      });
      this.setBounds(100, 100, 500, 500);
      this.setVisible(true);
   }   
   public static void main(String[] args) {
      FontFrameP f=new FontFrameP();
      
      
   }
   

}