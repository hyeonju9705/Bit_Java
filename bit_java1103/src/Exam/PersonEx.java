package Exam;

class Person{
	private String name;
	private String addr;
	
	public Person() {
		
	}
	public Person(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String toString() {
		return String.format("Person[name=%s, address=%s]", 
				getName(), getAddr());
	}
}

class Student extends Person{
	private String program;
	private int year; //�г�
	private double fee;
	
	public Student(String name, String addr, String program, 
			int year, double fee) {
//		this.name=name;
//		this.addr = addr;
		super(name,addr);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program=program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String toString() {
		
		return String.format("Student[%s, program=%s, year=%d, fee=%.1f]", 
				super.toString(),getProgram(),getYear(), getFee());
	}
}

class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String addr,String school, double pay) {
		super(name,addr);
		this.school=school;
		this.pay =pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public Double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public String toString() {
		return String.format("Staff[%s, school=%s pay=%.1f", super.toString(),
				getSchool(), getPay());
	}
}

public class PersonEx {

	public static void main(String[] args) {
		// �ڽ��� �θ� ��ӹ޵��� ����
		// sutdent �� staff�� ���� �������
		Person person = new Person("�ڳ�","�̶��̳�");
		System.out.println(person.toString());
		Student student = new Student("���","���� �ڻ�Դ�","�������",1,25000.0);
		System.out.println(student.toString());
		Student student2 = new Student("�̶�","�̶��̳�","�±ǵ�",3,3000.0);
		System.out.println(student2.toString());
		Staff staff = new Staff("������","�̶��̳�","û�ִ���",20.0);
		System.out.println(staff.toString());
		
		
	}

}
