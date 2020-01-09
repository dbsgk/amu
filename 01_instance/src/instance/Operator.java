package instance;
//증감연산자//우선순위 
public class Operator {

	public static void main(String[] args) {
		int a=5;
		a+=2;//a=a+2; 주석처리된 방법을 쓰면 연산을 2번해서 처리시간이 길어진다. 그래서 증감연산자 사용.
		a*=3;//a=a*3
		//a/=9;//a=a/9
		System.out.println("a="+a);//21
		
		//++a 선행연산,  a-- 후행연산
		a++;//a+=1
		System.out.println("a="+a);//22
		
		int b = a++;//==  int b=a; a++; //22
		//int b = ++a;//== ++a; int b=a; //23
		System.out.println("a="+a+"\t b="+b);//a23 b22
		
		//a--;//a-=1
		
		
		int c= ++a - b--;//24-22=2
		//++a;
		//b--;//(저는 나중에 할래요)
		//int c= a-b;
		//b--;
		System.out.println("a="+a+"\t b="+b+"\t c="+c);//a24 b21 c2
		
		System.out.println("a++ ="+ a++);
		// 1. System.out.println("a++ ="+ a);//24
		// 2. a++;//25

		
	}

}
