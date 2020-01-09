package nested;

public abstract class AbstractTest {
	String name;
	
	public abstract void setName(String name);
	//interface에는 전부 abstract라서 키워드 생략가능
	
	public String getName() {
		return name;
	}
}
