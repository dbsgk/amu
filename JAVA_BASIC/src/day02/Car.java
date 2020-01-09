package day02;
//Ŭ������
//�ڹٿ����� ��� �͵��� Ŭ������ ��Ʈ���ϰ� �ȴ�.
//Ŭ���� ������ ��ü��� �θ���.
//Ŭ������ ������ �����ϴ� ������ field �� ����� method�� �̷����� �ȴ�.
public class Car {
	//field�� ����ó�� �����ϰ� �ȴ�.
	private int id;//������ȣ
	private String plateNumber;//��ȣ��
	private String color;//��������
	private String type;//��������
	//�������� carId,carPlateNumber, carColor, carType���� �̸� �����ߴµ� car��� Ŭ������ �������ν� �׷� �ʿ䰡 ��������.
	
	//method�����
	//method�� ���鶧���� 
	//����������(static) ���ϵ�����Ÿ�� �޼ҵ��̸�(�Ķ����)�� �����.
	//���������ڶ�? �ش� method�� ���� ������ �����ش� ex)public
	//static�̶�? �ش� method�� ��ü�� �ȸ��� ���� ���� �ְ� �Ϸ��� static�� �ٿ��ش�.Ex04�� ��������.
		//�ڹ� �޸𸮿��� heap, stack, method area
		//stack: �⺻�� ������Ÿ�Ե��� ���� (���� ��)
		//heap: ������ ������Ÿ�Ե��� �Ҵ� (�޸��ּҰ�)
		//method: static�̶�� �ٿ��� field�� method�� ���� �ȴ�.
	//���ϵ�����Ÿ���̶�? �޼ҵ尡 ����ɋ� ȣ��� ������ ������ �������� Ÿ���� ����.
		//���� ������Ÿ�԰��� ��쿡�� �⺻�� ������Ÿ��, ������ ������Ÿ��, void�� �����Ѵ�.
		//void(=������)��? �ش� �޼ҵ尡 ����� �� �ƹ��� ���� �������� �ʴ°��� ���Ѵ�. �ܵ� ����Ǵ� �޼ҵ忡 ���.
	//�޼ҵ��̸�-> �ҹ��ڷ� �����ϴ� ����
	//�Ķ���Ͷ�? �ش� �޼ҵ尡 ����Ǵµ� �ʿ�� �ϴ� �ܺΰ���.
		//�ٵ� �ܺο��� ������ ������ ������ �̸��� �Ķ������ �̸��� ���� �ʿ䰡 ����.
		//"65�� �Ʒú�"�̶�� �θ��ٰ��ص� ���翵�� ���翵�̵�
		//�޼ҵ� �ȿ����� �ش��ϴ� �Ķ���� �̸����� �Ҹ��ٰ� �ؼ� ������ �ٲ�°� �ƴϴ�.
	
	public void speedUp(int speed) {
		System.out.println(speed+"km���� �����մϴ�!");
		
	}
	//�����ڶ�?
	//�ش� ��ü�� �ʱ�ȭ�ɋ� ����Ǵ� Ư���� �޼ҵ�
	//��ü�� field������ �ʱ�ȭ�ϰų� �ٸ� �޼ҵ带 ȣ���ؼ� �ʿ��� �⺻�۾����� �����ϰ� �ȴ�.
	//�츮�� ���� ��������� �ʾƵ� �ڹٿ��� �⺻������ �������ִ� �����ڰ�
	//�ش� Ŭ���� ��ü�� �ʵ���� �ʱ�ȭ���ִµ� ������ ������Ÿ���� field�� null�� �ʱ�ȭ�ϰ�
	//�⺻�� ������Ÿ���� field�� 0���� �ʱ�ȭ�Ѵ�.
	
	//������ Ư¡
	//���� �Ķ���Ͱ� �ִ� ������'��' ������ָ�
	//�⺻�����ڿ� �Ķ���Ͱ� ���� �����ڴ� ���̻� ����� �� ���� �ȴ�.
	
	
	//�����ڼ����ϱ�; ����=�ʵ��� ���� �ʱ�ȭ;
	//Ŭ�����̸�(�Ķ����)
	public Car(int id, String color, String type, String plateNumber) {
		this.id =id;
		this.color=color;
		this.type=type;
		this.plateNumber=plateNumber;
	}
	public Car() {
		this.id =0;
		this.color="";
		this.type="";
		this.plateNumber="";
	}
	//���� 2���� ������ó��
	//�Ȱ��� �̸��� �޼ҵ����� �Ķ������ ������ �޶������ν� ���೻���� �ٸ����� ������ ���� �޼ҵ���� ����� �� �� �ִ�.
	//�̷��� ���� �����ε��̶�� �Ѵ�.(overloading)
	//���� ��ǥ���� ���� �����ε� �޼ҵ尡
	//�ٷ� System.out.println()�̴�.
	//println()�� �Ķ���Ͱ� ���� �޼ҵ�1��,int 1��, double 1��, float 1�� ... ��� 9���� ���ǵǾ� �ִ�.
	
	
	//(�����߶󳻱� ����Űã��)
	//������ ���̻� field���� public���� ���� �ʴ´�.
	//��? �ܺο��� �Ժη� ������ �� �ֱ� �����̴�.
	//������ method�鵵 Ŭ���� ���ο����� ���δٸ� public���� ���� �ʴ´�.
	
	//�ܺ��� ������ ���� ���ؼ��� ���������ڸ� �ٲ�����Ѵ�.
	//public - package(default) - protected - private
	// public: ��𼭵� ���ٰ���
	// package(default): �ƹ��͵� �������� ������ �ڵ����� default���������ڰ� �ɸ���. ��Ű��+��ӹ޴� Ŭ������ ���� ����.
	// protected: ��ӹ޴� Ŭ������ ���� ����
	// private: ��� �ܺ� ������ ���´�.(Ŭ���� ���ο����� ��밡���ϴ�)
	
	//������ ��� field���� private���������ڸ� �ٿ��ְ� �ȴ�.
	//������ ���� field���� private�� �Ǿ��� ������ ���̻� �ܺο��� ��ü�� �ʵ忡 ���� �ְų� ����� �� ���� �ȴ�.
	//�׷��ٸ� ��� �ؾ� ������ �ְų� ���� ������?
	//encapsulization(ĸ��ȭ)
	//��ü�� �ʵ带 �޼ҵ带 ���ؼ� �����ϴ� ���� ���Ѵ�.
	
	//ĸ��ȭ�� getter/setter�� �̷����ִ�.
	//getter�� ��ü�� ����� ���� ���� ����Ѵ�.
	//setter�� �ܺ��� ���� ��ü�� �����Ҷ� ����Ѵ�.
	
	//getter:public �ʵ��� ������Ÿ�� get�ʵ��̸�()
	//setter: public void set�ʵ��̸�(�ʵ嵥����Ÿ�� �ʵ��̸�)
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
		//���⼭ this�� �ش�޼ҵ带 �����ϴ� ��ü �ڽ��� ����;color����.
		//���� ���⼭ this�� �ٿ����� ������ �Ķ���ͷ� �Ѿ�� color�� ���ϱ� ������
		//�Ķ���� �÷��� �Ķ���� �÷��� ���� �����Ѵ�. -> �ƹ���ȭ�� ���� �ȴ�.
	}
	//id, type, plateNumber ĸ��ȭ�� �Ͻÿ�
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber=plateNumber;
	}
	
}
