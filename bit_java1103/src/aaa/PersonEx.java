package aaa;

class Person{
	String name = "사람";
	void showInfo() {
		System.out.println("나는 "+name);
	}
}
class Student extends Person{
	String major = "컴퓨터";
	void work() {
		System.out.println(major+"를 공부한다. ");
	}
}
public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p1 = s; //자동 형변환(up 캐스팅) : 참조는 가능하나 자식의 메소드나 필드는 사용불가
		Person p2 = new Student(); //업케스팅
		Student s1 = (Student)p1;
		s1.name="자식임";
		s1.major="수학";
		
		p1.name = "새사람";
//		p1.major = "수학";
		s.major = "화학";
		
		//강제 형변환 (down캐스팅) 늘 가능한게 아님.
		// - upcasting 된 것을 다시 원래대로 되돌리는 것
	}

}
