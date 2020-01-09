package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제4] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
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
			System.out.print("게임을 실행하겠습니까(y/n) : ");
			yn = br.readLine();
		} while (!yn.equalsIgnoreCase("n") && !yn.equalsIgnoreCase("y"));// while
		if (yn.equalsIgnoreCase("y")) {
			System.out.println("게임을 시작합시다.");
			for (int i = 0; i < ar.length; i++) {
				ar[i] = (int) (Math.random() * 9 + 1);
				// 난수발생

				for (int j = 0; j < i; j++) {
					if (ar[i] == ar[j]) {
						i--;
						break;
					}
					// 중복체크
				}
			}
			
			for (int i : ar) {
				System.out.print(i);
			}
			while (sw) {
				System.out.print("숫자입력: ");
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

				System.out.println(strike + "스트라이크 " + ball + "볼");
				if (strike == 3) {
					System.out.println("게임끝");
					break;
				}

				// 1.같은자리를 먼저 뒤진다
				// 2.같은자리가 아닌곳을 for문으로 뒤진다.

				// sw=false;
			} // while
		} // if
		else if (yn.equalsIgnoreCase("n"))
			;

	}// main

}// class
