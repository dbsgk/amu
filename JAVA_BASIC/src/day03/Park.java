package day03;
//�ʵ�� getter/setter, equals �޼ҵ尡 �ִ� ParkDTO�޼ҵ�
public class Park {
	private String number;
	private int inTime;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	//equals()�޼ҵ��//�츮�� ���� Object Ŭ�����κ��� ����������.
	//�Ķ���ͷ� �Ѿ�� ��ü�� �� equals �޼ҵ带 �����ϴ� Park��ü�� ���Ѵ�.
	//���� ���� �Ķ���ͷ� �Ѿ�� ��ü�� Park Ŭ������ ��ü���� Ȯ���ϰ�
	//���� ParkŬ������ ��ü�� �´ٸ�
	//parkŬ������ ���������ȯ ���ش�.
	//�� ������� number�� �� �޼ҵ带 �����ϴ� Park ��ü�� number�� ���ؼ�
	//������ true, ������ �ϳ��� Ʋ���� false����.
	
	public boolean equals(Object o) { //�츮�� �������� equals�޼ҵ带 �����ؼ� �����.
		//���� ���� �Ķ���ͷ� �Ѿ�� Object��üo�� 
		//park Ŭ������ ��ü���� Ȯ���Ѵ�.
		//���⼭ java�� ������� instanceOf��� ���� ����ؼ� Ȯ���� �� �ִ�.
		if(o instanceof Park) {
			//���� o�� ParkŬ������ ��ü���?
			//�츮�� �ƹ��� �������� ����� ����ȯ�� ���ؼ� ���ο� park��ü�� ������ټ� �ִ�.
			Park p = (Park)o;
			if(this.number.equals(p.number)) {
				return true;
			}
		}
		return false;
	}
}
