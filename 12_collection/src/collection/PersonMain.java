package collection;

public class PersonMain {
	public PersonDTO[] init() {
		PersonDTO[] dto = new PersonDTO[3];
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("또치",40);
		PersonDTO cc = new PersonDTO("코난",16);
		dto[0]= aa;
		dto[1]= bb;
		dto[2]= cc;
		
		return dto;
		
	}
	public static void main(String[] args) {
		PersonMain main = new PersonMain();
		PersonDTO[] a = main.init();
		
		for(int i=0;i<a.length;i++) {
			System.out.println("이름="+a[i].getName()+"  나이="+a[i].getAge());
		}
	}
}
