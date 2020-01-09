package abstract_1;
//추상메소드 필요조건
//1. 키워드: abstract
//2. 클래스: abstract class 

//추상클래스
//추상클래스는 new생성이 불가능하다.
//+ 추상메소드는 추상클래스여야만 하지만, 추상클래스에 추상메소드가 꼭 있어야 할 필요는 없다.
public abstract class AbstractTest {
	String name;

	public String getName() {//구현
		return name;
	}
	public abstract void setName(String name);
	//추상메소드: 앞으로 이런 메소드를 만들것이다. 생길지 안생길진 모름.
	
}//AbstractTest
