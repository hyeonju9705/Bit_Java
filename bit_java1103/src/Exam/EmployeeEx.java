package Exam;

import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private int salary;
	
	Employee(int id, String name, int salary){
		this.id=id; 
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary(){
		return 12*salary;
	}
	public int raiseSalary(int percent) {
		return percent*salary/100; 
	}
	public String toString() {
//		return "Employee[id="+id+", name="+name+",salary ="+salary+"]";
		return String.format("Employee[id=%d, name=%s, salary=%d]", 
				id, name, salary);
	}
}
public class EmployeeEx { //�������,,,, private ���ɻ���ϴ°ų�

	public static void main(String[] args) {
		// - : �����̺� + : �ۺ�
		// getter ���� return ���ش�. ��ȯ�� ���缭
		//get annualSalary = ����
		// raiseSalary(���� �λ��) �λ���� ����
		//to String = ���ڿ��� �ٲ�޶�.
		
//		Employee e1 = new Employee(1, "conan", 100000);
//		System.out.println(e1.toString());
		
		Scanner scan = new Scanner(System.in);
		int percent =0;
		
		Employee[] empArr = new Employee[3]; //�̰� �迭��ü�� �����Ѱ���
		Employee emp = new Employee(percent, null, percent); //�����ڵ� �����������
		
		for(int i=0; i<empArr.length; i++) { //�迭�� ��������
//			empArr[i].id= scan.nextInt();
//			empArr[i].name= scan.next();
//			empArr[i].salary= scan.nextInt(); // �̹���� private�� �̿����
			// �׷��Ƿ� �̷��� �����ϸ� ���� �ȵ�!!!!!!!!!!!
			
			empArr[i]= new Employee(scan.nextInt(),scan.next(),
					scan.nextInt()); //�����ڸ� �̿��ؼ� this.id, name, salary��
			//�־��ش�
		}
		
		for(int i=0; i<empArr.length; i++) {
//			percent=percent+10;
			System.out.printf("%s�� ������ %d ���� �λ���� %d\n", 
					empArr[i].toString(), // [] ���� ����� ���
					empArr[i].getAnnualSalary(), //�������
					empArr[i].raiseSalary((i+1)*10)); // percent�� 10�� �ø�������
			//���
			
		}
		
		
	}

}
