package nested;

public class AbstractMain{
	public static void main(String[] args){
		AbstractTest at = new AbstractTest() {//�̳�Ŭ����1
			
			@Override
			public void setName(String name) {
				this.name = name;
			}//setName
		};
		//new AbstractTest() {}; ��Ӿ��ϰ� �͸��̳�Ŭ������ �������̵常�ؼ� �߻�Ŭ���� ������ ��.
		
		InterA aa = new InterA() {//�̳�Ŭ����2
			
			@Override
			public void bb() {
				
			}
			
			@Override
			public void aa() {
				
			}
		};
		//�������̽��� new�ȵǼ� �͸��̳�Ŭ������ new�ؼ� ���.(new�� ������ Ŭ������ ����)
		//*�������̽��� new�����Ȱ� ���� �ƴ�!!!!!!! new�͸�Ŭ����*
		
		AbstractExam ae = new AbstractExam() {};//�̳�Ŭ����3
		//�߻�Ŭ������ ���� ȥ�� new�� �� ���µ� �ڿ� �͸�Ŭ������ ������.
		//AbstractExam Ŭ�������� abstract method�� ��� ���� ���ϴ� method��
		//'����������' override�� �� ����.
		
	}//main

}//class
