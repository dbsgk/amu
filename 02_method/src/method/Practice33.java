package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제3]
초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다
*/
public class Practice33 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice33 p33 = new Practice33();
		
		System.out.println("초를 입력하시오: ");
		int input  = Integer.parseInt(br.readLine());
		System.out.println(p33.time(input));

	}
	public String time(int a) {
		int hour = a/3600;
		int min = (a%3600)/60;
		int sec = (a%3600)%60;
		String time = hour+"시간 "+min+"분 "+sec+"초 입니다.";
		return time;
	}

}
