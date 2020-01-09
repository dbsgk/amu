package constructor;

import java.util.Scanner;

/*

클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created
xx자리 남았습니다

[2번 경우]
list()
이름	나이	핸드폰		주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동	25	xxx	xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다*/

public class MemberMain {
	static int count;// 남은 자리수
	static PersonDTO[] dto = new PersonDTO[5];// 객체배열 기본값:null
	Scanner sc = new Scanner(System.in);

	// ????;//총 5명 salaryDTO 배열
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

	public void countCalc() {
		int count = 0;
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] == null)
				count++;
			// System.out.println(dto[i]);
		} // 남은 자리수
		this.count = count;
	}// countCalc

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

	public void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i] != null) {
				System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number() + "\t"
						+ dto[i].getAddress());
			}
		} // 빈자리 배열번호 찾아서 출력할거야.

		/*
		 * for(PersonDTO data: dto) { System.out.println(data.getName()+"\t"
		 * +data.getAge()+"\t" +data.getPhone_number()+"\t"+data.getAdress()); }
		 */

	}// list

	public void update() {
		LOOP: while (true) {
			System.out.print("핸드폰 번호 입력: ");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getPhone_number().equals(sc.next())) {
					System.out.println(dto[i].getName() + "\t" + dto[i].getAge() + "\t" + dto[i].getPhone_number()
							+ "\t" + dto[i].getAddress());

					System.out.print("수정할 이름 입력 : ");
					dto[i].setName(sc.next());
					System.out.print("수정할 핸드폰 입력 : ");
					dto[i].setPhone_number(sc.next());
					System.out.print("수정할 주소 입력 : ");
					dto[i].setAddress(sc.next());

					System.out.println("1 row(s) updated");
					break;
				} // if 폰번호같으면 해당 인덱스의 정보뽑고 다시 입력.
				else {
					System.out.println("찾는 회원이 없습니다.");
					break LOOP;
				}
			} //

		} // while Loop

	}// update

	public void delete() {
		int dtoCnt = 0;// 등록된 회원수
		LOOP: while (true) {
			int arNum = 0;
			System.out.print("핸드폰 번호 입력: ");
			String input = sc.next();

			for (int i = 0; i < dto.length; i++) {
				if (dto[i] != null)
					dtoCnt++;
			} // for 회원수 구하기
			if (dtoCnt == 0) {
				break LOOP;
			} // dto에 값이 하나도 없으면
			for (int i = 0; i < dto.length; i++) {
				if (!dto[i].getPhone_number().equals(input)) {
					System.out.println("찾는 회원이 없습니다.");
					break LOOP;
				} else if (dto[i].getPhone_number().equals(input)) {
					// dto[arNum] = null;
					arNum = i;
					dto[arNum].setName(null);
					dto[arNum].setAge(0);
					dto[arNum].setPhone_number(null);
					dto[arNum].setAddress(null);
					System.out.println("1 row deleted");
					break;
				} // else if

			} // for 폰번호같으면 삭제해
		} // while LOOP
		System.out.println("등록된 회원이 없습니다.");
	}// delete

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();

		while (true) {
			mm.menu();
			int choice = mm.sc.nextInt();
			if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 1) {
				mm.insert();
				continue;
			} else if (choice == 2) {
				mm.list();
				continue;
			} else if (choice == 3) {
				mm.update();
				continue;
			} else if (choice == 4) {
				mm.delete();
				continue;
			} else
				continue;
		} // while

	}// main

}// class
