package method;
/*[����1]
����(dec)�� �Է¹޾Ƽ� 2����(binary), 8����(octor), 16����(hexa) ��ȯ�Ͻÿ�
IntegerŬ���� �޼ҵ带 �̿��Ͻÿ�

[������]
10������ �Է��ϼ��� : 250

2���� = 11111010
8���� = 372
16���� = fa
*/
//2����,8����, 16������ ���ϴ� �Լ� �����.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10������ �Է��ϼ��� :");
		int dec = Integer.parseInt(br.readLine());//����dec�Է¹���
		
		System.out.println("2���� = "+Integer.toBinaryString(dec));
		//java.lang.Integer.toBinaryString �޼ҵ��� return���� String�̶� ���ڷ� ����Ϸ��� Integer�� ��ȯ������Ѵ�.
		System.out.println("8���� = "+Integer.toOctalString(dec));
		System.out.println("16���� = "+Integer.toHexString(dec));

		
	}
}
