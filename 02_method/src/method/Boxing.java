package method;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a/3;//cast연산-형변환
		//a를 double로 형변환 했다고 해서 앞으로 a가 double이 되는게 아니다. 그 라인에서만 적용.
		
		int c= 5;
		Integer d = c;//AutoBoxing 기본형 -> 객체형
		//원래는 안됨; Integer d = new Integer(c); JDK 5.0 이전에는 이런 식으로 바꿔줘야 함.
		
		Integer e = 5;
		int f = e;//Unboxing 객체형-> 기본형
		//원래는 안됨; e.intValue(); JDK 5.0 이전에는 이런 식으로 바꿔줘야 함.
		
	}

}
