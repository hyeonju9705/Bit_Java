package bit_java1103;

public class Book {
	String title;
	String author;
	int ISBN;
	
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("매개변수 3개 생성자 호출됨");
	}
	public Book(String title, int ISBN) {
//		this.title = title;
//		this.ISBN = ISBN; 이렇게 할수도 있지만 보통은 밑에처럼 씀
		this(title,null,ISBN); // 이렇게할 때는 절대적으로 첫번쩨 라인에서 사용해야함
		System.out.println("매개변수 2개 생성자 호출됨");
	}
	public Book() {
		this(null, null,0); //굳이 작성안해도되지만 연습삼아 하는것...
		System.out.println("기본 생성자 호출됨");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("날개","이상", 3333);
		Book b2 = new Book("성경", 1111);
		Book b3 = new Book();
		
	}

}
