package sist.com.io1;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FontDig_1 extends Dialog implements ActionListener{
   IoEx7 i;
   JPanel []jp = new JPanel[7];
   TextField[]tf = new TextField[3];
   JLabel []jlabel = new JLabel[3];
   JList<String>[]jlist = new JList[3];
   String []fontFace = {"궁서체","굴림","휴먼매직체","돋움","바탕체"}; 
   String [][]sf = {{"볼드1","이탤릴1","기울임1"},
		   			{"볼드2","이탤릴2","기울임2"},
		   			{"볼드3","이탤릴3","기울임3"},
		   			{"볼드4","이탤릴4","기울임4"},
		   			{"볼드5","이탤릴5","기울임5"}};
   
   String []loc = {"West", "East", "Center"};
   String []size = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
   String []lb = {"글꼴", "스타일", "크기"};
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub   
      
   }
   
   public void fontListItem(int x, int y, int index) {
//	   jp[0].add("North",jlabel[0]=new JLabel("글꼴"));
//	      jp[0].add("Center",tf[0]=new TextField());
//	      jp[1].add("North",jp[0]);
//	      jp[1].add(new JScrollPane(jlist[0]=new JList<String>(fontFace),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
//	      jlist[0].setFixedCellWidth(100);     
//	      jp[jp.length-1].add("West",jp[1]);

	   	  jp[x].add("North",jlabel[index]=new JLabel(lb[index]));
	   	  jp[x].add("Center",tf[index]=new TextField());
	      jp[y].add("North",jp[x]);
	      jp[y].add(new JScrollPane(jlist[index]=new JList<String>(index==0?fontFace: index==1? sf[index-1]:size),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
	      jlist[index].setFixedCellWidth(100);
	      jp[jp.length-1].add(loc[index],jp[y]);

   }
   
   public void initDialog() {
      for (int i = 0; i < jp.length; i++) {
         jp[i]=new JPanel(new BorderLayout());
      }
      
      fontListItem(0, 1, 0);
      fontListItem(2, 3, 1);
      fontListItem(4, 5, 2);
      
      
      this.add("North",jp[jp.length-1]);
      this.setBounds(100, 100, 500, 500);;
      this.setVisible(true);
      
   }
   public FontDig_1(IoEx7 i) {
      super(i);
      this.i=i;
      initDialog();
   }
   
   

}






