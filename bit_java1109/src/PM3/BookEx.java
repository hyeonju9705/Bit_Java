package PM3;

import java.util.HashSet;

class Book{
	int id;
	String title;
	String author;
	int quantity;
	
	public Book(int id, String title, String author, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}
	
	
}
public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> set = new HashSet<Book>();
		set.add(new Book(100, "�����", "�߶��㺣��",5));
		set.add(new Book(200, "�ູ�ѿ���", "����ī���ϵ�",10));
		set.add(new Book(300, "�ȷ�Ȩ��", "�ڳ�����",8));
		for(Book book : set) {
			System.out.printf("%d %s %s %d\n", book.id,book.title,book.author,book.quantity);
		}
	}

}
