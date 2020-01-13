package thread;

public class Synchronized extends Thread {
	

	private static int count;
	public static void main(String[] args) {
		Synchronized aa = new Synchronized();
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		aa.start();
		bb.start();
		cc.start();
	}
	//public synchronized void run() {//동기화 X
	public void run() {
		// synchronized(this){ //동기화 X ;같은 값인 경우에 동기화를 시켜주는 건데  this는 각자 다 달라서 동기화 불가.
		synchronized (Synchronized.class) { //동기화 O
			for (int i = 1; i <= 5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : " + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} // for
		}
	}
}
