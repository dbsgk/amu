package Poly;

import java.sql.Connection;


public class PolyEx {
	Connection conn;
	public PolyEx(ConnectionMaker c) {
		conn = c.makeConnection();
	}
	public static void main(String[] args) {
	
		ConnectionMaker c = new MySqlConnectionMaker();
		PolyEx p = new PolyEx(c);//�����Ű�� �̰Ű� connection���ܿ�.
		//c�� polyEx���� ������ ���� ��.
	}
}
