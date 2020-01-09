package class_2;

public class FruitMain_t {

	public static void main(String[] args) {
		Fruit_t[] fm = new Fruit_t[3];//Fruit방 만들어놓고
		fm[0] = new Fruit_t("사과",100,80,75);//객체
		fm[1] = new Fruit_t("포도",30,25,10);
		fm[2] = new Fruit_t("딸기",25,30,90);
		
		System.out.println("---------------------------------");
		System.out.println("PUM \tJAN \tFEB \tMAR \tTOT");
		System.out.println("---------------------------------");
		for(Fruit_t f: fm) {
			f.calc();
			f.disp();
		}
		System.out.println("---------------------------------");
		Fruit_t.output();
	}//main

}//FruitMain
