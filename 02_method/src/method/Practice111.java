package method;

/*10���� a���� �Է¹ް� �� ���� 2,8,16���� ���ϱ�(Integer�Լ� �̿����� �ʰ�)*/
//���� �ϼ�
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice111 {
	public static void main(String[] args) throws IOException {
		// 5;10�� 2�� ������ ; 0;10%2�������� ������ĭ�� ����
		// 2;(10/2)�� 2�� ������; 1;(10/2)%2�������� ������-1ĭ�� ����
		// ((10/2)/2)�� 2�� ������; ((10/2)%2)/2�������� ����ĭ-1ĭ�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10���� ���ڸ� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		int mok2 = a;// �Է¹��� ���ڸ� 2������ ����� ����
		int mok8 = a;// �Է¹��� ���ڸ� 8������ ����� ����
		int mok16 = a;// �Է¹��� ���ڸ� 16������ ����� ����
		String nam2 = "";
		String nam8 = "";
		String nam16 = "";
		// String mok=String.valueOf(a);
		// for������ ���� �̾Ƴ���
		
		// 2����
		if (mok2 < 2) {
			
			System.out.println("2���� : " + mok2);

		} else if (mok2 >= 0) {
			while (mok2 / 2 > 0) {// ���࿡ a�� ���� ��������0�� �ƴҶ�(= 2�� a�� ������ ������)
				nam2 += String.valueOf(mok2 % 2);
				mok2 /= 2;
			}
			System.out.println("2���� : " + mok2 + (reverseString(nam2)));
		}
		// 8����
		if (mok8 < 8) {
			System.out.println("8���� : 0" + mok8);
		} else if (mok8 >= 8) {
			while (mok8 / 8 > 0) {// ���࿡ a�� ���� ��������0�� �ƴҶ�(= 8�� a�� ������ ������)
				nam8 += String.valueOf(mok8 % 8);
				mok8 /= 8;
			}
			System.out.println("8���� : 0" + mok8 + (reverseString(nam8)));
		}
		// 16����
		if(mok16<10) {//�Է¹��� ���ڰ� 9������ �����϶�
			System.out.println("16���� : 0x" + mok16);

		}else if (mok16 < 16) {//�Է¹��� ���ڰ� 15������ �����϶�
			int i = mok16 % 16;
			switch (i) {
			case 10:
				nam16 += "A";
				break;
			case 11:
				nam16 += "B";
				break;
			case 12:
				nam16 += "C";
				break;
			case 13:
				nam16 += "D";
				break;
			case 14:
				nam16 += "E";
				break;
			case 15:
				nam16 += "F";
				break;
			}//switch
			System.out.println("16���� : 0x" + nam16);
		} else if (mok16 >= 16) {
			while (mok16 / 16 > 0) {// ���࿡ a�� ���� ��������0�� �ƴҶ�(= 16���� a�� ������ ������)
				if (mok16 % 16 >= 10 && mok16 % 16 <= 15) {
					int i = mok16 % 16;
					switch (i) {
					case 10:
						nam16 += "A";
						break;
					case 11:
						nam16 += "B";
						break;
					case 12:
						nam16 += "C";
						break;
					case 13:
						nam16 += "D";
						break;
					case 14:
						nam16 += "E";
						break;
					case 15:
						nam16 += "F";
						break;
					}

				} else
					nam16 += String.valueOf(mok16 % 16);
				mok16 /= 16;
			}//16���� while
			System.out.println("16���� : 0x" + mok16 + (reverseString(nam16)));
		}//16���� else if
	}//main

	public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}
}
