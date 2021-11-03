package bit_Java1102;


public class PersonEx2 {

	public static void main(String[] args) {
		// 인스턴스화
//		Person aPerson;
//		aPerson= new Person(); //new와 함께생성자 호출, 참조 변수가 필요
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		
		Person[] pa;
		pa = new Person[3];
		
		pa[0] = new Person(); //Person 객체 생성 => new 와 함께 생성자 호출
		pa[1] = new Person();
		pa[2] = new Person();
		
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		
		pa[0].age = 10;
		pa[0].name = "conan";
		
		System.out.println("이름 나이 설정 후 ");
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
	}

}
