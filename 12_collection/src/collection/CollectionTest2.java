package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest2 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");//중복허용, 순서
//		list.add(25);
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------");
		
		for(String data: list) {
			System.out.println(data);
		}
//		Iterator it = list.iterator();//생성
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		
		
		
		
		
		
		
		
	}
}
