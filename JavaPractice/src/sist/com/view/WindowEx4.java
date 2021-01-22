package sist.com.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class WindowEx4 extends JFrame {
        Pan pan=new Pan();
        int x=-100,y=-100;
        Point []m_point=new Point[100];
        int cnt;
        int turn=-1;
   public WindowEx4() {
      //this.setUndecorated(true);
      this.add(pan);
      /*System.out.println(this.getBackground());
      System.out.println(this.getLayout());*/
      this.getContentPane().setBackground(Color.RED);
      this.setBounds(0, 0, 1980, 1080);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
   }
   public class Pan extends Canvas {
      public Pan() {
         Font font=new Font("±¼¸²",Font.BOLD, 30);
         this.setFont(font);
         this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
               // TODO Auto-generated method stub
               x=e.getX();
               y=e.getY();            
               m_point[cnt++]=e.getPoint();
               repaint();//update paint
               turn=turn*-1;
            }            
            
         });
         this.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
               // TODO Auto-generated method stub
               /*x=e.getX();
               y=e.getY();
               repaint();*/
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               // TODO Auto-generated method stub
               super.mouseMoved(e);
            }
            
         });
         this.setBackground(Color.YELLOW);
      }
      
      public void gamePan(Graphics g) {
         for (int i = 50; i < 980; i+=50) {
            for (int j = 50; j < 1880; j+=50) {
               g.drawRect(j, i, 50, 50);
            }
         }
         
      }
        int k;
      @Override
      public void paint(Graphics g) {
         // TODO Auto-generated method stub
         g.setColor(Color.black);
    	 if(k==0)
         gamePan(g);
         //k++;
         //g.drawString("Message x="+x+" y="+y, x, y);
         g.setColor(turn==-1?Color.black:Color.white);
         g.fillOval(x-25, y-25, 50, 50);
         
         
         
         /*if(cnt!=0&&cnt%3==0) {
            g.drawLine(m_point[cnt-3].x,m_point[cnt-3].y , m_point[cnt-2].x,m_point[cnt-2].y);
            g.drawLine(m_point[cnt-2].x,m_point[cnt-2].y , m_point[cnt-1].x,m_point[cnt-1].y);
            g.drawLine(m_point[cnt-1].x,m_point[cnt-1].y , m_point[cnt-3].x,m_point[cnt-3].y);
         }*/
         
         //g.drawOval(x, y, 50, 50);
         //g.drawRect(x, y, 50, 50);
         /*g.drawLine(100, 100, 300, 300);
         g.drawLine(300, 300, 400, 100);
         g.drawLine(400, 100, 100, 100);*/
      }

      @Override
      public void update(Graphics g) {
         // TODO Auto-generated method stub
         //super.update(g);
         paint(g);
      }   
      
      
   }
   public static void main(String[] args) {
      new WindowEx4();
   }

}





