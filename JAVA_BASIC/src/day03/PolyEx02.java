package day03;
//����� ������ ��.
import java.sql.Connection;

//�������̽� ��Ӱ� ������ ����(Defendency Injection)
//�������� �̷��� ���� �� ��������!

//�̹� ������ Database�� ����� �ϴ� Ŭ������ ����
//�� Ŭ������ �� Ư�� �����ͺ��̽��� �������� ���谡 �ƴϰ� ����� ����
public class PolyEx02 {
	Connection conn;//���� �갡 �����ִ°�
	public PolyEx02(ConnectionMake c) {
		conn = c.makeConnection();
	}
	
	public static void main(String[] args) {
		//���� ������!
		//�������̽� ��ü�� ��ӹ޴� �ڽ� Ŭ������ �����ڷ� �ʱ�ȭ�� �����ϴ�.
		ConnectionMake c = new MySqlConnectionMaker();
		//ConnectionMake c = new OracleConnectionMaker();�ϸ� �ٷ� ����Ŭ�� �����
		//���� �������̽� ��ӹ����Ŷ� 
		//�������̽��� �ڽ�Ŭ������ Ŭ������ �����ڷ� ����� ����.
		PolyEx02 p = new PolyEx02(c);
	}
	
}
