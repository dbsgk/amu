package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*for��
[����2] ������ ���Ͻÿ� (x�� y�� ��)
[������]
x�� �Է�  : 2
y�� �Է�  : 5
2�� 5�� xx (2*2*2*2*2)
�Ǵ� 
x�� �Է�  : 3
y�� �Է�  : 4
3�� 4�� xx (3*3*3*3)
*/
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x�� �Է��ϼ��� : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y�� �Է��ϼ��� : ");
		int y = Integer.parseInt(br.readLine());
		int xpowy =1;
		for(int i= 1;i<=y;i++ ) {
			xpowy*=x;
		}
		System.out.println(x+"�� "+y+"�� "+xpowy);
	}

}
