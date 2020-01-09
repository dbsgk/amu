package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//ArrayList�� ����ؼ�
//�ߺ��� ������ �ζǹ�ȣ���۱⸦ ���弼��.
public class Ex09 {
	private final static int SIZE =6;
	private final static int MAX = 45;
	public static void main(String[] args) {
		
		
		Random r = new Random();
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		
		// size()�� contains()�� ����ؼ� �ߺ�ó���� �� ����Ʈ�� ������.
		while(lottoNumbers.size()<SIZE) {
			Integer randomNumber = r.nextInt(MAX)+1;
			//=(lottoNumbers.contains(randomNumber)==false)
			if(!lottoNumbers.contains(randomNumber)) {//�ߺ����� ������
				lottoNumbers.add(randomNumber);
			}
		}
		
		Collections.sort(lottoNumbers);//��������
		for(Integer num:lottoNumbers) {
			System.out.println(num);
		}
		
		
	}
}
