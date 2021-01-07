package sist.com.obj.basic2;

public class Super extends Object {
   private int superValue;
   public Super() {
      super();
   }
   public Super(int superValue) {
      super();
      System.out.println("Super()");
   }
   public void superMethod() {
      System.out.println(this.hashCode());
      System.out.println("superMethod");
   }

}