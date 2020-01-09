package class_1;
//클래스 setter/getter 연습
class BookShop{
	private String bookName,author;
	private int price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
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
public class Practice1 {

	public static void main(String[] args) {
		BookShop[] book = new BookShop[2];
		
		
		book[0]=new BookShop();
		book[0].setBookName("자바완성");
		book[0].setAuthor("김완성");
		book[0].setPrice(25000);
		
		book[1]=new BookShop();
		book[1].setBookName("JSP잡기");
		book[1].setAuthor("송JP");
		book[1].setPrice(35000);
			
		for(BookShop data:book) {
			System.out.println("책이름: "+data.getBookName()+"\n저 자: "+data.getAuthor()+"\n가격: "+data.getPrice()+"원");
			System.out.println();
		}
		
		
		
	}

}
