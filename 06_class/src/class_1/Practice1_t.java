package class_1;

class BookShop1{
	private String bookName,author;
	private int price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		System.out.println("this = "+this);
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Practice1_t {

	public static void main(String[] args) {
		
		BookShop1 aa = new BookShop1();
		aa.setBookName("�ڹٿϼ�");
		aa.setAuthor("��ϼ�");
		aa.setPrice(25000);
		
		System.out.println("å�̸�: "+aa.getBookName());
		System.out.println("��   ��: "+aa.getAuthor());
		System.out.println("å����: "+aa.getPrice());

		BookShop1 bb = new BookShop1();
		bb.setBookName("JSP���");
		bb.setAuthor("��JP");
		bb.setPrice(35000);
		
		System.out.println("å�̸�: "+bb.getBookName());
		System.out.println("��   ��: "+bb.getAuthor());
		System.out.println("å����: "+bb.getPrice());

	}

}
