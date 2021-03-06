package nested;

public class AbstractMain{
	public static void main(String[] args){
		AbstractTest at = new AbstractTest() {//이너클래스1
			
			@Override
			public void setName(String name) {
				this.name = name;
			}//setName
		};
		//new AbstractTest() {}; 상속안하고 익명이너클래스로 오버라이드만해서 추상클래스 가져다 씀.
		
		InterA aa = new InterA() {//이너클래스2
			
			@Override
			public void bb() {
				
			}
			
			@Override
			public void aa() {
				
			}
		};
		//인터페이스는 new안되서 익명이너클래스로 new해서 사용.(new는 언제나 클래스만 가능)
		//*인터페이스가 new생성된게 절대 아님!!!!!!! new익명클래스*
		
		AbstractExam ae = new AbstractExam() {};//이너클래스3
		//추상클래스는 절대 혼자 new할 수 없는데 뒤에 익명클래스가 도와줌.
		//AbstractExam 클래스에는 abstract method가 없어서 내가 원하는 method만
		//'선택적으로' override할 수 있음.
		
	}//main

}//class
