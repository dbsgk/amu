package instance;

/*[����6]
ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�

[������]
T �� t (ch�� T�� ���� ��)
�Ǵ�
e �� E (ch�� e�� ���� ��)
 */
public class Practice6 {

	public static void main(String[] args) {
		char ch = 'Z';
		char result = ch>='A' && ch<'Z'? (char)(ch+32): (char)(ch-32);//�빮�ڸ�
		//int verify_ch = ch>=65 && ch<90? (ch+32): (ch-32);//int��
		System.out.println(ch+"->"+result);
		char ch1= 92;
		System.out.println(ch1);
		
	}

}
