package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_t {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn;
		int com[] = new int[3];
		int user[] = new int[3];
		int strike;
		int ball;
		String inputStr;
		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = br.readLine();
		}	while(!yn.equals("y")&&!yn.equals("Y")&&!yn.equals("n")&&!yn.equals("N"));
		
		//y�����
		if(yn.equals("y")||yn.equals("Y")) {
		
		System.out.println();
		System.out.println("������ �����մϴ�.");
		
		//�����߻�
		for(int i=0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9+1);
			//�ߺ�
			//���� ���� ��, 0���� ���� ��� ����
			//1���� 0���̶� ��
			//2���� 0��,1���̶� ��
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}//�ߺ�for��
		}//�����߻�for��
		
		System.out.println(com[0]+", "+com[1]+", "+com[2]);
			while(true) {
				//�Է�
				System.out.println();
				System.out.print("�����Է� : ");
				inputStr = br.readLine();
				for(int i=0;i<user.length;i++) {
					user[i]= inputStr.charAt(i)-48;
				}
				//System.out.println(user[0]+", "+user[1]+", "+user[2]); //�Է¹��� ���� ����� �̾Ƴ³� Ȯ��.
				
				strike= ball=0;//��Ʈ����ũ,�� �ʱ�ȭ
				for(int i=0;i<com.length;i++) {
					for(int j=0; j<user.length;j++ ) {
						if(com[i]==user[j]) {
							if(i==j)strike++;
							else ball++;
						}
					}//��for
				}//��for
				System.out.println(strike+"��Ʈ����ũ "+ball+"��");
				if(strike==3)break;
			}//while
		}//if y�ƴϸ� ����
		System.out.println("���α׷��� �����մϴ�."); 
		
	}//main

}//class
