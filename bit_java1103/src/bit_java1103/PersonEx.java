package bit_java1103;

class Person{
	public void speak() {
		System.out.println("���ϱ�");
	}
	public void eat() {
		System.out.println("�Ա�");
	}
	public void walk() {
		System.out.println("�ȱ�");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("�����ϱ�");
	}
}
class StudentWorker extends Student{
	
	public void work() {
		System.out.println("���ϱ�");
	}
}
class Researcher{
	
}
class Professor{
	
}
public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		
		StudentWorker sw = new StudentWorker();
		sw.work();
		sw.study();
		sw.eat();
	}

}
