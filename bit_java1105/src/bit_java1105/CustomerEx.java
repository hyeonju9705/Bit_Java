package bit_java1105;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Customer{
	private String name;
	private boolean member = false; //ȸ���̳� �ƴϳ�
	private String memberType; //ȸ���̸� ȸ�����

	public Customer(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member=member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType=memberType;
	}
	public String toString() {
		return String.format("[Customer=Customer[name=%s, member=%s, memberType=%s,", getName(),
				isMember(),getMemberType()); //Ŭ���� ������ ���ڿ��� ��ȯ
	}
}

class Visit{
	private Customer customer;
	private Calendar calendar;
	private double serviceExpense; //���� 1000-20000
	private double productExpense; //���� 1000-20000

	public Visit(Customer customer, Calendar calendar) {
		this.customer=customer;
		this.calendar=calendar;
	}
	public String getName() {
		return customer.getName();
	}
	public double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense=serviceExpense;
	}
	public double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense=productExpense;
	}
	public double getTotalExpense() { //���Ǻ��+���񽺺�� (?)
		double result=getProductExpense()*(1.0-DiscountRate.getProductDiscountRate(customer.getMemberType()))
				//��ǰ ���αݾ� + ���� ���αݾ� ����
				+getServiceExpense()*(1.0-DiscountRate.getServiceDiscountRate(customer.getMemberType()));
		return result;
	}
	public String toString() {
		setProductExpense((Math.random()*20000)+1000); //������ �����߻��ؼ� set ���ٰ�
		setServiceExpense((Math.random()*20000)+1000); //���� �ݾ��� �����߻��ؼ� set ����
		return String.format("%s���� %.0f���� ��ǰ�� �����ϰ� %.0f���� ���񽺸� �����޾���\n"
				+ "Visit[", 
				getName(),
				getProductExpense(), //��� set��Ų �ݾ��� ������
				getServiceExpense()); //��� set ��Ų ���񽺱ݾ��� ������
	}
}
class DiscountRate{
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String memberType) {
		try {
		if("Premium".equals(memberType))
			return 0.2;
		else if("Gold".equals(memberType))
			return 0.15;
		else if("Silver".equals(memberType))
			return 0.1;
		else
			return 0;
		} catch(NullPointerException e) { //try catch�� ���� ���� : isMember�� false�� �ֵ���
			//memberType�� null���̱� ������ nullPointerException�� �Ͼ �� �վ ���� (�������Ͼ)
			return 0;
		}
	}
	
	public static double getProductDiscountRate(String memberType) {
		try {
		if("Premium".equals(memberType))
			return 0.1;
		else if("Gold".equals(memberType))
			return 0.1;
		else if("Silver".equals(memberType))
			return 0.1;
		else
			return 0;
		} catch(NullPointerException e) {//try catch�� ���� ���� : isMember�� false�� �ֵ���
			//memberType�� null���̱� ������ nullPointerException�� �Ͼ �� �վ ���� (�������Ͼ)
			return 0;
		}
	}
}
public class CustomerEx {

	public static void main(String[] args) {
		// ���� = static
		//���� ���İ���+��ǰ���ź� �� ���� ���ذ� ���ұݾ�
		//���� 1000~20000 ���񽺺��
		
		//�������� ȸ�����θ� ������ �� �ִ� flag�����, ȸ�������� �ٸ� orgServiceExpense orgProductExpense��� 
		//������ ����̱�

		//ȸ���� ��쿡�� ����� �Է¹ޱ� ������ �����ؾ���
		Scanner scan= new Scanner(System.in);

		Customer cArr[] = new Customer[5]; //�迭 ����



		for(int i=0; i<cArr.length; i++) {
			System.out.println("���� �̸�, ȸ������, ����� �Է��ϼ���>>");
			cArr[i]= new Customer(scan.next()); //�Է¹��� �ǵ� �̸��ۿ� ���Է¹ޱ⶧����
			cArr[i].setMember(scan.nextBoolean()); //�ƿ� �̷������� �Է¹��� (���Է¹޴� �κп� ���ؼ���)
			if(cArr[i].isMember()==true)
				cArr[i].setMemberType(scan.next());
			else
				cArr[i].setMemberType(null);
		}
		for(int i=0; i<cArr.length; i++) {
			Calendar firstDate = Calendar.getInstance();
			firstDate.clear();
			firstDate.set(2021, 11,(int)(Math.random()*30)+1);
			SimpleDateFormat format1;
			format1 = new SimpleDateFormat("yyyy/MM/dd");

			Visit visit = new Visit(cArr[i],firstDate);
			System.out.print(visit.toString());
			System.out.print(cArr[i].toString());
						System.out.printf(" Date = "+format1.format(firstDate.getTime())
								+ ", ��ǰ��� =%.1f, ���񽺺��=%.1f, �� ��� ��� %.1f��]\n", 
								visit.getProductExpense(), visit.getServiceExpense(), visit.getTotalExpense());
		}

		//customer��µǴ°�... " Date=%s, ��ǰ��� =%.1f, ���񽺺��=%.1f, �� ��� ��� %.1f��]"
		//getName(),customer.isMember(),
		//customer.getMemberType(),


	}
}


