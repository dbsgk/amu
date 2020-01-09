package day02;
//배열이란
//똑같은 데이터타입을 연결시켜놓은 참조형 변수
public class Ex06 {
	private final static int SIZE = 5;
	public static void main(String[] args) {
		//배열 선언하기
		//데이터타입[] 배열이름 = new 데이터타입[배열크기];
		//웹에서는 main메소드 안씀. 웹에서 실행해서. 아직은 콘솔 사용해서 main씀.
		int[] arr= new int[SIZE];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[3]);
		for(int i=0; i<arr.length; i++) {
			//배열에 각 요소를 접근할때에는 arr[요소의 인덱스번호]로 접근하게 된다.
			//인덱스 번호는 0부터 배열의크기 -1까지이다.
			//각 요소는 하나의 변수로 취급된다.
			//무슨뜻이냐, arr[0]은 arr[0]이란 이름의 인트변수처럼 사용가능하다.
			System.out.println(arr[i]);
		}
		
	}

}
