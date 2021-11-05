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
		System.out.println(s instanceof Person); //false?????가 왜 아니지??
		//명시적으로 타입 변환 이라는거에 뭔가 있어보인다,.,
		
		//instance of 로 항상 확인하고 캐스팅하는게좋음
	}

}
