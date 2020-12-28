package sist.com.operator;

public class OperatorEx5 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);//+(-10)=-10
		
		i = -10;
		i = -i;
		System.out.println(i); //-(-10)=+10
	}
}
