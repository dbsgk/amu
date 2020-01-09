package Poly;

import java.sql.Connection;

public class MySqlConnectionMaker implements ConnectionMaker {

	@Override
	public Connection makeConnection() {
			System.out.println("mysql대충연결");
		return null;
	}

}
