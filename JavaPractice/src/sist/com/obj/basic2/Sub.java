package sist.com.obj.basic2;

public class Sub  extends Super {
   private int subValue;
   
   public Sub() {
      super();
   }
   public Sub(int superValue,int subValue) {
   
	   super(superValue);
      System.out.println("Sub()");
   }
   public void subMetod() {
      System.out.println(this.hashCode());
      System.out.println("subMetod");
   }
      
}