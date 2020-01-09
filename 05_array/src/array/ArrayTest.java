package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		//ar=10; 이런거 절대 안됨. ar은 주소값만 쥐고 있는거라서 정확한 방번호에 넣어줘야함.
		ar[0] = 25;
		ar[1] = 36;
		ar[2] = 47;
		ar[3] = 55;
		ar[4] = 60;
		
		System.out.println("배열명 ar = "+ar);//이건 toString 메소드 사용한것과 결과가 같다.
		System.out.println("배열명 ar = "+ar.toString());
		System.out.println("배열크기 = "+ar.length);
		for(int i=0;i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("거꾸로출력");
		for(int i = (ar.length)-1;i>=0;i-- ) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("홀수데이터만 출력");
		for(int i=0;i<ar.length; i++) {
			if(ar[i]%2==1)
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("확장for");
		for(int data: ar) {//ar의 크기만큼 반복하면서 데이터를 꺼내준다.
			System.out.println(data);//방번호 개념이 아니라 그냥 가지고 있는 데이터 전부다 꺼내주는 개념
		}
		System.out.println();
		

	}

}
