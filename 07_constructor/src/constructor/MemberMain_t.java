package constructor;

import java.util.Scanner;

public class MemberMain_t {
	Scanner sc = new Scanner(System.in);
	PersonDTO ar[] = new PersonDTO[5];

	public static void main(String[] args) {
		MemberMain_t mm = new MemberMain_t();
		mm.menu();
	}
	
	public void menu() {
		int num=0;
		while(true) {
			System.out.println("*************");
			 System.out.println("  1. 가입");
			 System.out.println("  2. 출력");
			 System.out.println("  3. 수정");
			 System.out.println("  4. 탈퇴");
			 System.out.println("  5. 끝내기");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num=sc.nextInt();
			if(num==5)break;
			
			if(num==1)insert();//this.insert();와 같다.
			else if(num==2)list();
	        else if(num==3)update();
	        else if(num==4)delete();
			
		}//while
	}//menu


	public void delete() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone =sc.next();
		int i;
		
		for(i=0;i<ar.length;i++) {
			if(ar[i]!=null&& ar[i].getPhone_number().equals(phone)) {
				ar[i]=null;
				System.out.println("1 row(s) deleted");
				break;
			}
		}
		if(i==5) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}//delete

	private void update() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone =sc.next();
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]!=null && ar[i].getPhone_number().equals(phone)) {
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getPhone_number() + "\t"
						+ ar[i].getAddress());
				
				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(sc.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setPhone_number(sc.next());
				System.out.print("수정 할 주소 입력 : ");
				ar[i].setAddress(sc.next());
				 
				System.out.println("1 row(s) updated");
				break;
			}//if
		}//for
		
		if(i==5) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}//update

	public void insert() {
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]==null)break;
		}
		
		
		if(i==ar.length) {
			System.out.println("5명의 정원이 꽉 찼습니다...");
			return;//insert()메소드 자체를 벗어나라. void일때 return은 탈출용.
		}
		
		//가입
		System.out.print("이름 입력 : ");
		String name=sc.next();
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone=sc.next();
//		 if(!phone.matches("(01[016789])-(\\d{3,4})-(\\d{4})")) {
//			 System.out.println("ex)010-1234-5678");
//		 }
		System.out.print("주소 입력 : ");
		String address=sc.next();
		
		ar[i]= new PersonDTO(name,age,phone,address);
		
		System.out.println("1 row created"); 
		
		int cnt=0;
		for(i=0; i<ar.length;i++) {
			if(ar[i]==null)
			cnt++;
		}
		System.out.println(cnt+"자리 남았습니다.");
	}//insert

	private void list() {
		System.out.println("name\tAge\tPhone\tAddress");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getPhone_number() + "\t"
						+ ar[i].getAddress());
			}
		}
	}//list
}//class
