package thread;
class JoinTest implements Runnable {
	//0.5�ʾ� ���� 1,2,3,4,5 ���

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
		//thread ����, ����
		JoinTest jt = new JoinTest();
		Thread a = new Thread(jt);
		System.out.println("������ ����");
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ ����");
		//������ ������ ������� ������� �ʴ´�. ������ ����Ǿ ��׶��忡�� ������� ���ư���.
		
	}
}


