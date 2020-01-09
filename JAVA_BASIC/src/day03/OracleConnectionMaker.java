package day03;

import java.sql.Connection;

public class OracleConnectionMaker implements ConnectionMake {

	@Override
	public Connection makeConnection() {
		System.out.println("대충 Oracle DB랑 연결 성공");
		return null;
	}

}
