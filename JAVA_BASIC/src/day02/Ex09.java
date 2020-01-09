package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//ArrayList를 사용해서
//중복을 제거한 로또번호제작기를 만드세요.
public class Ex09 {
	private final static int SIZE =6;
	private final static int MAX = 45;
	public static void main(String[] args) {
		
		
		Random r = new Random();
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		
		// size()와 contains()를 사용해서 중복처리가 된 리스트를 만들자.
		while(lottoNumbers.size()<SIZE) {
			Integer randomNumber = r.nextInt(MAX)+1;
			//=(lottoNumbers.contains(randomNumber)==false)
			if(!lottoNumbers.contains(randomNumber)) {//중복되지 않으면
				lottoNumbers.add(randomNumber);
			}
		}
		
		Collections.sort(lottoNumbers);//정렬해줌
		for(Integer num:lottoNumbers) {
			System.out.println(num);
		}
		
		
	}
}
