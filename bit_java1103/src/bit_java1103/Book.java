package bit_java1103;

public class Book {
	String title;
	String author;
	int ISBN;
	
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("�Ű����� 3�� ������ ȣ���");
	}
	public Book(String title, int ISBN) {
//		this.title = title;
//		this.ISBN = ISBN; �̷��� �Ҽ��� ������ ������ �ؿ�ó�� ��
		this(title,null,ISBN); // �̷����� ���� ���������� ù���� ���ο��� ����ؾ���
		System.out.println("�Ű����� 2�� ������ ȣ���");
	}
	public Book() {
		this(null, null,0); //���� �ۼ����ص������� ������� �ϴ°�...
		System.out.println("�⺻ ������ ȣ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("����","�̻�", 3333);
		Book b2 = new Book("����", 1111);
		Book b3 = new Book();
		
	}

}
