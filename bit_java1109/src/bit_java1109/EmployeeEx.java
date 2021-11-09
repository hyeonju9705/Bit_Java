package bit_java1109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Employee{
	public void showName() ; //interface�ȿ� ������ ���� {} �ٵ� ���� �����ݷ����� ������
	public int getPay() ;
	public void showSalaryInfo();
}
abstract class Worker implements Employee{
	protected String name;
	public Worker(String name) {
		this.name = name;
	}
	public void showName() {
		System.out.print(name);
	}
}
class PermanentWorker extends Worker{ //������
	public int salary; //�޿�
	
	public PermanentWorker(String name, int salary) {
		super(name);
		this.name=name;
		this.salary=salary;
	}
	public int getPay() {
		return salary;
	}
	public void showSalaryInfo() {
		System.out.printf("%s�� �޿��� %d��\n",name,getPay());
	}
	
}
class TemporaryWorker extends Worker{ //��������
	public int payPerHour;
	public int workTime;
	public TemporaryWorker(String name, int payPerHour, int workTime) {
		super(name);
		this.payPerHour = payPerHour;
		this.workTime = workTime;
	}
	public int getPay() {
		return payPerHour*workTime;
	}
	public void showSalaryInfo() {
		System.out.printf("%s�� �ٹ��ð��� %d, �ð��� ������ %d��, �޿��� %d��\n",name,workTime,payPerHour, getPay());
	}
}
class SalesWorker extends PermanentWorker{ //������
	public int salesAmount;
	public double bonusRatio;
	public SalesWorker(String name, int salary, int salesAmount, double bonusRatio) {
		super(name, salary);
		this.salesAmount = salesAmount;
		this.bonusRatio = bonusRatio;
	}
	
	public int getPay() { //�ѱ޿�
		return (int) (salary+(salesAmount*(bonusRatio*0.01)));
	}
	public void showSalaryInfo() {
		System.out.printf("%s�� �޿��� %d��, �Ǹŷ��� %d, Ŀ�̼��� %.2f, �ѱ޿��� %d��\n"
				,name,salary,salesAmount,bonusRatio*0.01,getPay());
	}
}
class ManagerService{
	private List<Worker> workers;
	
	public ManagerService() {
		workers = new ArrayList<Worker>();
	}
	public void addWorker(Worker worker) {
		//����� ����Ʈ�� �߰�
		workers.add(worker);
	}
	public void showAllSalaryInfo() {
		//��� ����� ������ �޿� ���
		for(int i=0; i<workers.size(); i++)
			workers.get(i).showSalaryInfo();
		//get(i)�� ������ �ε����� ��ҹ�ȯ ���ִ°���
		//�迭 [i]�� �Ȱ��ٰ� ����Ǽ� �� ��� �迭 i�� �����ִ°���
	}
	public void showSalaryInfo(String name) {
		//Ư�� �̸��� �޿� ���� ���
		for(Worker w : workers) { //workers�� arrayList�ϱ� arrayList�� Worker w�� �־��ִ°�
			if(w.name.equals(name)) //Worker�� name�̶� ���⼭ �Է¹��� name�� ���ٸ�
				w.showSalaryInfo(); //name�� ���� Ŭ������ showSalaryInfo()�޼ҵ尡 ����Ǵ� ����
		}
		
	}
	public void showTotalSalary() {//������� �޿��Ѿ�
		//�޿� �Ѿ� ���
		int result=0;
		for(int i=0; i<workers.size(); i++) //�̰͵� �迭���ư��°Ŷ� �Ȱ��� �����ϸ� ��
			result+=workers.get(i).getPay(); //getPay()�޼ҵ�� �� �ݾ� ���ϴ� �żҵ� �����ϱ�!
		System.out.printf("�� ����� �޿� �Ѿ��� %d����\n",result);
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		// salesWorker�� �޿� �� �ٸ��� ����ϳ���,, ������+@
		// �������̶� ���������̶� ���� ��� �ٸ�
		Scanner scan = new Scanner(System.in);
		
		ManagerService ms=new ManagerService();
		
		BREAK:
		while(true) {
			System.out.println("1.��� �߰� |2.�޿� ��ȸ|3.��� ��� �޿����� ��ȸ|4.�޿� �Ѿ�|5.���α׷� ���� >>");
			System.out.println("�޴��� �����ϼ��� >> ");
			int menu=scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("��� ���¸� �����ϼ��� (1. �Ϲ� ������|2. ���� ������| 3. �Ƹ�����Ʈ) >> ");
				int shape = scan.nextInt();
				switch(shape) {
				case 1:
					System.out.print("�̸�, �޿� ������ �Է��ϼ��� >> ");
					ms.addWorker(new PermanentWorker(scan.next(), scan.nextInt())); //managerService Ŭ������ ����
					//addWorker(Worker worker)�̶�� �� �ִµ�, worker class�� ��û ����Ŭ������ permanentWorker(������) �̶����
					//salesWorker, temporaryWorker������ �� ����ϴ� �ֶ� ����� �� �ִܸ���
					//�׷��� addWorker(Worker worker)�ڸ��� worker�ڸ��� new PermanentWorker�̶���� �������� ����Ŭ������ �����ؼ� ����Ұ���
					// �� ������ Ŭ�������� ������ �ʵ忡 �°Բ� �Է¹����� ��!
					break;
				case 2:
					System.out.print("�̸�, �޿�, �Ǹŷ�, Ŀ�̼� ������ �Է��ϼ��� >> "); //������¿� ���� �ٸ��� �Է¹���
					ms.addWorker(new SalesWorker(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextDouble()));
					break; //class�� �°� �� new SalesWorker�������
				case 3:
					System.out.print("�̸�, �ٹ��ð�, �ð��� ���� ������ �Է��ϼ��� >> ");//������¿� ���� �ٸ��� �Է¹���
					ms.addWorker(new TemporaryWorker(scan.next(), scan.nextInt(), scan.nextInt()));
					break;	
				}
				break;
			case 2:
				System.out.println("��ȸ�� ����� �̸��� �Է��ϼ���>>");
				String namae = scan.next();
				ms.showSalaryInfo(namae); //��ȸ�� ����� �̸��� �Ű������� 
				break;
			case 3:
				ms.showAllSalaryInfo();
				break;
			case 4:
				ms.showTotalSalary();
				break;
			case 5:
				break BREAK;
			}
			
			
		}
	}

}
