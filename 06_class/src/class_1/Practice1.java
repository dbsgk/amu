package class_1;
//Ŭ���� setter/getter ����
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
		book[0].setBookName("�ڹٿϼ�");
		book[0].setAuthor("��ϼ�");
		book[0].setPrice(25000);
		
		book[1]=new BookShop();
		book[1].setBookName("JSP���");
		book[1].setAuthor("��JP");
		book[1].setPrice(35000);
			
		for(BookShop data:book) {
			System.out.println("å�̸�: "+data.getBookName()+"\n�� ��: "+data.getAuthor()+"\n����: "+data.getPrice()+"��");
			System.out.println();
		}
		
		
		
	}

}
