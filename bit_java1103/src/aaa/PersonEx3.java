package aaa;

class Person3{
	
}
class Student3 extends Person3{
	public static void method(Person3 p) {
		Student3 s = (Student3)p;
		System.out.println("downcasting ����");
	}
}
public class PersonEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p1 = new Person3(); //p1 = person
		Person3 p2 = new Student3(); //p2 = student
		//Student3.method(p1); //classCastException �߻� ���ذ��ȵ�
		Student3.method(p2); //���ذ��ȵȴ�....����?
	}

}
