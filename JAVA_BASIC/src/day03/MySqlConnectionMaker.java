package day03;
//��¥ �ڵ常��°� ����
import java.sql.Connection;

//�������̽� ����� extends�� �ƴ� implements��� ��ɾ�� �̷����� �ȴ�.
//�������� add unimplement methodŬ��
public class MySqlConnectionMaker implements ConnectionMake{

	@Override
	public Connection makeConnection() {
		// MySql�� ����� �����ϴ� �ڵ尡 ����� ���� �ȴ�!
		//PolyEx.java�� insert�� �ִ� Connection ��ü�� �����ϴ� �ڵ带 ���⿡ �ִ´�!
		System.out.println("���� MySql�̶� ������");
		return null;
	}

}
