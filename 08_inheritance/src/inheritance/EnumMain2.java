package inheritance;

enum EnumColor2{
	//enum 괄호안의 데이터는 생성자로 전달된다.
	RED("빨강"),GREEN("초록"),BLUE("파랑"),MAGENTA("보라");
	
	private String colorName;
	
	//public EnumColor2(String coloName){ //여기에 public 붙이면 에러뜸. private, default만 가능.
	//이건 공개하는게 아니고.. 그냥 나열만 하는거라서? 
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
