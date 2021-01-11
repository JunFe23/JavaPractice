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
      if(obj instanceof String) {//String형이면
         char[] temp=((String)obj).toCharArray();
         if(value.length!=temp.length) {//문자열의 길이가 같은지 확인
            return false;
         }
         for (int i = 0; i < temp.length; i++) {//문자열의 길이가 같으면 문자열의 내용 확인
            if(value[i]!=temp[i])return false;
         }
         return true;//문자열 길이 내용 모두 같으면 true
      }
      return false; //String형이 아니면  false
   }
   
   public static void main(String[] args) {
      StringEx str=new StringEx("abc".toCharArray());//value[a][b][c]
      
      System.out.println(str.equals("abc"));
   }
   
   

}













