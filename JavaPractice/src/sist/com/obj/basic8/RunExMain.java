package sist.com.obj.basic8;

public class RunExMain {
	private RunableEx run;
		
	public RunExMain(RunableEx run) { //�������� �������̽��� ����
		super();
		this.run = run;
	}
	
	
	public void action() {
		run.run();
	}
	
	public static void main(String[] args) {
		new RunExMain(new RunEx3()).action();
//		RunableEx r1 = new RunEx1();// RunEx1( (RunableEx  run() ���� ) run() O )
//		r1.run();
//		RunableEx r2 = new RunEx2();// RunEx2( (RunableEx  run() ���� ) run() O )
//		r2.run();
//		RunableEx r3 = new RunEx3();// RunEx3( (RunableEx  run() ���� ) run() O )
//		r3.run();
		
	}
}
