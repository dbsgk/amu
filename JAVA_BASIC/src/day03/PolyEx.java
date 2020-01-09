package day03;
//�� Ŭ������ ��ü�������α׷����� ��Ģ �� �ϳ���
//���� å�� ��Ģ�� ��Ű�� ����
//Tightly Coupled System�� ���°� �� �����ڵ��� ����.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PolyEx {
	String title;
	String content;
	//�����ͺ��̽��� ������ ������
	//�ش� �����ͺ��̽��� �ڹ� Ŀ����Ŭ������ �ܺζ��̺귯�� �߰����ش�.
	//�����ͺ��̽� ��ſ��� �ʿ��Ѱ�
	//�ּ�, ���̵�, ��й�ȣ
	//�׸��� �ܺ� �ڹ� Ŀ���� Ŭ���� �ε�
	public void insert() {
		//�����ͺ��̽��� ���̺� ����ڷκ��� �Է¹��� ���� �Է��ϴ� �޼ҵ�
		
		String addr = "jdbc:mysql://localhost:8080/�����ͺ��̽��̸�";//�������
		String id = "root";
		String pw = "��й�ȣ";
		
		//�ܺ�Ŭ������ ���� �ش� ����̹��� ����Ѵ�.
		//������ �Ʒ� �ڵ�� "����̹��� ã�� �� ����" �̶�� ���ɼ��� �����ϱ� ������
		//Exception ó���� �ؾ��Ѵ�.
		
		//Exception ó���ϴ� 2���� ���
		//1. �ش� �޼ҵ尡 �̷��� Exception�� �߻��Ҽ� �ִ�! ��� �˷��ֱ⸸ �ϴ� ����� �ִ�.
		//2. �ٸ� ����� try/catch���� �̿��ؼ� �ش�Exception�� �߻��ϸ� Ư���ൿ���ض�
		//��� �����ִ� ����� �ֽ��ϴ�.
		
		
		try {
			Class.forName("org.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(addr, id, pw);//add exception to existing catch clause Ŭ��.
			//������� mysql������ ���� �ܴ��ϰ� ���յ� ����(�ϵ��ڵ�)����Ŭ�� �ٲ۴��ϸ� �ٽ� �� �ٲ������.
			//Single responsability(Ŭ������ �Ѱ����� å��;����å�ӿ�Ģ)-������� ��길, ui����� ui��
			//SOLID
			String query = "INSERT INTO ���̺�� VALUES(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			//pstmt.setString(1, p.title);
			//pstmt.setString(2, p.content);//�����͸� Ŭ������ �ٲ��ִ� ��, �������ְ�޴°�, DTO���� ���, 
			pstmt.execute();
			
		} catch (ClassNotFoundException | SQLException e) {//SQLException�� �߻��Ҽ� �ִ�, �׷��� ����ִ°�(�Ƹ�?)
			// TODO Auto-generated catch block
			System.out.println("������ ������ �ֽ��ϴ�.");
			System.out.println("Ȩ����");
			//e.printStackTrace(); �̰� ����ڰ� ���� �ȵȴ�. ��� ������ �����ִٴ� �޼��� print�ؾ���.
		}//Class.forName("org.mysql.cj.jdbc.Driver");����̹��� �ٿ�ȹ޾Ƽ� ������.���콺 �÷��� try/catchŬ��
		
		
	}
	//�����ͺ��̽��� ����ϴ� �޼ҵ���� ������� �̸��� ���ϵǾ��ִ�.
	//�Է��Ҷ� insert, �����Ҷ� update, �����Ҷ� delete
	//����� �ҷ��ö� selectAll, ��ü �ϳ��� �ҷ��ö� select
	//DTO Ȥ�� VO Ŭ������ ��Ƽ� ����ڿ��� �ϳ��� �ҷ��ö� ����ϴ°�.
	public static void main(String[] args) {
		PolyEx p = new PolyEx();
		p.insert();
		
	}
}
