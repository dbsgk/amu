package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
숫자를 입력하여 배수를 7개만 구하시오
단, 음수이면 다시 입력하고 0이면 종료하시오
[실행결과]
숫자 입력: -7
숫자 입력: 8
8 16 24 32 40 48 56

숫자입력: 0
프로그램을 종료합니
*/
public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("숫자 입력: ");
			int num = Integer.parseInt(br.readLine());
			if (num < 0) {continue;//음수가 입력되면 다시 처음으로가서 숫자입력해라
			} else if (num == 0) {break;//0이 입력되면 프로그램 종료
			} else {
				for (int count = 1; count <= 7;count++) {
					System.out.print(num * count + " ");
				}
				System.out.println();
			}

		}//while
		System.out.println("프로그램을 종료합니다.");

	}
}
