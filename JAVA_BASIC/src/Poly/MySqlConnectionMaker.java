package Poly;

import java.sql.Connection;

public class MySqlConnectionMaker implements ConnectionMaker {

	@Override
	public Connection makeConnection() {
			System.out.println("mysql���濬��");
		return null;
	}

}
