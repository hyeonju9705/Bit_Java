package bit_Java1102;


public class PersonEx2 {

	public static void main(String[] args) {
		// �ν��Ͻ�ȭ
//		Person aPerson;
//		aPerson= new Person(); //new�� �Բ������� ȣ��, ���� ������ �ʿ�
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		
		Person[] pa;
		pa = new Person[3];
		
		pa[0] = new Person(); //Person ��ü ���� => new �� �Բ� ������ ȣ��
		pa[1] = new Person();
		pa[2] = new Person();
		
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		
		pa[0].age = 10;
		pa[0].name = "conan";
		
		System.out.println("�̸� ���� ���� �� ");
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
	}

}
