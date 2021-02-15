package sist.com.thread2;
// 데몬쓰레드[보조쓰레드] 화면자동갱신, 자동저장;

// 데몬쓰레드는 메인쓰레드가 종료되면 자동종료
// 일반쓰레드가 모두 종료되고 나면 보조역할의 의미가 없으므로 자동 종료된다.
public class ThreadEx3 implements Runnable{
	static boolean state = false;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(3000);
				if(state) {
					autoProcess();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void autoProcess() {
		System.out.println("AutoSave");
	}
	public void process() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+"초");
				if(i==5) {
					state=true;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx3 t = new ThreadEx3();
		Thread thread = new Thread(t);
		thread.setDaemon(false);
		thread.start();
		t.process();
		System.out.println("System End");
	}
}
