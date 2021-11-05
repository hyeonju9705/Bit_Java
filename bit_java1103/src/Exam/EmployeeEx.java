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
public class EmployeeEx { //개어려워,,,, private 어케사용하는거노

	public static void main(String[] args) {
		// - : 프라이빗 + : 퍼블릭
		// getter 에는 return 해준다. 반환형 맞춰서
		//get annualSalary = 연봉
		// raiseSalary(월급 인상률) 인상률만 뤼턴
		//to String = 문자열로 바꿔달라.
		
//		Employee e1 = new Employee(1, "conan", 100000);
//		System.out.println(e1.toString());
		
		Scanner scan = new Scanner(System.in);
		int percent =0;
		
		Employee[] empArr = new Employee[3]; //이건 배열객체만 선언한거임
		Employee emp = new Employee(percent, null, percent); //생성자도 선언해줘야함
		
		for(int i=0; i<empArr.length; i++) { //배열에 저장해줌
//			empArr[i].id= scan.nextInt();
//			empArr[i].name= scan.next();
//			empArr[i].salary= scan.nextInt(); // 이방법은 private라 이용못함
			// 그러므로 이렇게 접근하면 절대 안됨!!!!!!!!!!!
			
			empArr[i]= new Employee(scan.nextInt(),scan.next(),
					scan.nextInt()); //생성자를 이용해서 this.id, name, salary에
			//넣어준다
		}
		
		for(int i=0; i<empArr.length; i++) {
//			percent=percent+10;
			System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n", 
					empArr[i].toString(), // [] 위에 만든거 출력
					empArr[i].getAnnualSalary(), //연봉출력
					empArr[i].raiseSalary((i+1)*10)); // percent를 10씩 올리기위해
			//사용
			
		}
		
		
	}

}
