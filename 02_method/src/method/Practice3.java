package method;
/*[����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice3 p3 = new Practice3();
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		int input = Integer.parseInt(br.readLine());
		time(input);
		
	}
	public static void time(int a) {//1hour=60min, 1min=60sec
		
		//
		int hour = a/3600;//�Է¹��� �ð��� 360���� ���� ���� int���� hour
		int min =  (a%3600)/60;//(a-(hour*3600))/60;
		int sec = (a%3600)%60;//(a-(hour*3600))%60;
		System.out.println(hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�.");
		//String time = hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�.";
		
	}
}
