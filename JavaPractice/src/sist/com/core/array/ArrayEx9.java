package sist.com.core.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx9 {
	Scanner sc=new Scanner(System.in);
	int year, month;//instance
	
	int []lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
	String []weekArray= {"일","월","화","수","목","금","토","일"};
	
	public boolean yunDal(int year) {
		return year%4==0&&year%100!=0||year%400==0;
	}
	
	//20202.12
	public int getCount() {//총일
		int cnt=(year-1)*365;
		
		for (int i = 1; i < year; i++) {
			if(yunDal(i))cnt++;
		}
		if(yunDal(year))lastDay[1]++;
		for (int i = 0; i < month-1; i++) {
			cnt+=lastDay[i];
		}
		cnt++;//일
		
		return cnt;
	}
	public void injectWeek() {
		System.out.println("Year:");
		year=sc.nextInt();
		System.out.println("Month:");
		month=sc.nextInt();
		print();
	}
	
	public void print() {
		int week=getCount()%7;
		System.out.println(year+"년"+month+"월");
		for (int i = 0; i < weekArray.length; i++) {
			System.out.print(weekArray[i]+"\t");
		}
		System.out.println();
		for (int i = 1; i <= lastDay[month-1]; i++) {
			if(i==1) {
				for (int j = 0; j < week; j++) {
					System.out.print("\t");
				}//for
			}//if
			System.out.printf("%d\t", i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
			
		}//전체for
	}
	
	public static void main(String[] args) {
		ArrayEx9 a=new ArrayEx9();
		//a.injectWeek();
		a.injectWeek();
	}
}
