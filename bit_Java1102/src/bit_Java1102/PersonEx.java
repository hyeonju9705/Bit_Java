package bit_Java1102;

class Person{
	//field
	public int age;
	public String name;
	
	public Person() { // �Ű������� ���� ������ -> �⺻ ������ (default constructor)
		
	}
	public Person(String s) { // ������ = constructor(�����ε� ����) �Ű������� �ִ� ������
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
		//�ν��Ͻ�ȭ
		
//		Person aPerson;
//		aPerson = new Person();
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
//		
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		System.out.println("�̸�, ���� ���� ��");
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
		//-------------------------------------------------------------
		Person anotherPerson; 
		anotherPerson = new Person("rose"); // new �� �Բ� ������ ȣ��, ���������� �ʿ�
		// �̸�, ���� �������� ����
		System.out.println(anotherPerson.age);
		System.out.println(anotherPerson.name);
		System.out.println(anotherPerson.getName());
		
		anotherPerson.age = 17;
		
		System.out.println("�̸�, ���� ���� ��");
		System.out.println(anotherPerson.age);
		System.out.println(anotherPerson.name);
		System.out.println(anotherPerson.getName());
	}

}
