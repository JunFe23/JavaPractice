package sist.com.obj.basic5;

public class StringEx {
   private char []value;

   
   public StringEx() {
      super();
   }


   public StringEx(char[] value) {
      super();
      this.value = value;
   }

   public boolean equals(Object obj) {
      if(obj instanceof String) {//String���̸�
         char[] temp=((String)obj).toCharArray();
         if(value.length!=temp.length) {//���ڿ��� ���̰� ������ Ȯ��
            return false;
         }
         for (int i = 0; i < temp.length; i++) {//���ڿ��� ���̰� ������ ���ڿ��� ���� Ȯ��
            if(value[i]!=temp[i])return false;
         }
         return true;//���ڿ� ���� ���� ��� ������ true
      }
      return false; //String���� �ƴϸ�  false
   }
   
   public static void main(String[] args) {
      StringEx str=new StringEx("abc".toCharArray());//value[a][b][c]
      
      System.out.println(str.equals("abc"));
   }
   
   

}













