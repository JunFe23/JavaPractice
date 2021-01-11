package sist.com.obj.basic1;
//성적처리
//번호 이름 국어 영어 수학 총점 평균 등수 학점

import java.util.Scanner;

public class 성적메인 {
	Scanner sc=new Scanner(System.in);
	static 정보[] informations=new 정보[5];
	int cnt;
	
	
	public boolean isFull() {
		return cnt==informations.length-1;
	}
	
	public boolean isEmpty() {
		return cnt==0;
	}
	
		
	public void addInfo() {
		/*private int num=1;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private int avg;
		private int no;
		private String grade;*/
		
		
		정보 info=new 정보();
		int num;
		do {
			System.out.println("Num : ");
			num=sc.nextInt();
		}while(uniqueNumber(num));
		info.setNum(num);
		System.out.println("name : ");
		info.setName(sc.next());
		System.out.println("korScore : ");
		info.setKor(sc.nextInt());
		System.out.println("engScore : ");
		info.setEng(sc.nextInt());
		System.out.println("mathScore : ");
		info.setMath(sc.nextInt());
		int total=info.getKor()+info.getEng()+info.getMath();
		info.setTotal(total);
		double avg=total/3;
		info.setAvg(avg);
		
		/*switch((int)avg/10) {
			case 10: case 9:
				grade="A";
				info.setGrade(grade);
				break;
			case 8:
				grade="B";
				info.setGrade(grade);
				break;
			case 7:
				grade="C";
				info.setGrade(grade);
				break;
			case 6:
				grade="D";
				info.setGrade(grade);
				break;
			default:
				grade="F";
				info.setGrade(grade);
				break;
		}*/
		if(isFull()) increment();
		informations[cnt++]=info;
		rankCal();
	}
	
	 public boolean uniqueNumber(int no) {
	      for (int i = 0; i < cnt; i++) {
	           if(informations[i].getNum()==no)return true;  
	      
	       }
	      return false;
	   }
	
	public void increment() {	
		정보[] imsi=new 정보[informations.length*2];
		System.arraycopy(informations, 0, imsi, 0, informations.length);
		informations=imsi;
	}
	
	public void list() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(informations[i]);
		}
	}
	
	public int search(int number) {
		for (int i = 0; i < cnt; i++) {
			if(informations[i].getNum()==number) return i;
		}
		return -1;
	}
	
	public 정보 getInformation(int number) {
		return informations[number];
	}
	
	public void infoInformation() {
		System.out.println("번호");
		int index=search(sc.nextInt());
		System.out.println(index==-1?"No Such a Data":getInformation(index));
	}
	
	public void rankCal() {
		int []rArray=new int[cnt];
		for (int i = 0; i < cnt; i++) {
			rArray[i]=1;	
			for (int j = 0; j < rArray.length; j++) {
				if(informations[i].getTotal()<informations[j].getTotal()) {
					rArray[i]++;
					
				}
			} 
			informations[i].setRank(rArray[i]);
		}
	}
	
	public void swap(정보[] informations, int index, int target) {
		정보 tmp = informations[index];
		informations[index] = informations[target];
		informations[target] = tmp;
	}
	
	public void rankList() {
		System.out.println("성적순정렬 1.오른차순 2.내림차순");
		int ascending = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(ascending==1) {
					if(informations[i].getRank()>informations[j].getRank())
						swap(informations,i,j);
				}else{
					if(informations[i].getRank()<informations[j].getRank())
						swap(informations, i, j);
						
				}
			}
		}
	}
	
	
	
	public void modify() {
		System.out.println("수정할 성적번호 : ");
		int index=search(sc.nextInt());
		if(index==-1) {
			System.out.println("No Such a Data");
			return;
		}
		정보 정보=getInformation(index);
		System.out.println("ModifyName : ");
		정보.setName(sc.next());
		System.out.println("ModifyKor : ");
		정보.setKor(sc.nextInt());
		System.out.println("ModifyEng : ");
		정보.setEng(sc.nextInt());
		System.out.println("ModifyMath : ");
		정보.setMath(sc.nextInt());
		int total=정보.getMath()+정보.getEng()+정보.getMath();
		정보.setTotal(total);
		double avg=total/3;
		정보.setAvg(avg);
		rankCal();
		System.out.println("Modification Complete");
	}
	
	public void delete() {
		System.out.println("삭제할 성적의 번호 : ");
		int index=search(sc.nextInt());
		if(index==-1) {
			System.out.println("No Such a Data");
			return;
		}
		for (int i = index; i < cnt; i++) {
			if(i==cnt-1) {
				informations[i]=null;
				break;
			}
			informations[i]=informations[i+1];
		}
		cnt--;
	}
	
	public void menu() {
		while(true) {
		System.out.println("1.성적등록 2.전체조회 3.번호로 조회 4.순위조회 5.수정 6.삭제");
			switch (sc.nextInt()) {
			case 1:
				addInfo();
				break;
			case 2:
				list();
				break;
			case 3:
				infoInformation();
				break;
			case 4:
				rankList();
				list();
				break;
			case 5:
				modify();
				break;
			case 6:
				delete();
				break;		
			}
		}
	}
	
	public static void main(String[] args) {
		성적메인 m=new 성적메인();
		
		m.menu();
		
	}
}
