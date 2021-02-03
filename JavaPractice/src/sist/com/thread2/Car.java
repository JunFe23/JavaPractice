package sist.com.thread2;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<String> carList;
	
	public Car() { 
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*5)) {
		case 0:
			carName = "제네시스 g80";
			break;
		case 1:
			carName = "제네시스 g70";
			break;
		case 2:
			carName = "제네시스 g90";
			break;
		case 3:
			carName = "BMW5";
			break;
		case 4:
			carName = "BMW7";
			break;
		default:
			break;
		}
		return carName;
	}
	
	public synchronized String pop() { // 소비.
		String carName = null;
		if(carList.size()==0) {
			try {
				System.out.println("차가 없습니다. 기다려주세요.");
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} // catch
		} // if
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("손님이 "+carName+"차를 구매했습니다."+" cnt = " + carList.size());
		
		return carName;
	}
	
	public synchronized void push(String car) { // 생산.
		carList.add(car);
		System.out.println(car+" 차가 만들어졌습니다. cnt = "+carList.size());
		if((carList.size())==5){ // 5개가 만들어졌을 때, notify해줌. push는 멈추지 않고 계속됨.
			this.notify();
		}
	}
}
