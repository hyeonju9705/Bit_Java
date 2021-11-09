package bit_java1109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Employee{
	public void showName() ; //interface안에 있으면 전부 {} 바디 없이 세미콜론으로 끝내기
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
class PermanentWorker extends Worker{ //정직원
	public int salary; //급여
	
	public PermanentWorker(String name, int salary) {
		super(name);
		this.name=name;
		this.salary=salary;
	}
	public int getPay() {
		return salary;
	}
	public void showSalaryInfo() {
		System.out.printf("%s의 급여는 %d원\n",name,getPay());
	}
	
}
class TemporaryWorker extends Worker{ //비정규직
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
		System.out.printf("%s의 근무시간은 %d, 시간당 수당은 %d원, 급여는 %d원\n",name,workTime,payPerHour, getPay());
	}
}
class SalesWorker extends PermanentWorker{ //영업직
	public int salesAmount;
	public double bonusRatio;
	public SalesWorker(String name, int salary, int salesAmount, double bonusRatio) {
		super(name, salary);
		this.salesAmount = salesAmount;
		this.bonusRatio = bonusRatio;
	}
	
	public int getPay() { //총급여
		return (int) (salary+(salesAmount*(bonusRatio*0.01)));
	}
	public void showSalaryInfo() {
		System.out.printf("%s의 급여는 %d원, 판매량은 %d, 커미션은 %.2f, 총급여는 %d원\n"
				,name,salary,salesAmount,bonusRatio*0.01,getPay());
	}
}
class ManagerService{
	private List<Worker> workers;
	
	public ManagerService() {
		workers = new ArrayList<Worker>();
	}
	public void addWorker(Worker worker) {
		//사원을 리스트에 추가
		workers.add(worker);
	}
	public void showAllSalaryInfo() {
		//모든 사원의 정보와 급여 출력
		for(int i=0; i<workers.size(); i++)
			workers.get(i).showSalaryInfo();
		//get(i)는 지정된 인덱스의 요소반환 해주는것임
		//배열 [i]랑 똑같다고 보면되서 걍 모든 배열 i로 돌려주는거임
	}
	public void showSalaryInfo(String name) {
		//특정 이름의 급여 정보 출력
		for(Worker w : workers) { //workers가 arrayList니까 arrayList인 Worker w에 넣어주는것
			if(w.name.equals(name)) //Worker의 name이랑 여기서 입력받은 name이 같다면
				w.showSalaryInfo(); //name이 같은 클래스의 showSalaryInfo()메소드가 실행되는 것임
		}
		
	}
	public void showTotalSalary() {//전사원의 급여총액
		//급여 총액 출력
		int result=0;
		for(int i=0; i<workers.size(); i++) //이것도 배열돌아가는거랑 똑같이 생각하면 됨
			result+=workers.get(i).getPay(); //getPay()메소드는 총 금액 구하는 매소드 였으니까!
		System.out.printf("전 사원의 급여 총액은 %d원임\n",result);
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		// salesWorker은 급여 좀 다르게 출력하나봐,, 정규직+@
		// 정규직이랑 비정규직이랑 월급 출력 다름
		Scanner scan = new Scanner(System.in);
		
		ManagerService ms=new ManagerService();
		
		BREAK:
		while(true) {
			System.out.println("1.사원 추가 |2.급여 조회|3.모든 사원 급여정보 조회|4.급여 총액|5.프로그램 종료 >>");
			System.out.println("메뉴를 선택하세요 >> ");
			int menu=scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("고용 형태를 선택하세요 (1. 일반 정규직|2. 영업 정규직| 3. 아르바이트) >> ");
				int shape = scan.nextInt();
				switch(shape) {
				case 1:
					System.out.print("이름, 급여 순으로 입력하세요 >> ");
					ms.addWorker(new PermanentWorker(scan.next(), scan.nextInt())); //managerService 클래스에 보면
					//addWorker(Worker worker)이라는 게 있는데, worker class가 엄청 상위클래스라서 permanentWorker(정규직) 이라던지
					//salesWorker, temporaryWorker같은거 다 상속하는 애라 써먹을 수 있단말야
					//그래서 addWorker(Worker worker)자리에 worker자리에 new PermanentWorker이라던지 여러가지 하위클래스를 생성해서 사용할것임
					// 그 각자의 클래스에서 생성자 필드에 맞게끔 입력받으면 됨!
					break;
				case 2:
					System.out.print("이름, 급여, 판매량, 커미션 순으로 입력하세요 >> "); //고용형태에 따라 다르게 입력받음
					ms.addWorker(new SalesWorker(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextDouble()));
					break; //class에 맞게 또 new SalesWorker만들어줌
				case 3:
					System.out.print("이름, 근무시간, 시간당 수당 순으로 입력하세요 >> ");//고용형태에 따라 다르게 입력받음
					ms.addWorker(new TemporaryWorker(scan.next(), scan.nextInt(), scan.nextInt()));
					break;	
				}
				break;
			case 2:
				System.out.println("조회할 사원의 이름을 입력하세요>>");
				String namae = scan.next();
				ms.showSalaryInfo(namae); //조회할 사원의 이름을 매개변수로 
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
