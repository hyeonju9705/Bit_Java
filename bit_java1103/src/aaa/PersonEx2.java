package aaa;

public class PersonEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); //p1 = person
		Student s2 = new Student(); // s2 = student
		Person p2 =s2; //p2 = student
		Student s = (Student)p2; // s=student
		System.out.println(p1 instanceof Student); //false
		System.out.println(s2 instanceof Student); //o
		System.out.println(p2 instanceof Student); // o
		System.out.println(s instanceof Student); //o
		System.out.println(s instanceof Person); //false?????�� �� �ƴ���??
		//��������� Ÿ�� ��ȯ �̶�°ſ� ���� �־�δ�,.,
		
		//instance of �� �׻� Ȯ���ϰ� ĳ�����ϴ°�����
	}

}
