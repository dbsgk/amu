package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����4] �߱�����
ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
�߻��� ���� ���ߴ� ����
�ߺ��� �����Ѵ�

[������]
������ �����Ͻðڽ��ϱ�(Y/N) : w
������ �����Ͻðڽ��ϱ�(Y/N) : u
������ �����Ͻðڽ��ϱ�(Y/N) : y

������ �����մϴ�

�����Է� : 123
0��Ʈ����ũ 0��

�����Է� : 567
0��Ʈ����ũ 2

�����Է� : 758
1��Ʈ����ũ 2��
...

�����Է� : 785
3��Ʈ����ũ 0��
*/
public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ar[] = new int[3];
		String yn = null;
		boolean sw = true;
		int user;
		int in[] = new int[3];

		do {
			System.out.print("������ �����ϰڽ��ϱ�(y/n) : ");
			yn = br.readLine();
		} while (!yn.equalsIgnoreCase("n") && !yn.equalsIgnoreCase("y"));// while
		if (yn.equalsIgnoreCase("y")) {
			System.out.println("������ �����սô�.");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = (int) (Math.random() * 9 + 1);
				// �����߻�

				for (int j = 0; j < i; j++) {
					if (ar[i] == ar[j]) {
						i--;
						break;
					}
					// �ߺ�üũ
				}
			}
			
			for (int i : ar) {
				System.out.print(i);
			}
			while (sw) {
				System.out.print("�����Է�: ");
				user = Integer.parseInt(br.readLine());
				in[0] = user / 100;
				in[1] = user % 100 / 10;
				in[2] = user % 100 % 10;

				int strike = 0, ball = 0;
				for (int i = 0; i < ar.length; i++) {
					if (ar[i] == in[i])
						strike++;
					for (int j = 0; j < ar.length; j++) {
						if (ar[i] == in[j] && i != j)
							ball++;
					}

				}
				// ball-=strike*3;
				// for(strike)

				System.out.println(strike + "��Ʈ����ũ " + ball + "��");
				if (strike == 3) {
					System.out.println("���ӳ�");
					break;
				}

				// 1.�����ڸ��� ���� ������
				// 2.�����ڸ��� �ƴѰ��� for������ ������.

				// sw=false;
			} // while
		} // if
		else if (yn.equalsIgnoreCase("n"))
			;

	}// main

}// class
