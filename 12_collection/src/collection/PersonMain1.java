package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain1 {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("ȫ�浿",25);
		PersonDTO bb = new PersonDTO("��ġ",40);
		PersonDTO cc = new PersonDTO("�ڳ�",16);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
		
	}
	public static void main(String[] args) {
		PersonMain1 main = new PersonMain1();
		ArrayList<PersonDTO> list = main.init();
		
		for(int i=0;i<list.size();i++) { //ArrayList�� ũ��� lenght�� �ƴϰ� size()
			System.out.println("�̸�="+list.get(i).getName()+"  ����="+list.get(i).getAge()); //list.get(�ε�����ȣ).getName()
		}
		System.out.println("-------------------------------");
		
		for(PersonDTO d : list) {
			//System.out.println("�̸�="+d.getName()+"  ����="+d.getAge());
			System.out.println(d);//toString�� �������̵� �صּ� �׳� d�� �ᵵ ��ü ����.
		}
		System.out.println("-------------------------------");
		Iterator<PersonDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	}//main
}//class
