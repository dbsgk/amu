package interface_1;

//public class InterMain implements InterA, InterB{
public class InterMain implements InterC{
	public static void main(String[] args) {
		
	}//1,2,4,6,8
	//������ ���ƾ� extends���� 
	//1,2,8
	//6 : implements �籸���ϰڴ�. �׷��� class���� �Ѵ�. class B implements InterA 
	@Override
	public void aa() {}

	@Override
	public void bb() {}

	@Override
	public void cc() {}

	@Override
	public void dd() {}

}
