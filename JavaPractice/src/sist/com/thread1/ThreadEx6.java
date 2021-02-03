package sist.com.thread1;

public class ThreadEx6{
   
    public void process() {      
       new Thread() {
         @Override
         public void run() {
            // TODO Auto-generated method stub
            System.out.println("run");
         }
          
       }.start();
    }   
   public static void main(String[] args) { 
      ThreadEx6 t=new ThreadEx6();
      System.out.println("MainBegin");
      t.process();
      System.out.println("MainEnd");
   }

}