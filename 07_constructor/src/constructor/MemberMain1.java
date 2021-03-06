package constructor;

import java.util.Scanner;

public class MemberMain1 {
	Scanner sc = new Scanner(System.in);
	PersonDTO[] dto = new PersonDTO[5];// 객체배열 기본값:null
	int count;// 남은 자리수

	public static void main(String[] args) {
		MemberMain1 m1 = new MemberMain1();
		
		while(true) {
			m1.menu();//메뉴 불러오기
			int choice = m1.sc.nextInt();
			if(choice==5) {System.out.println("프로그램을 종료합니다.");break;}
			else if(choice==1) {m1.insert();continue;}
			else if(choice==2) {m1.list();continue;}
			else if(choice==3) {m1.update();continue;}
			else if(choice==4) {m1.delete();continue;}
		}//while
		
	}//main
	public void insert() {

		countCalc();// 남은 자리수 구하는 메소드
		if (count == 0)
			System.out.println("5명의 정원이 꽉 찼습니다...");
		else {

			int blankNum = 0;// 빈자리 배열번호
			for (int i = 0; i < dto.length; i++) {
				if (dto[i] == null) {
					blankNum = i;
					break;
				}
			} // 빈자리 배열번호 찾아서 넣어줄거야.
				// System.out.println(blankNum);
			dto[blankNum] = new PersonDTO();
			System.out.print("이름 입력 : ");
			dto[blankNum].setName(sc.next());
			System.out.print("나이 입력 : ");
			dto[blankNum].setAge(sc.nextInt());
			System.out.print("핸드폰 입력 : ");
			dto[blankNum].setPhone_number(sc.next());
			System.out.print("주소 입력 : ");
			dto[blankNum].setAddress(sc.next());

			System.out.println("1 row created");
			count--;
			System.out.println((count) + "자리 남았습니다.");
		} // else
	}// insert

	private void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number() + "\t"
						+ dto[i].getAddress());
			}//if
		} //for 비어있지않으면 출력할거야.
	}//list

	private void update() {
		LOOP: while(true) {
			System.out.print("핸드폰 번호 입력: ");
			String input = sc.next();
			for (int i = 0; i < dto.length; i++) {
				if (dto[i]!=null && dto[i].getPhone_number().equals(input)) {
					System.out.println("이름\t나이\t핸드폰\t\t주소");
					System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number()
							+ "\t" + dto[i].getAddress());

					System.out.print("수정할 이름 입력 : ");
					dto[i].setName(sc.next());
					System.out.print("수정할 핸드폰 입력 : ");
					dto[i].setPhone_number(sc.next());
					System.out.print("수정할 주소 입력 : ");
					dto[i].setAddress(sc.next());

					System.out.println("1 row(s) updated");
					break LOOP;
				} // if 폰번호같으면 해당 인덱스의 정보뽑고 다시 입력.
			}//for
			System.out.println("찾는 회원이 없습니다.");
			break LOOP;
		}//while LOOP
	}//update

	private void delete() {
			LOOP: while (true) {
				System.out.print("핸드폰 번호 입력: ");
				String input = sc.next();
				for (int i = 0; i < dto.length; i++) {
					 if (dto[i]!=null&&dto[i].getPhone_number().equals(input)) {
						dto[i]=null;
						System.out.println("1 row deleted");
						continue LOOP;
					}//if
				} // for 폰번호같으면 삭제해
				System.out.println("찾는 회원이 없습니다.");break;
			} // while LOOP
	}//delete
	
	public void countCalc() {
		int count = 0;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] == null)
				count++;
		}//for
		this.count = count;
		System.out.println("남은자리수"+count);
	}// countCalc 남은 자리수

	public void menu() {
		System.out.println("************");
		System.out.println("  1. 가입");
		System.out.println("  2. 출력");
		System.out.println("  3. 수정");
		System.out.println("  4. 탈퇴");
		System.out.println("  5. 끝내기");
		System.out.println("************");
		System.out.print("번호 : ");
	}// menu
	
}//class