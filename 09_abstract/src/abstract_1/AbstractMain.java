package abstract_1;

public class AbstractMain extends AbstractTest {

	//�߻�Ŭ���� ��ӹ����� ������ �߻�޼ҵ� �������̵� �������.
	//�������̵� �ϱ� ������ ���ε� abstract class���ָ� ��. 
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		//�߻�Ŭ������ new������ �Ұ����ϴ�.
		//AbstractTest at = new AbstractTest();
		AbstractTest at = new AbstractMain();//�ڽ��� �θ𲨵� ����.
		at.setName("ȫ�浿");//ȣ��: at�� �θ�� setName �������̵��ؼ� �ڽĲ� �θ�.
		System.out.println("�̸� = "+at.getName());
	}
}
