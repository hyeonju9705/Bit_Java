package Exam;

import java.util.Scanner; //���ɾ������¥ ���� 4:11���� �����

class Customer{
	private int id; //�� ���̵�� 1~3
	private String name; 
	private int discount;
	
	public Customer(int id, String name, int discount){
		this.id=id;
		this.name=name;
		this.discount = discount;
		}
	public int getId() {
		return id;
	}
	public  String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public String toString() {
		return String.format("%s(%d)", name, id);
	}
}
class Invoice{
	private int id;
	private Customer customer; // customer Ŭ������ ������ �����մ°���!!
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		this.id=id; //��ǰ���̵�
		this.customer=customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCustomerName() {
		return customer.getName(); //���� �̸� ������ customer�� �����ϴϱ�
	}
	public double getAmountAfterDiscount() {
		return amount-(amount*customer.getDiscount())/100; 
		//�ܰ� - ������ �����ͼ� ���� = ���� ���� �����ݾ�
		
	}
}
public class CustomerEx {

	public static void main(String[] args) {
		// �������Ҿ��� ���εȱݾ�
		// getAmountAfterDiscount() = ���� ���ι��� �ݾ�
		
//		Customer c = new Customer(1, "conan", 10);
//		Invoice i = new Invoice(111, c ,30000);
//		System.out.println(i.getAmountAfterDiscount());
//		System.out.println(i.getCustomerName());
		
		//�κ��̽� �迭�� ����������� customer�� �ʿ�..?
		
		Scanner scan = new Scanner(System.in);
		
		Invoice[] iArr= new Invoice[3];
		
		for(int i =0; i<iArr.length; i++) {//����, ������ = customer , ��ǰ���̵�, �Ѿ� =invoice 
			System.out.println("��ǰ���̵�, ����, ������, �Ѿ� ������� �Է��ϼ��� >>");
			iArr[i]= new Invoice(scan.nextInt(), //��ǰ���̵� �Է¹���
					new Customer(i+1,scan.next(),scan.nextInt()), //����� invoice�� �ʵ忡
					//���� �����̶� invoice �ʵ忡 customer�� �ֱ⶧���� customer�� �迭 �ȿ�
					//������ �ְ� �� �Ŀ� customer�������� ���Ŀ� ���缭 �� ĭ �� �־��ش�( i+1, scan,scan)
					scan.nextDouble()); // �Ѿ��� �Է¹���
			//�迭�� �����ϴ� ��........
		}
		for(int i=0; i<iArr.length; i++) {
			System.out.printf("%s�Բ��� %d�� �����ϰ� �Ѿ� %.1f������ %d%% ���ι޾� ���� ���Ҿ���"
					+ " %.1f����\n", 
					iArr[i].getCustomerName(),
					iArr[i].getId(),
					iArr[i].getAmount(),
					iArr[i].getCustomer().getDiscount(), //discount�� invoice�� ���⶧����
					//customer�� ���ؼ� �޾ƿ;���
					iArr[i].getAmountAfterDiscount());
		}
	}

}
