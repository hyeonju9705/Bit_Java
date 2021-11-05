package bit_java1103;

class Person{
	public void speak() {
		System.out.println("말하기");
	}
	public void eat() {
		System.out.println("먹기");
	}
	public void walk() {
		System.out.println("걷기");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("공부하기");
	}
}
class StudentWorker extends Student{
	
	public void work() {
		System.out.println("일하기");
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
