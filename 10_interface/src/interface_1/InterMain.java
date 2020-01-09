package interface_1;

//public class InterMain implements InterA, InterB{
public class InterMain implements InterC{
	public static void main(String[] args) {
		
	}//1,2,4,6,8
	//양쪽이 같아야 extends가능 
	//1,2,8
	//6 : implements 재구현하겠다. 그래서 class여야 한다. class B implements InterA 
	@Override
	public void aa() {}

	@Override
	public void bb() {}

	@Override
	public void cc() {}

	@Override
	public void dd() {}

}
