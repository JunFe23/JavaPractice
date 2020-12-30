package sist.com.core.array;

public class ArrayEx8 {
	public void method(){      
	      int a=0;//[  0  ]
	      short []s=new short[10];
	      int []i=new int[10];//[0][0][0][0][0][0][0][0][0][0]
	      
	              /*new Member().age=25; //name,id,email,tel,age(25)
	              System.out.println(new Member().age );//name,id,email,tel,age(0)
	*/              
	      Member m=new Member();//name,id,email,tel,age
	      m.age=25;
	      System.out.println(m.age);
	   }
	public int [][] method2(int[] x){
		return new int[][] {x, new int[5]};
	}
	public int[] method3(int [][]x) {//[10][20][30][40]
									 //[50][60][70][80]
		int []imsi=x[0];
		x[0]=x[1];
		x[1]=imsi; //->0행과 1행의 위치 바뀜.
		return new int[] {(x[0][0]+x[1][0]+x[1][1]),x[1][0]};
	}
	
	public static void main(String[] args) {
		ArrayEx8 a=new ArrayEx8();
		int []x= {10,20,30};
		a.method2(x)[0][0]=50;
		System.out.println(x[0]);
		System.out.println(a.method3(new int[][] {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140}})[0]*2);
	}
}
