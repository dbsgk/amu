package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MoneyEx1 {

	public static void main(String[] args) throws IOException {
		ArrayList<Money> list = new ArrayList<Money>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("****** 용돈기입장 *****");
		while(true) {
			System.out.println("1.입력 2.삭제 3.출력 4.종료 ");
			int choice = Integer.parseInt(br.readLine());
			if(choice==1) {
				//입력(날짜,금액,메모)
				Money m = new Money();
				System.out.print("날짜: ");
				m.setDate(br.readLine());
				System.out.print("금액: ");
				m.setPaid(Integer.parseInt(br.readLine()));
				System.out.print("메모: ");
				m.setMemo(br.readLine());
				
				list.add(m);
				
			}else if(choice==2) {
				//삭제
				System.out.println("=================");
				System.out.println("     사용내역          ");
				System.out.println("=================");
				for(int i=0;i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				System.out.println("삭제할 번호를 입력해주세요.");
				//삭제번호입력받고
				int number = Integer.parseInt(br.readLine()); 
				//그번호에 해당하는 인덱스지우기
				list.remove(number);
			}else if(choice==3) {
				//출력
				System.out.println("=================");
				System.out.println("     사용내역          ");
				System.out.println("=================");
				for(int i=0;i<list.size();i++) {
					System.out.println(i+"."+list.get(i));
				}
				
			}else if(choice==4) {
				System.out.println("종료합니다.");
				break;
			}
		}//while

	}//main

}//class
