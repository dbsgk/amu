package day02;

import java.util.ArrayList;
import java.util.Scanner;

//아까 만들었던 Student 클래스를 이용한
//성적관리 프로그램을 만들어보자.
public class StudentEx {
	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();//뒤에 <>여기엔 적어도 안적어도 상관 ㄴㄴ
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("비트고 성적관리 프로그램");
			System.out.println("1. 새로입력 2.출력 3. 종료");
			System.out.print(">");
			int choice = scan.nextInt();
			if(choice ==1) {
				//새로운 학생객체를 만들어서 list에 추가해준다
				Student s = new Student();
				System.out.println("이름");
				scan.nextLine();//enter 문자열로 인식해서 다음 이름이 입력안됨.
				s.setName(scan.nextLine());
				System.out.println("번호");
				s.setId(scan.nextInt());
				System.out.println("학년");
				s.setGrade(scan.nextInt());
				System.out.println("반");
				s.setRoom(scan.nextInt());
				System.out.println("국어");
				s.setKor(scan.nextInt());
				System.out.println("영어");
				s.setEng(scan.nextInt());
				System.out.println("수학");
				s.setMath(scan.nextInt());
				list.add(s);
				
			}else if(choice==2) {
				//전체를 출력하는 코드를 작성한다.
				System.out.println("===========================================");
				//\t는 탭공백(스페이스4개크기)
				System.out.println("번호\t이름\t학년\t반\t국어\t영어\t수학\t총점\t평균\t");
				System.out.println("===========================================");
				for(Student s: list) {
					System.out.println(s);//getId()+"\t"+s.getName()+"\t"+s.getGrade());
				}
			}else if(choice==3) {
				System.out.println("사용해주셔서 감사함");
				break;
			}
		}
		scan.close();		
	}
}
