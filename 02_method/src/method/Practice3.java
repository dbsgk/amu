package method;
/*[문제3]
초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice3 p3 = new Practice3();
		System.out.print("초를 입력하시오 : ");
		int input = Integer.parseInt(br.readLine());
		time(input);
		
	}
	public static void time(int a) {//1hour=60min, 1min=60sec
		
		//
		int hour = a/3600;//입력받은 시간을 360으로 나눠 나온 int값이 hour
		int min =  (a%3600)/60;//(a-(hour*3600))/60;
		int sec = (a%3600)%60;//(a-(hour*3600))%60;
		System.out.println(hour+"시간 "+min+"분 "+sec+"초 입니다.");
		//String time = hour+"시간 "+min+"분 "+sec+"초 입니다.";
		
	}
}
