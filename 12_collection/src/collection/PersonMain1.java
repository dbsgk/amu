package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain1 {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("또치",40);
		PersonDTO cc = new PersonDTO("코난",16);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
		
	}
	public static void main(String[] args) {
		PersonMain1 main = new PersonMain1();
		ArrayList<PersonDTO> list = main.init();
		
		for(int i=0;i<list.size();i++) { //ArrayList의 크기는 lenght가 아니고 size()
			System.out.println("이름="+list.get(i).getName()+"  나이="+list.get(i).getAge()); //list.get(인덱스번호).getName()
		}
		System.out.println("-------------------------------");
		
		for(PersonDTO d : list) {
			//System.out.println("이름="+d.getName()+"  나이="+d.getAge());
			System.out.println(d);//toString에 오버라이딩 해둬서 그냥 d만 써도 전체 나옴.
		}
		System.out.println("-------------------------------");
		Iterator<PersonDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	}//main
}//class
