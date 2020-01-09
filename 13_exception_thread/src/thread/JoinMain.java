package thread;
class JoinTest implements Runnable {
	//0.5초씩 마다 1,2,3,4,5 출력

	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
//-------------------
public class JoinMain {
	public static void main(String[] args) {
		//thread 생성, 시작
		JoinTest jt = new JoinTest();
		Thread a = new Thread(jt);
		System.out.println("스레드 시작");
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		//메인이 끝나도 스레드는 종료되지 않는다. 메인이 종료되어도 백그라운드에서 스레드는 돌아간다.
		
	}
}


