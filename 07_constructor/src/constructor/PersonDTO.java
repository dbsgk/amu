package constructor;
/*

Ŭ�� ȸ������ ���α׷� �ۼ�
����� ������� �������� ȸ���� �� 5������ �Ѵ�
ȸ���� ������ �̸�, ����, �ڵ���, �ּҷ� �����Ѵ�
ȸ�� ����, ����, ��� ���α׷��� �ۼ��Ͻÿ�
������ �޼ҵ�� �����Ͻÿ�

[������]
menu()
*************
   1. ����
   2. ���
   3. ����
   4. Ż��
   5. ������
*************
  ��ȣ : 

[1�� ���]
insert()
5���� ������ �� á���ϴ�...//5���� �� ���� 
----------------------
�̸� �Է� :
���� �Է� :
�ڵ��� �Է� :
�ּ� �Է� :

1 row created
xx�ڸ� ���ҽ��ϴ�

[2�� ���]
list()
�̸�	����	�ڵ���		�ּ�

[3�� ���]
update()
�ڵ��� ��ȣ �Է� : 010-123-1234
ȫ�浿	25	xxx	xxx

���� �� �̸� �Է� : 
���� �� �ڵ��� �Է� : 
���� �� �ּ� �Է� : 

1 row(s) updated
--------------------
�ڵ��� ��ȣ �Է� : 010-123-1235
ã�� ȸ���� �����ϴ�

[4�� ���]
delete()
�ڵ��� ��ȣ �Է� : 
1 row deleted

�ڵ��� ��ȣ �Է� : 
ã�� ȸ���� �����ϴ�*/

public class PersonDTO {
	private String name;
	private int age;
	private String phone_number;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PersonDTO(String name, int age, String phone_number, String address) {
		this.name=name;
		this.age=age;
		this.phone_number = phone_number;
		this.address = address;
	}
	public PersonDTO() {}
}//class