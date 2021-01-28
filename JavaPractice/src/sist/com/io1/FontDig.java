package sist.com.io1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class FontDig extends Dialog implements ActionListener,ItemListener{

   IoEx7 i;
   JPanel []jp=new JPanel[7];
   TextField[]tf=new TextField[3];
   JLabel []jlabel=new JLabel[3];
   JList<String>[]jlist=new JList[3];
   String[]fontFace={"궁서체","굴림","휴먼매직체","돋움","바탕체"};
   String [][]sf={{"볼드1","이택릴1","기울림1"},
                {"볼드2","이택릴2","기울림2"},
                {"볼드3","이택릴3","기울림3"},
                {"볼드4","이택릴4","기울림4"},
                {"볼드5","이택릴5","기울림5"},
                };
   
   String []loc= {"West","Center","East"};
   String []size={"10","11","12","13","14","15","16","17","18","19","20","21","22","48","72"};
   String []lb= {"글꼴","스타일","크기"};
   JButton jbtnOk,jbtnCancle;
   JPanel southPan,jpCombo;
   String []comStr={"선택하세요","Abc","가나다"};
   JComboBox<String>jcom=new JComboBox<String>(comStr);
   JLabel blabel;
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      String style=tf[1].getText();
      if(jbtnOk==e.getSource()) {
      
         
         
         Font  font=new Font(tf[0].getText(),style.startsWith("볼")?Font.BOLD:Font.ITALIC ,Integer.parseInt(tf[2].getText().trim()));
         i.getJta().setFont(font);
      }
      
   }
   public void fontListItem(int x,int y,int index) {
      jp[x].add("North",jlabel[index]=new JLabel(lb[index]));
      jp[x].add("Center",tf[index]=new TextField());
      jp[y].add("North",jp[x]);
      jp[y].add(new JScrollPane(jlist[index]=new JList<String>(index==0?fontFace: index==1?sf[index-1]:size),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
      jlist[index].addMouseListener(new MouseAdapter() {

         @Override
         public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            switch (index) {
            case 0:
               tf[index].setText(fontFace[jlist[index].getSelectedIndex()]);
               jlist[index+1].setListData(sf[jlist[index].getSelectedIndex()]);
               tf[index+1].setText(sf[jlist[index].getSelectedIndex()][0]);
               break;
            case 1:
               System.out.println(jlist[index-1].getSelectedIndex());
               tf[index].setText(sf[jlist[index-1].getSelectedIndex()==-1?0:jlist[index-1].getSelectedIndex()][jlist[index].getSelectedIndex()]);
                break;
            case 2:
               tf[index].setText(size[jlist[index].getSelectedIndex()]);
            default:
               break;
            }
               
            
         }
         
      });
      jlist[index].setFixedCellWidth(100);      
      jp[jp.length-1].add(loc[index],jp[y]);      
      
   }
   
   @Override
   public void itemStateChanged(ItemEvent e) {
      // TODO Auto-generated method stub
      if( comStr[ jcom.getSelectedIndex()].trim().equals("Abc")) {
          blabel.setText("Test");
      }else if (comStr[ jcom.getSelectedIndex()].trim().equals("가나다")){
          blabel.setText("테스트");
      }else {
          blabel.setText("선택하세요");
      }
   }
   public void initDialog() {
      for (int i = 0; i < jp.length; i++) {
         jp[i]=new JPanel(new BorderLayout());
      }      
      fontListItem(0,1,0);
      fontListItem(2,3,1);
      fontListItem(4,5,2);
      
      
       this.add("North",jp[jp.length-1]);
       JPanel panel=new JPanel();
       panel.add(blabel=new JLabel("Test"));
       panel.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"보기"));
       panel.setPreferredSize(new Dimension(200,100));
       jpCombo=new JPanel(new BorderLayout());
       jpCombo.add("North",panel);
       jcom.addItemListener(this);
       jpCombo.add("South",jcom);
       
       this.add("East",jpCombo);
       southPan=new JPanel(new FlowLayout(FlowLayout.RIGHT));
       southPan.add(jbtnOk=new JButton("확인"));
       jbtnOk.addActionListener(this);
       southPan.add(jbtnCancle=new JButton("취소"));
       jbtnCancle.addActionListener(this);
       
       this.add("South",southPan);
       
       
       
       this.addWindowListener(new WindowAdapter() {

         @Override
         public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            FontDig.this.dispose();
         }
          
          
      });
      this.setBounds(100, 100, 500, 500);;
      this.setVisible(true);
      
   }
   public FontDig(IoEx7 i) {
      super(i);
      this.i=i;
      initDialog();
   }
   

}






