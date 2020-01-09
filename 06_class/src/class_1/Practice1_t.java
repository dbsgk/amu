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
		aa.setBookName("자바완성");
		aa.setAuthor("김완성");
		aa.setPrice(25000);
		
		System.out.println("책이름: "+aa.getBookName());
		System.out.println("저   자: "+aa.getAuthor());
		System.out.println("책가격: "+aa.getPrice());

		BookShop1 bb = new BookShop1();
		bb.setBookName("JSP잡기");
		bb.setAuthor("김JP");
		bb.setPrice(35000);
		
		System.out.println("책이름: "+bb.getBookName());
		System.out.println("저   자: "+bb.getAuthor());
		System.out.println("책가격: "+bb.getPrice());

	}

}
