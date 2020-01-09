package Poly;

import java.sql.Connection;


public class PolyEx {
	Connection conn;
	public PolyEx(ConnectionMaker c) {
		conn = c.makeConnection();
	}
	public static void main(String[] args) {
	
		ConnectionMaker c = new MySqlConnectionMaker();
		PolyEx p = new PolyEx(c);//실행시키면 이거가 connection땡겨움.
		//c를 polyEx에서 가져다 쓰는 것.
	}
}
