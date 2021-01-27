package sist.com.io1;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class FontFrame extends JFrame{
   JList<Integer>list;
   TextField tf;
   Integer[]i= {10,11,12,13,14,15,16,17,18,19,20};
   public void inintFrame1(){
      list=new JList<Integer>(i);
      list.setFixedCellWidth(100);
      this.add("North",tf=new TextField());
      this.add(new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ));
         
   }
   public FontFrame() {
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
      FontFrame f=new FontFrame();
      
      
   }
   

}