package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("ȣ����");
		coll.add("����");
		coll.add("ȣ����");//�ߺ����, ����
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		//Ÿ�԰��� ����
		//����� : Ÿ���� ����ġ �ʾƼ� �Ҿ��ؼ� ��.
		//����پ��ִ¹�1.  
		//			2. 
		
		Iterator it = coll.iterator();//����
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}
}
