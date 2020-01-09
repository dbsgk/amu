package interface_1;

public interface InterA { //interface에선 public static final빠져도 상수됨. 인터페이스엔 상수랑 추상메소드밖에 존재할 수 없어서.
	public static final String NAME="홍길동";//상수
	int AGE=25; //상수 
	
	public abstract void aa(); //추상메서드
	public void bb();// 추상메서드 
}
