package inheritance;

enum EnumColor2{
	//enum ��ȣ���� �����ʹ� �����ڷ� ���޵ȴ�.
	RED("����"),GREEN("�ʷ�"),BLUE("�Ķ�"),MAGENTA("����");
	
	private String colorName;
	
	//public EnumColor2(String coloName){ //���⿡ public ���̸� ������. private, default�� ����.
	//�̰� �����ϴ°� �ƴϰ�.. �׳� ������ �ϴ°Ŷ�? 
	EnumColor2(String coloName){
		this.colorName = coloName;
	}
	public String getColorName() {
		return colorName;
	}
}
public class EnumMain2 {
	public static void main(String[] args) {
		System.out.println(EnumColor2.RED);
		System.out.println();
		for(EnumColor2 data : EnumColor2.values()) {
			System.out.println(data+"\t"+data.ordinal()+"\t"+data.valueOf(data+"")+"\t"+data.getColorName());
		}
	}
}
