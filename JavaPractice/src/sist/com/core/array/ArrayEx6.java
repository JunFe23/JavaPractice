package sist.com.core.array;

import java.util.Arrays;

public class ArrayEx6 { //2차원 배열 추가, 수정, 삭제.
   int [][]m=new int[2][5];
   int row=0,col=0;
   public void increment() {
      int [][]imsi=new int[m.length*2][m[0].length];
      for (int i = 0; i < m.length; i++) {
         System.arraycopy(m[i], 0, imsi[i], 0, m[i].length);
      }
      m=imsi;
   }
   public void add(int data) {
      //if(행의 끝이고 열의끝이면 )
      if(row>=m.length-1 && col>=m[0].length-1) {
        increment();   
      }      
      m[row][col++]=data;
      //if(콜변수가 열의끝이면 )
      if(col>m[row].length-1) {
         col=0;
         row++;
      }
   }
   public void disp() {
      for (int i = 0; i < m.length; i++) {
         System.out.println(Arrays.toString(m[i]));
      }
      
      System.out.println();
   }

   public int[] search(int data) {
	      for (int i = 0; i < m.length; i++) {//행
	         for (int j = 0; j < m[i].length; j++) {//열
	            if(m[i][j]==data)
	               return new int[] {i,j};
	            
	         }//for
	      }//for
	      return null;
	   }
   
   public void modify(int origin,int change,char state) {
	   int []rs = search(origin); //origin값을 찾음 
	   if(rs==null) return; //rs가 null값이면 반환 
	   m[rs[0]][rs[1]]=change; //origin 값에서 받은 배열로 적절한 m값 찾아서 change 대입!
	   if(state=='a') //state가 'a'면 반복해서 중복된 origin을 모두 modify함.
		   modify(origin, change, state);
   }
   
   public void deleteOrigin(int []rs) {
	   for (int i = rs[0]; i < m.length; i++) {
		   for (int j = rs[1]; j < m[i].length; j++) {
			   if(j==m[i].length-1) { //열인덱스가 행의 끝인가?
				   m[i][j]=(i==m.length-1)?0:m[i+1][0]; //다음행의 첫열의 값.
				   rs[1]=0;
			   }else{ //행의 끝도 아니고 열의 끝도 아닐 
				   m[i][j]=m[i][j+1];
			   }
		   }
	   }   
   }
   
   
   
   public void delete(int data, char state) {
	   int []rs=search(data);
	   if(rs==null)return;
	   deleteOrigin(rs);
	   if(state=='a')delete(data, state);
   }
   
   /*public void delete(int data, int fromIndex) {
	   int []rs=search(data, fromIndex);
	   if(rs==null)return;
	   deleteOrigin(rs);
   }*/
	   
   public static void main(String[] args) {
	   ArrayEx6 a=new ArrayEx6();      
	   for (int i = 0; i < 10; i++) {
		   a.add((i+1)*10);
	   }
	   a.disp();
	   //int []rs=a.search(200);
	   //System.out.println(rs!=null?Arrays.toString(rs):"Not Element!");
	   //a.modify(20, 200, 'a');
	   //a.disp();
	   //a.delete(20);
	   a.disp();
	   }
}