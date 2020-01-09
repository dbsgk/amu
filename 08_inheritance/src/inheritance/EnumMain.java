package inheritance;

//class EnumColor{
//	static final String RED = "빨강";
//	static final String GREEN = "초록";
//	static final String BLUE = "파랑";
//	static final String MAGENTA = "보라";
//}
enum EnumColor{//열거형; 변수를 설정하는게 아니라 그냥 나열만 하는거라서 세미콜론 안찍어도 됨.
	RED,GREEN,BLUE,MAGENTA //하나의 상수값으로 쓰겠다고 선언하는거임
}
//------------------------
public class EnumMain {
	String colorName;
	EnumColor color;
	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		EnumMain em = new EnumMain();
		em.colorName = "빨강";
		em.color = EnumColor.RED;
		System.out.println(em.colorName+"\t"+em.color);
		System.out.println();
		
		em.colorName = "보라";
		EnumColor VIOLET = EnumColor.MAGENTA;
		System.out.println(em.colorName+"\t"+VIOLET);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data+"\t"+data.ordinal()+"\t"+data.valueOf(data+""));
		}
	}
}
