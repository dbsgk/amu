package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//key 중복허용
		
		//System.out.println(map.get("book101"));
		
		System.out.print("코드입력: ");
		String key = sc.next();
		
		if(map.get(key)!=null) {
			System.out.println(map.get(key));
		}else System.out.println("없는 key입니다.");
		
		
		//코드입력 : book501
		//없는 key입니다.
		
		//코드입력 : book301
		//피오나
		
		if(map.containsKey(key)) {//맵에 key가 들어있니? 포함한다(true)/포함하지 않는다(false) ; boolean타입
			System.out.println(map.get(key));
		}else System.out.println("없는 key입니다.");
		


	}
}
