package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�
��, �����̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�
[������]
���� �Է�: -7
���� �Է�: 8
8 16 24 32 40 48 56

�����Է�: 0
���α׷��� �����մ�
*/
public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("���� �Է�: ");
			int num = Integer.parseInt(br.readLine());
			if (num < 0) {continue;//������ �ԷµǸ� �ٽ� ó�����ΰ��� �����Է��ض�
			} else if (num == 0) {break;//0�� �ԷµǸ� ���α׷� ����
			} else {
				for (int count = 1; count <= 7;count++) {
					System.out.print(num * count + " ");
				}
				System.out.println();
			}

		}//while
		System.out.println("���α׷��� �����մϴ�.");

	}
}
