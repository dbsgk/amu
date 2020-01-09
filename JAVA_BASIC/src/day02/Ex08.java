package day02;
//ArrayList
//=주소값을 컨트롤 해서 배열처럼 구현해놓은 클래스
//다음요소의 주소값, 이전요소의 주소값을 저장해서 서로 연결함
//배열이 데이터타입을 모아놨듯이
//ArrayList는 template에 해당하는 클래스 변수만 받아들일 수 있다.
//하지만 기본형 데이터타입에는 주소값이 없는데 어떻게 해야 할까?
//답은 wrapper class라고 불리는 기본형 데이터타입을 클래스로 구현해놓은 클래스를 사용하면 된다.
//int-> Integer 
import java.util.ArrayList;
public class Ex08 {
	public static void main(String[] args) {
		//int의 래퍼(포장)클래스 Integer
		//ArrayList를 만들때에는<>(template)안에 어떤 클래스가 들어올지 정해줘야한다.
		//만약 Integer가 들어가면 해당 ArrayList는 Integer'만' 컨트롤할수있다.
		ArrayList<Integer> list = new ArrayList<>(); //지금 ArrayList가 Integer라는 템플릿을 갖고 있다.
		//값을 넣어줄 때에는 Integer객체를 넣어줘야 한다.
		//다행히 일반적인 숫자값도 넣을 수는 있지만
		//만약 Integer 가 아닌 다른 객체라면 객체를 만들어서 추가해줘야 한다.
		Integer i = 5;
		Integer i2 = new Integer(6);
		Integer i3 = new Integer("18");
		
		//list에 추가할 때에는 add method를 사용해서 추가해준다.
		list.add(i);
		list.add(i2);
		list.add(i3);
		list.add(1114);//get(3) 3번째
		int i4 = 123;//Integer가 int를 발견하면 내가 너 바꿔줄게 하면서 바꿔준다함.
		list.add(i4);
		
		//list에서 값을 불러올때에는 -> 배열[인덱스번호]처럼
		//get 메소드를 사용한다.
		System.out.println(list.get(3));//1114출력
		
		System.out.println("-----remove전----");
		for(Integer num:list) {
			System.out.println(num);
		}
		
		//list에서 값을 삭제할때에는 remove메소드를 사용한다.
		//삭제를 할때 2가지 방법
		//1. 해당하는 객체를 넘겨서 삭제하는 방법
		//2. 해당하는 위치를 삭제하는 방법
		
		//직접적으로 i를 넘겨주면 리스트가 equals()라는 메소드를 실행해서
		//2개가 일치하는 메소드를 삭제한다. 단! 파라미터로 넘어온 것이 클래스의 객체일 경우.
		//하지만 우리는 Integer를 다루기 떄문에 int값으로 삭제를 하려고 하면
		//문제가 생긴다! -> int i4는 124fksms rkqtdmf rkwrh dlTrh
		//우리 list에는 124번째 요소가 존재하지 않기 때문
		//따라서 Integer가 template인 경우에는 안전하게
		//Integer 객체로 컨트롤 하거나 혹은 index번호로 삭제해야한다.
		list.remove(i);//i4넣으면 오류나옴.int니까 3(인덱스번호)를 넣으면 정상작동.
		
		System.out.println("---remove 후---");
		for(Integer num:list) {
			System.out.println(num);
		}
		
		//만약 해당하는 위치에, 원하는 값으로 바꿔주려면
		list.set(2, 98);
		System.out.println(list.get(2));
		
		//리스트에 원하는 위치에 새로운 값을 추가해주면
		//해당 위치를 포함한 이후에 있던 요소들은
		//한칸씩 뒤로 밀려나게 된다.
		
		System.out.println("----add(인덱스번호, 요소)실행전----");
		for(Integer num: list) {
			System.out.println(num);
		}
		list.add(0,500);
		
		System.out.println("---add(인덱스번호, 요소)실행후---");
		for(Integer num: list) {
			System.out.println(num);
		}
		
		//ArrayList에는 indexOf
		//해당하는 요소가 인덱스 번호 몇번에 있는지 보여줍니다.
		//만약 해당하는 요소가 list에 없으면? -1 
		//모든 자연수(0부터모든양수)는 존재할 수 있는데 -1은 존재할수 없는 수라 -1 리턴됨
		System.out.println("---");
		System.out.println(list.indexOf(98));//3
		System.out.println(list.indexOf(87854465));//-1
		
		//ArrayList에는 contains라는 메소드가 있습니다.
		//list에 파라미터로 넘어온 객체가 존재하는지 안하는지 체크합니다.
		//존재하면 ture, 존재하지 않으면 false를 리턴합니다.
		System.out.println(list.contains(98));//t
		System.out.println(list.contains(-33));//f
		
		//list에 몇개의 요소가 존재하는지 확인할때에는
		//배열에서는 length라는 필드를 확인했지만
		//list에서는 size()메소드를 실행한다.
		System.out.println(list.size());
		
		
		
		
	}
}
