package day03;

import java.sql.Connection;

public class OracleConnectionMaker implements ConnectionMake {

	@Override
	public Connection makeConnection() {
		System.out.println("���� Oracle DB�� ���� ����");
		return null;
	}

}
