package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����4] ���� ����
10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
�������� �� 5������ �����Ѵ�
1������ ���� 20���� ���
���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�(��ȸ�� �� �ι�)

[������]
[1] 25 + 36 = 45
Ʋ�ȴ�
[1] 25 + 36 = 61
������

[2] 78 + 10 = 100
Ʋ�ȴ�
[2] 78 + 10 = 95
Ʋ�ȴ�...���� :
...

����� �� x������ ���߾ xx�� �Դϴ�

continue(y/n) : w //y,n�ƴ� �ٸ��������� ��� ����
continue(y/n) : n
���α׷��� �����մϴ�
*/
public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn = null;
		//boolean sw =true;
		int count;
		LOOP: while(true) {//���α׷�; ���� ó������ Ǫ�°�(��Ż �ʱ�ȭ)
			int munje=0, jumsu=0;
			for(int i=1;i<=5;i++) {//5���� for(������ �ʱ�ȭ)
				int a = (int)(Math.random()*90)+10;
				int b = (int)(Math.random()*90)+10;
				while(true){//1���� ���� while
					System.out.println(a+b);
					System.out.print("["+i+"] "+a+" + "+b+" = ");
					int user = Integer.parseInt(br.readLine());
					if((a+b)==user) {//������ ��
						System.out.println("������ ");
						munje++;
						jumsu+=20;break;//1����whileŻ��; 5����for+1;
					}else if((a+b)!=user) {//Ʋ���� ��
						System.out.println("Ʋ�ȴ�");
						System.out.print("["+i+"] "+a+" + "+b+" = ");
						user = Integer.parseInt(br.readLine());
						if((a+b)==user) {
							System.out.print("Ʋ�ȴ�...���� ");//Ʋ�ȴٰ� ������ ��
							munje++;
							jumsu+=20;break;//1����whileŻ��; 5����for+1;
						}//Ʋ�ȴٰ� ���� if
						else break;//�ι�Ʋ���� ������
					}//Ʋ������
					
				}//1���� while
			}//5����for
			//5���� �� Ǯ�� ������
			System.out.println("����� �� "+munje+"������ ���߾ "+jumsu+"�� �Դϴ�.");
			while(true) {
				System.out.print("continue(y/n) : ");
				if(yn.equalsIgnoreCase("n")) break LOOP;//������while�� Ż��
				else if(yn.equalsIgnoreCase("y"))continue LOOP;//������ while�� ó������ ��
				
			}
			//���ͼ� n�̸� break
			//y�� continue
			
		
		}//���� Ǯ�� ���α׷� while
		System.out.println("���α׷��� �����մϴ�.");
		
	}//main
}
