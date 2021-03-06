package inheritance;
//instanceOf: 오른쪽 값을 왼쪽으로 넣을 수 있는 지 확인.
class AAA{}
class BBB extends AAA{}

public class InstanceOf {
	public static void main(String[] args) {
		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB(); //BBB생성, AAA를 참조
		
		AAA aa3 = aa; //주소값 넘겨주는 것(같은 타입끼리)
		if( aa instanceof AAA) System.out.println("1. TRUE");//aa를 bb에 넣기 전에 aa가 bb의 타입인 AAA의 instance인지 먼저 확인. 
		else System.out.println("1. FALSE");
		
		AAA aa4 = bb; //부모=자식(부모는 모든 자식을 참조할 수 있다.)
		if(bb instanceof AAA)System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		//자식=(자식)부모 
		//error//BBB bb2 = (BBB)aa; //불가능; 아아예 BBB클래스가 없음.
		if(aa instanceof BBB)System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
		BBB bb3 = (BBB)aa2; //가능; aa2는 BBB클래스 존재하는데 그동안 AAA만 참조했던 것.
		if(aa2 instanceof BBB)System.out.println("4. TRUE");
		else System.out.println("4. FALSE");
		
		
	}

}
