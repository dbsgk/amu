package constructor;

import java.util.Scanner;

public class MemberMain4 {
	Scanner sc  =new Scanner(System.in);
	static PersonDTO2[] dto = new PersonDTO2[5];
	int count;//남은자리수
	int arNum;//배열번호
	
	public void countCalc(){
		int count=0;
		for(int i=0;i<dto.length;i++){
			if(dto[i]==null)count++;
		}
		this.count=count;
	}//남은 자리수 구하는 메소드
	
	public void findMem(){
		int arNum=-1;
		System.out.print("핸드폰 번호 입력: ");
		String input = sc.next();
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null&& dto[i].getPhone_num().equals(input)){
				arNum=i; this.arNum=arNum; break;
			}//if
		}//for
		if(arNum==-1)System.out.println("찾는 회원이 없습니다.");
		
	}//폰번호 같은 회원 구하는 메소드

	private void insert() {
		while(true){
			countCalc();
			if(count==0)
			{System.out.println("5명 정원이 찼습니다...");break;}
			for(int i=0;i<dto.length;i++){
				if(dto[i]==null){
					dto[i] = new PersonDTO2();
					System.out.print("이름 입력: ");
					dto[i].setName(sc.next());
					System.out.print("나이 입력: ");
					dto[i].setAge(sc.nextInt());
					System.out.print("핸드폰 번호 입력: ");
					dto[i].setPhone_num(sc.next());
					System.out.print("주소 입력: ");
					dto[i].setAddress(sc.next());
					break;
				}//if
			}//for
			System.out.println("1 row created");
			countCalc();
			System.out.println(count+"자리 남았습니다.");break;
		}//while
	}//insert
	
	private void list() {
		System.out.println("이름\t나이\t핸드폰번호\t\t주소");
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null)
			System.out.println(dto[i].getName()+"\t"
								+dto[i].getAge()+"\t"
									+dto[i].getPhone_num()+"\t"
										+dto[i].getAddress());
		}
	}//list
	
	private void update() {
		findMem();
		System.out.println("이름\t나이\t핸드폰번호\t\t주소");
		System.out.println(dto[arNum].getName()+"\t"
				+dto[arNum].getAge()+"\t"
					+dto[arNum].getPhone_num()+"\t"
						+dto[arNum].getAddress());
		System.out.print("수정할 이름 입력: ");
		dto[arNum].setName(sc.next());
		System.out.print("수정할 핸드폰 번호 입력: ");
		dto[arNum].setPhone_num(sc.next());
		System.out.print("수정할 주소 입력: ");
		dto[arNum].setAddress(sc.next());
		System.out.println("1 row updated");
	}
	private void delete() {
		findMem();
		dto[arNum]=null;
		System.out.println("1 row deleted");
		findMem();
	}
	public void menu(){
		System.out.println("**************");
		System.out.println(" 1.가입");
		System.out.println(" 2.출력");
		System.out.println(" 3.수정");
		System.out.println(" 4.삭제");
		System.out.println(" 5.끝내기");
		System.out.println("**************");
		System.out.print("번호: ");
	}//menu

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		
		while(true){
			mm.menu();
			int choice= mm.sc.nextInt();
			if(choice==5) {System.out.println("프로그램을 종료합니다.");break;}
			else if(choice==1) { mm.insert();continue;}
			else if(choice==2) { mm.list();continue;}
			else if(choice==3) { mm.update();continue;}
			else if(choice==4) { mm.delete();continue;}
		}//while
		
	}//main
}//class