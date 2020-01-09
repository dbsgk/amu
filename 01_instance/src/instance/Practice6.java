package instance;

/*[문제6]
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t (ch에 T에 있을 때)
또는
e → E (ch에 e가 있을 때)
 */
public class Practice6 {

	public static void main(String[] args) {
		char ch = 'Z';
		char result = ch>='A' && ch<'Z'? (char)(ch+32): (char)(ch-32);//대문자면
		//int verify_ch = ch>=65 && ch<90? (ch+32): (ch-32);//int형
		System.out.println(ch+"->"+result);
		char ch1= 92;
		System.out.println(ch1);
		
	}

}
