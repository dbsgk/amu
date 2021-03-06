package collection;

public class GenericTest2<T>{
	private T a;
	
	public GenericTest2(T a){
		this.a = a;

	}
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("홍길동");  //()가 생성자
		//생성은 String으로 했지만 method안에서는 Object로 작동해라.
		//<?>를 사용할 경우 모든 것을  Object로 인식해서 생성자를 통해서만 입력가능
		//aa.setA("홍길동"); <--error 
		String name = (String)aa.getA();
		System.out.println("이름 = "+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25); 
		int age = (Integer)bb.getA();//unAutoBoxing
		System.out.println("나이 = "+age);
	}
}
