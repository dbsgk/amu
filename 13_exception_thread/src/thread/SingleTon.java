package thread;

public class SingleTon {
	private int num=3;
	private static SingleTon instance;
	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized (SingleTon.class) {
				instance = new SingleTon(); //迭 茄 锅 贸府等促.
			}
		}//if
		return instance;
	}//getInstance()
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = "+aa);
		System.out.println("num = "+aa.num);
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = "+bb);
		System.out.println("num = "+bb.num);
		System.out.println();
		
		
		System.out.println("*** 教臂沛 ***");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = "+cc);
		System.out.println("num = "+cc.num);
		
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = "+dd);
		System.out.println("num = "+dd.num);
		
		SingleTon ee = SingleTon.getInstance();
		ee.num++;
		System.out.println("ee = "+ee);
		System.out.println("num = "+ee.num);
		
		
	}
}
