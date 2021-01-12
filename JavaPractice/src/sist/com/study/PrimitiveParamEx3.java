package sist.com.study;

import java.util.Iterator;

//기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.(read only)
//참조형 매겨변수 : 변수의 값을 읽고 변경할 수 있다.(read & write)

public class PrimitiveParamEx3 {
	public static void main(String[] args) {
		 int[] arr=new int [] {3,2,1,6,5,4};
		 
		 printArr(arr);
		 sortArr(arr);
		 printArr(arr);
		 System.out.println("sum = " + sumArr(arr));
	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length-1; i++)  
			for (int j = 0; j < arr.length-1-i; j++)   
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				
				}
	} //sortArr(int[] arr)
		
}

//"반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다."

