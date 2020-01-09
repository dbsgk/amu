package class_1;
//오버로딩연습

/*[문제2]
arae(3) 를 호출하여 원의 넓이
area(5,7)를 호출하여 삼각형 넓이
area(2,3 5)를 호출하여 사다리꼴 넓이를 구하시오

클래스명 : ShapeTest
필드 : PI (3.141592)

[실행결과]
원의 넓이 : 28.274337 // 반지름제곱 *3.14
삼각형의 넓이 : 17.5	//밑변*높이/2
사다리꼴의 넓이 : 24.5 //(아랫변+윗변)*높이/2
*/

class ShapeTest{
	double PI = 3.141592;
	public double area(int a) {
		return a*a*PI;
	}
	public double area(int a,int b) {
		return (double)a*b/2;
	}
	public double area(int a, int b, int c) {
		return (double)(a+b)*c/2;
	}
	
}
public class Practice2 {

	public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		System.out.println("원의 넓이 : "+st.area(3));
		System.out.println("삼각형의 넓이 : "+st.area(5,7));
		System.out.println("사다리꼴의 넓이 : "+st.area(2,3,5));
	}

}
