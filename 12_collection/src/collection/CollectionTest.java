package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");//중복허용, 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		//타입관계 ㄴㄴ
		//노란줄 : 타입이 일정치 않아서 불안해서 뜸.
		//노란줄없애는법1.  
		//			2. 
		
		Iterator it = coll.iterator();//생성
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}
}
