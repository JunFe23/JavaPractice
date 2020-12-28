package sist.com.operator;

public class OperatorEx3 { //전위형과 후위형의 차이.
	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++; //i=6, j=5
		System.out.println("j=i++; 실행 후, i=" + i + "j=" + j);
		
		i=5;
		j=0;
		
		j = ++i;//i=6, j=6
		System.out.println("j=++i; 실행 후, i=" + i +"j=" + j);
	}
}
