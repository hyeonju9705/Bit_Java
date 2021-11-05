package Homework;

import java.util.Scanner;

class Author{
	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name; //������ �̸��� �����´�
	}
	public String getEmail() {
		return email; //�̸����� �����´�
	}
	public void setEmail(String email) {
		this.email=email; //�̸����� �������ش�
	}
	public String getGender() {
		return gender; //������ �����´�
	}
	public String toString() {
		return String.format("Author[name=%s, email=%s, gender=%s]", getName(),
				getEmail(), getGender()); //author �ʵ� ���� ���
	}
}

class Book{
	private String title;
	private Author author; //author�̶�� Ŭ������ �����ϴ°��� ���⼭ �������ֹǷ� �츮�� �� ��ü�� author.~�� �� �� ����
	private double price;
	private int qty; //����
	
	public Book(String title, Author author, double price, int qty) {
		this.title=title;
		this.author=author; 
		this.price = price;
		this.qty = qty;
	}
	public String getTitle() {
		return title; //å ���� ��������
	}
	public Author getAuthor() {
		return author; //author class ��������
	}
	public double getPrice() {
		return price; //���� ��������
	}
	public void setPrice(double price) {
		this.price=price; //���� �����ϱ�
	}
	public int getQty() {
		return Math.round(qty*10)/10; //���� ��������
	}
	public void setQty(int qty) { //���� �����ϱ�
		this.qty=qty;
	}
	public String toString() { //book���� ���
		return "Book[name="+getTitle()+", "+author.toString()+
				" price="+getPrice()+ ", qty="+getQty()+ "]";
	}
}
public class AuthorEx {

	public static void main(String[] args) {
		// ��ü ���� ���� qty
		// �����Ű�� �޴��� ���.
		// 5���� �޴� ���� �ʼ�
		// 1. �������� �Է�(�۰�����������)
		// 2. 
		// 3. å���ִ��������� Ȯ�� ,�ִٸ� ��� (���� �Է¹���)
		// 4. ���� ������ Ȯ���ϴµ� (�����۰�����/������������) ���·� ���
		// 5. ���α׷� ����
		
		//while�� �ȿ� �޴�����ִ°� ������ҵ�
		// �޴������� switch��
		// class 2�� ������ ��������

		
//		int index=0;
//		Book[] bArray = new Book[20];
		
		Scanner scan = new Scanner(System.in); //��ĳ�� ����
		int menu =0; //����ڰ� ������ �޴� ��ư
		int count =0; //��� while���� ������ while�� �ȿ��� 1���� ������ �迭�� ������ ������ count�� ió�� ����ؼ� �迭�� �־��ִ°���. 
		// count�� �ᱹ �迭�� length�ε� ��밡����
		Book[] bookArr=new Book[20];
		
		BREAK: // ���α׷� ����� ���ѷ��� Ż�� : ��
		while(true) {
			System.out.println("1. ���� ���� �Է� | 2. ���� ��� ���� | 3. �˻��ϱ�(����) |"
					+ "4. ��������(�����۰�����/������������) | 5. ���α׷� ����");
			menu = scan.nextInt(); //�޴� ���ڷ� �Է¹���
			
			switch(menu) {
			case 1: //���������Է�
				System.out.println("å����, ����, �̸���, ����, ����, ���� ������ �Է��Ͻÿ� -->>");
				//�迭�� ����
				bookArr[count]= new Book(scan.next(), 
							new Author(scan.next(),scan.next(),scan.next()),
							scan.nextDouble(),scan.nextInt()); // å������ book Ŭ���� �ʵ忡�־ �Է¹�����, ����,�̸���,������ authorŬ������ �־
				//author�� new�� ����. �׸��� ����,������ �Է¹���
				count++; // 1 ������ �� �ѹ��� �Է¹ޱ⶧���� count++���ڸ��� �ٷ� break ���ư���
				break;
			case 2:	 // ���� ��� ���� --> ����� ���� �ҷ��ͼ� ���
				for(int i =0; i<count; i++) { //count�� �迭�� lengthó���Ʊ⶧���� count�� ���
				System.out.println(bookArr[i].toString()); //�迭 i���� �� �ݺ������� ������� (��������� ���ߵǹǷ�)
				}
				break;
			case 3:	// �˻��ϱ�
				System.out.println("������ �Է��ϼ��� -->> ");
				String titleInput = scan.next(); //�˻��� ���̶� ���� �ִ� å�� �����̶� ���ؾߵǹǷ� �˻��� ���� �Է¹��� ���� ����
				for(int i=0; i<count; i++) {
					if (titleInput.equals(bookArr[i].getTitle())) { //���ڿ��� ���ؾߵǴϱ� equals���, �Է¹��� ������ ��ü�����߿��� å �̸��� �� ��������ϹǷ�
						//bookArr[i].getTitle()���
					System.out.println(bookArr[i].toString()); //titleInput�� ���� �迭�ȿ��ִ� å�̸��� ��ġ�Ѵٸ� å ������ ������ش�!
					}
				}
				break;
			case 4:	 //��������(�����Ǽ�/��ü�Ǽ�)
				int numberOfFemale=0; //���� �Ǽ��� �ϴ� ������ְ� 0���� �ʱ�ȭ��
				for(int i=0; i<count; i++) {
					if (bookArr[i].getAuthor().getGender().equals("f")) { //author�� gender�� �� �ٸ��⶧���� bookArr�� ���ڸ� �������ִµ� gender�� author class���� �����Ƿ�
						//getGender()�� �ʿ���. ���Ŀ� equals�� �������� ǥ���ϴ� f�� ��!
						numberOfFemale++; // �����ϴٸ� ++���༭ �� �÷���
					}
				}
				System.out.println("�����۰�����/�Ѻ������� : ("+numberOfFemale+"/"+
				count+")"); //for���� ���� �Ŀ� ���� �Ǽ��� ��������.
				break;
			case 5:	//���α׷� ����
				break BREAK;
			}
		}
	}

}
