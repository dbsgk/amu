package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�
*/
public class Practice33 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice33 p33 = new Practice33();
		
		System.out.println("�ʸ� �Է��Ͻÿ�: ");
		int input  = Integer.parseInt(br.readLine());
		System.out.println(p33.time(input));

	}
	public String time(int a) {
		int hour = a/3600;
		int min = (a%3600)/60;
		int sec = (a%3600)%60;
		String time = hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�.";
		return time;
	}

}
