package sist.com.obj.basic1;
//����ó��
//��ȣ �̸� ���� ���� ���� ���� ��� ��� ����

import java.util.Scanner;

public class �������� {
	Scanner sc=new Scanner(System.in);
	static ����[] informations=new ����[5];
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
		
		
		���� info=new ����();
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
		����[] imsi=new ����[informations.length*2];
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
	
	public ���� getInformation(int number) {
		return informations[number];
	}
	
	public void infoInformation() {
		System.out.println("��ȣ");
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
	
	public void swap(����[] informations, int index, int target) {
		���� tmp = informations[index];
		informations[index] = informations[target];
		informations[target] = tmp;
	}
	
	public void rankList() {
		System.out.println("���������� 1.�������� 2.��������");
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
		System.out.println("������ ������ȣ : ");
		int index=search(sc.nextInt());
		if(index==-1) {
			System.out.println("No Such a Data");
			return;
		}
		���� ����=getInformation(index);
		System.out.println("ModifyName : ");
		����.setName(sc.next());
		System.out.println("ModifyKor : ");
		����.setKor(sc.nextInt());
		System.out.println("ModifyEng : ");
		����.setEng(sc.nextInt());
		System.out.println("ModifyMath : ");
		����.setMath(sc.nextInt());
		int total=����.getMath()+����.getEng()+����.getMath();
		����.setTotal(total);
		double avg=total/3;
		����.setAvg(avg);
		rankCal();
		System.out.println("Modification Complete");
	}
	
	public void delete() {
		System.out.println("������ ������ ��ȣ : ");
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
		System.out.println("1.������� 2.��ü��ȸ 3.��ȣ�� ��ȸ 4.������ȸ 5.���� 6.����");
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
		�������� m=new ��������();
		
		m.menu();
		
	}
}
