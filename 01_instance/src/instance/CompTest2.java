package instance;
//and 연산자
public class CompTest2 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1 +=10)<0 && (num2+=10)>0);
		//num1의 결과가 false 이므로 뒤에 연산은 수행하지 않는다. 따라서 num2=0
		//만약 &&연산자가 아닌 &연산자를 사용했다면 num2=10; &연산자는 앞에서 결과가 나와도 끝까지 연산을 수행하기 떄문.
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2);
		System.out.println();
		
		result = ((num1+=10)>0)|| ((num2+=10)>0);
		//아까와 마찬가지로 num1의 연산만으로 결과가 나와서 뒤에 연산은 수행하지 않는다. 따라서 num2=0
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2);//num1=20, num2=0

	}

}
