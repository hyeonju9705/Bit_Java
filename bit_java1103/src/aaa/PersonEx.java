package aaa;

class Person{
	String name = "���";
	void showInfo() {
		System.out.println("���� "+name);
	}
}
class Student extends Person{
	String major = "��ǻ��";
	void work() {
		System.out.println(major+"�� �����Ѵ�. ");
	}
}
public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p1 = s; //�ڵ� ����ȯ(up ĳ����) : ������ �����ϳ� �ڽ��� �޼ҵ峪 �ʵ�� ���Ұ�
		Person p2 = new Student(); //���ɽ���
		Student s1 = (Student)p1;
		s1.name="�ڽ���";
		s1.major="����";
		
		p1.name = "�����";
//		p1.major = "����";
		s.major = "ȭ��";
		
		//���� ����ȯ (downĳ����) �� �����Ѱ� �ƴ�.
		// - upcasting �� ���� �ٽ� ������� �ǵ����� ��
	}

}
