package sist.com.study;
//객체 배열
//Tv tv1, tv2, tv3; -> Tv[] tvArr = new Tv[3];
//객체를 생성해서 배열의 각 요소에 저장
//tvArr[0] = new Tv();
//tvArr[1] = new Tv();
//tvArr[2] = new Tv();

//Tv[] tvArr = {new Tv(), new Tv(), new Tv() };

//Tv[] tvArr = new Tv[100];
//for(int i=0;i<tvArr.length;i++){
	//tvArr[i] = new Tv(); }


public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
	}//main 끝
}

//클래스의 또 다른 정의
//1.클래스 - 데이터와 함수의 결합

//1. 변수 : 하나의 데이터를 저장할 수 있는 공간
//2. 배열 : 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
//3. 구조체 : 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간
//4. 클래스 : 데이터와 함수의 결합(구조체 + 함수)

//2 클래스 - 사용자정의 타입(user-defined type)

