package day03;
//����å�ӿ�Ģ�� ����
//���� Ŭ�������� �и��غ��ô�.

import java.util.Scanner;

//MVC�����̶�?
//�ܼ��� �ϳ��� ū Ŭ������ ��Ʈ���ϴ� ���� �ƴ϶�
//Model - Viewer - Controller�� �и��ؼ�
//���������� ���� �� �� �ְ� ������Ʈ�� ����� ����������

//DTO(VO): ������ ���� Ʋ(�ʵ�, ���ͼ���, equals, toString() ������ ���� ����) = Model
//Controller: �����͸� DTO�� insert, delete, update, select, selectAll �Ҷ� ���; �츮�� ������ ��� �갡 �ʵ� ������ ���� ����;
//Viewer: ȭ�鿡 ����� ���

public class ParkEx04 {
	public static void main(String[] args) {
		ParkController controller = new ParkController();
		Scanner scan = new Scanner(System.in);
		ParkViewer viewer = new ParkViewer();
		viewer.showMenu(controller, scan);
		
		scan.close();
	}
}
