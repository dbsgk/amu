package day02;
//ArrayList
//=�ּҰ��� ��Ʈ�� �ؼ� �迭ó�� �����س��� Ŭ����
//��������� �ּҰ�, ��������� �ּҰ��� �����ؼ� ���� ������
//�迭�� ������Ÿ���� ��Ƴ�����
//ArrayList�� template�� �ش��ϴ� Ŭ���� ������ �޾Ƶ��� �� �ִ�.
//������ �⺻�� ������Ÿ�Կ��� �ּҰ��� ���µ� ��� �ؾ� �ұ�?
//���� wrapper class��� �Ҹ��� �⺻�� ������Ÿ���� Ŭ������ �����س��� Ŭ������ ����ϸ� �ȴ�.
//int-> Integer 
import java.util.ArrayList;
public class Ex08 {
	public static void main(String[] args) {
		//int�� ����(����)Ŭ���� Integer
		//ArrayList�� ���鶧����<>(template)�ȿ� � Ŭ������ ������ ��������Ѵ�.
		//���� Integer�� ���� �ش� ArrayList�� Integer'��' ��Ʈ���Ҽ��ִ�.
		ArrayList<Integer> list = new ArrayList<>(); //���� ArrayList�� Integer��� ���ø��� ���� �ִ�.
		//���� �־��� ������ Integer��ü�� �־���� �Ѵ�.
		//������ �Ϲ����� ���ڰ��� ���� ���� ������
		//���� Integer �� �ƴ� �ٸ� ��ü��� ��ü�� ���� �߰������ �Ѵ�.
		Integer i = 5;
		Integer i2 = new Integer(6);
		Integer i3 = new Integer("18");
		
		//list�� �߰��� ������ add method�� ����ؼ� �߰����ش�.
		list.add(i);
		list.add(i2);
		list.add(i3);
		list.add(1114);//get(3) 3��°
		int i4 = 123;//Integer�� int�� �߰��ϸ� ���� �� �ٲ��ٰ� �ϸ鼭 �ٲ��ش���.
		list.add(i4);
		
		//list���� ���� �ҷ��ö����� -> �迭[�ε�����ȣ]ó��
		//get �޼ҵ带 ����Ѵ�.
		System.out.println(list.get(3));//1114���
		
		System.out.println("-----remove��----");
		for(Integer num:list) {
			System.out.println(num);
		}
		
		//list���� ���� �����Ҷ����� remove�޼ҵ带 ����Ѵ�.
		//������ �Ҷ� 2���� ���
		//1. �ش��ϴ� ��ü�� �Ѱܼ� �����ϴ� ���
		//2. �ش��ϴ� ��ġ�� �����ϴ� ���
		
		//���������� i�� �Ѱ��ָ� ����Ʈ�� equals()��� �޼ҵ带 �����ؼ�
		//2���� ��ġ�ϴ� �޼ҵ带 �����Ѵ�. ��! �Ķ���ͷ� �Ѿ�� ���� Ŭ������ ��ü�� ���.
		//������ �츮�� Integer�� �ٷ�� ������ int������ ������ �Ϸ��� �ϸ�
		//������ �����! -> int i4�� 124fksms rkqtdmf rkwrh dlTrh
		//�츮 list���� 124��° ��Ұ� �������� �ʱ� ����
		//���� Integer�� template�� ��쿡�� �����ϰ�
		//Integer ��ü�� ��Ʈ�� �ϰų� Ȥ�� index��ȣ�� �����ؾ��Ѵ�.
		list.remove(i);//i4������ ��������.int�ϱ� 3(�ε�����ȣ)�� ������ �����۵�.
		
		System.out.println("---remove ��---");
		for(Integer num:list) {
			System.out.println(num);
		}
		
		//���� �ش��ϴ� ��ġ��, ���ϴ� ������ �ٲ��ַ���
		list.set(2, 98);
		System.out.println(list.get(2));
		
		//����Ʈ�� ���ϴ� ��ġ�� ���ο� ���� �߰����ָ�
		//�ش� ��ġ�� ������ ���Ŀ� �ִ� ��ҵ���
		//��ĭ�� �ڷ� �з����� �ȴ�.
		
		System.out.println("----add(�ε�����ȣ, ���)������----");
		for(Integer num: list) {
			System.out.println(num);
		}
		list.add(0,500);
		
		System.out.println("---add(�ε�����ȣ, ���)������---");
		for(Integer num: list) {
			System.out.println(num);
		}
		
		//ArrayList���� indexOf
		//�ش��ϴ� ��Ұ� �ε��� ��ȣ ����� �ִ��� �����ݴϴ�.
		//���� �ش��ϴ� ��Ұ� list�� ������? -1 
		//��� �ڿ���(0���͸����)�� ������ �� �ִµ� -1�� �����Ҽ� ���� ���� -1 ���ϵ�
		System.out.println("---");
		System.out.println(list.indexOf(98));//3
		System.out.println(list.indexOf(87854465));//-1
		
		//ArrayList���� contains��� �޼ҵ尡 �ֽ��ϴ�.
		//list�� �Ķ���ͷ� �Ѿ�� ��ü�� �����ϴ��� ���ϴ��� üũ�մϴ�.
		//�����ϸ� ture, �������� ������ false�� �����մϴ�.
		System.out.println(list.contains(98));//t
		System.out.println(list.contains(-33));//f
		
		//list�� ��� ��Ұ� �����ϴ��� Ȯ���Ҷ�����
		//�迭������ length��� �ʵ带 Ȯ��������
		//list������ size()�޼ҵ带 �����Ѵ�.
		System.out.println(list.size());
		
		
		
		
	}
}
