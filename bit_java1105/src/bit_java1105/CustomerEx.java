package bit_java1105;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Customer{
	private String name;
	private boolean member = false; //회원이냐 아니냐
	private String memberType; //회원이면 회원등급

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
				isMember(),getMemberType()); //클래스 정보를 문자열로 반환
	}
}

class Visit{
	private Customer customer;
	private Calendar calendar;
	private double serviceExpense; //난수 1000-20000
	private double productExpense; //난수 1000-20000

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
	public double getTotalExpense() { //물건비용+서비스비용 (?)
		double result=getProductExpense()*(1.0-DiscountRate.getProductDiscountRate(customer.getMemberType()))
				//상품 할인금액 + 서비스 할인금액 더함
				+getServiceExpense()*(1.0-DiscountRate.getServiceDiscountRate(customer.getMemberType()));
		return result;
	}
	public String toString() {
		setProductExpense((Math.random()*20000)+1000); //가격을 난수발생해서 set 해줄것
		setServiceExpense((Math.random()*20000)+1000); //서비스 금액을 난수발생해서 set 해줌
		return String.format("%s님이 %.0f원의 제품을 구매하고 %.0f원의 서비스를 제공받았음\n"
				+ "Visit[", 
				getName(),
				getProductExpense(), //방금 set시킨 금액을 가져옴
				getServiceExpense()); //방금 set 시킨 서비스금액을 가져옴
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
		} catch(NullPointerException e) { //try catch문 써준 이유 : isMember가 false인 애들은
			//memberType이 null값이기 때문에 nullPointerException이 일어날 수 잇어서 써줌 (실제로일어남)
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
		} catch(NullPointerException e) {//try catch문 써준 이유 : isMember가 false인 애들은
			//memberType이 null값이기 때문에 nullPointerException이 일어날 수 잇어서 써줌 (실제로일어남)
			return 0;
		}
	}
}
public class CustomerEx {

	public static void main(String[] args) {
		// 밑줄 = static
		//서비스 ㅈㅔ공비+제품구매비 를 할인 해준게 지불금액
		//난수 1000~20000 서비스비용
		
		//선생님은 회원여부를 저장할 수 있는 flag라던지, 회원에따라 다른 orgServiceExpense orgProductExpense라는 
		//변수를 만드셨군

		//회원일 경우에만 등급을 입력받기 때문에 주의해야함
		Scanner scan= new Scanner(System.in);

		Customer cArr[] = new Customer[5]; //배열 선언



		for(int i=0; i<cArr.length; i++) {
			System.out.println("고객의 이름, 회원여부, 등급을 입력하세요>>");
			cArr[i]= new Customer(scan.next()); //입력받을 건데 이름밖에 못입력받기때문에
			cArr[i].setMember(scan.nextBoolean()); //아예 이런식으로 입력받음 (못입력받는 부분에 대해서는)
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
								+ ", 제품비용 =%.1f, 서비스비용=%.1f, 총 사용 비용 %.1f원]\n", 
								visit.getProductExpense(), visit.getServiceExpense(), visit.getTotalExpense());
		}

		//customer출력되는곳... " Date=%s, 제품비용 =%.1f, 서비스비용=%.1f, 총 사용 비용 %.1f원]"
		//getName(),customer.isMember(),
		//customer.getMemberType(),


	}
}


