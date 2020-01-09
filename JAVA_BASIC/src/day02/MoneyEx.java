package day02;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyEx{
	public static void main(String[] args) {
		ArrayList<Money> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("용돈기입장");
			System.out.println("1. 입력 2.삭제 3.출력 4.종료");
			System.out.println(">");
			int choice = scan.nextInt();
			if(choice ==1) {
				//Money 객체를 만들어서 list에 추가해주는 코드
				Money m = new Money();
				System.out.println("날짜");
				scan.nextLine();
				m.setDate(scan.nextLine());
				System.out.println("금액");
				m.setPaid(scan.nextInt());
				scan.nextLine();
				System.out.println("내용");
				m.setMemo(scan.nextLine());
				list.add(m);//이거 없으면 리스트에 저장안됨.
			} else if(choice==2) {
				System.out.println("=====사용내역====");
				for(int i=0; i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				System.out.println("삭제할 번호를 입력하세요");
				int index = scan.nextInt();
				list.remove(index);//이거없으면 리스트에서 삭제안됨.
				
			}else if(choice==3) {
				//출력하는 코드
				System.out.println("===========");
				System.out.println("사용내역");
				System.out.println("===========");
				for(Money m:list) {
					System.out.println(m);
				}
				
				
			}else if(choice==4) {
				//종료하는 코드
				System.out.println("끄읏");
				break;
			}
			
		}
		scan.close();
	}
}	
	