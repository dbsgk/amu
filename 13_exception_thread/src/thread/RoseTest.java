package thread;

public class RoseTest extends Thread{ //스레드 상속
	private String name;
	public RoseTest(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+"\t"+Thread.currentThread()+"\t i="+i);//Thread.currentThread() : static 메소드. 
		}
		System.out.println(name+" 종료");
	}
	public static void main(String[] args) {
		RoseTest aa = new RoseTest("안락");//스레드 생성
		RoseTest bb = new RoseTest("행복");//스레드 생성
		RoseTest cc = new RoseTest("쾌락");//스레드 생성 ; 총 3개의 스레드 생성함.
		
		aa.setName("안락");
		bb.setName("행복");
		cc.setName("쾌락");
		
		//우선순위 1~10, default는 5 (제일 높은게 10)
//		aa.setPriority(10);
//		bb.setPriority(1);
//		cc.setPriority(1);
//		
		//스레드 start()메소드
		aa.start();//스레드 시작 - 스레드 실행(운영체제)
		try {
			aa.join(); //(스레드를 실행하고) 해당 스레드가 멈출때까지 기다린다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//끝날떄까지 대기한다.
		bb.start();
		cc.start();
		
		
		
	} 
}
