package bit_Java1102;

class Person{
	//field
	public int age;
	public String name;
	
	public Person() { // 매개변수가 없는 생성자 -> 기본 생성자 (default constructor)
		
	}
	public Person(String s) { // 생성자 = constructor(오버로딩 가능) 매개변수가 있는 생성자
		name= s;
	}
	
	//method
	public String getName() {
		return name;
	}
}

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스화
		
//		Person aPerson;
//		aPerson = new Person();
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
//		
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		System.out.println("이름, 나이 지정 후");
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
		//-------------------------------------------------------------
		Person anotherPerson; 
		anotherPerson = new Person("rose"); // new 와 함께 생성자 호출, 참조변수가 필요
		// 이름, 나이 지정하지 않음
		System.out.println(anotherPerson.age);
		System.out.println(anotherPerson.name);
		System.out.println(anotherPerson.getName());
		
		anotherPerson.age = 17;
		
		System.out.println("이름, 나이 지정 후");
		System.out.println(anotherPerson.age);
		System.out.println(anotherPerson.name);
		System.out.println(anotherPerson.getName());
	}

}
