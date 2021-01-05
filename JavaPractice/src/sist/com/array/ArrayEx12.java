package sist.com.array;



public class ArrayEx12 { 
   int []m=new int [ArrayEx12.LEN];//[99][9][76][67][91] 76?
   int cnt;            //[99][9][76][67][91][][][][][][][]
   final static int LEN=5;
   public boolean isFull() {
      return cnt>= m.length;
   }
   public boolean isEmpty() {
      return cnt==0;
   }
   public void clear() {
      if(isEmpty())return;
      for (int i = 0; i < m.length; i++) {
         m[i]=0;
      }
      cnt=0;
      //m=new int[ArrayEx11.LEN];
   }
   public void increment() {          //[][][][][]
      int []imsi=new int[m.length*2];//[][][][][][][][][][]
      System.arraycopy(m, 0, imsi, 0, m.length);//배열복사 
      m=imsi;
   }
   public void add(int fData) {
      if(isFull()) {
         increment();      
      }
      m[cnt++]=fData;
      
      //disp();
   }public void add(int fData,int sData) {
      add(fData);
      add(sData);      
   }
   public void disp() {
      if(cnt==0) {
         System.out.println("NoDataList");
         return;
      }
      for(int i=0;i<cnt;i++) {
         System.out.printf("%5d",m[i]);
      }
      System.out.println();
      //System.out.println(Arrays.toString(m));
   }
   public int search(int data) {
      for(int i=0;i<m.length;i++) {
           if(m[i]==data) {
            return i;
           }
         }
         return -1;
   }
   public int search(int data,int fromIndex) {
      for(int i=fromIndex;i<m.length;i++) {
        if(m[i]==data) {
         return i;
        }
      }
      return -1;
   }
   public void delete(int data,char state) {
      int index=search(data);
      if(index==-1)return;
      deleteOrigin(index);   
      if(state=='a')delete(data, state);
   }
   public void deleteOrigin(int index) {
      for (int i = index; i < m.length; i++) {
         if(i==m.length-1) {
            m[i]=0;
            break;
         }
           m[i]=m[i+1];
      }   
   }
   public void delete(int data,int fromIndex) {
      int index=search(data,fromIndex);
      if(index==-1)return;
      deleteOrigin(index);
   }
   public static void main(String[] args) {
      ArrayEx12 a=new ArrayEx12();
      a.add(10,20);//[10][20][30][40][50]
      a.add(30);   //[10][20][40][50][0]
      a.add(40,30);
      a.disp();
      a.delete(30,'a');
      a.disp();

      
      
      
      
   }

}