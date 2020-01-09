package day03;
//단일책임원칙에 따라서
//좀더 클래스들을 분리해봅시다.

import java.util.Scanner;

//MVC패턴이란?
//단순히 하나의 큰 클래스로 컨트롤하는 것이 아니라
//Model - Viewer - Controller로 분리해서
//유지보수를 쉽게 할 수 있게 프로젝트를 만드는 디자인패턴

//DTO(VO): 정보를 담을 틀(필드, 겟터셋터, equals, toString() 정도만 갖고 있음) = Model
//Controller: 데이터를 DTO로 insert, delete, update, select, selectAll 할때 사용; 우리는 서버가 없어서 얘가 필드 가지고 있을 예정;
//Viewer: 화면에 출력을 담당

public class ParkEx04 {
	public static void main(String[] args) {
		ParkController controller = new ParkController();
		Scanner scan = new Scanner(System.in);
		ParkViewer viewer = new ParkViewer();
		viewer.showMenu(controller, scan);
		
		scan.close();
	}
}
