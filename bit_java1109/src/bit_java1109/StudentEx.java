package bit_java1109;

import java.util.HashMap;
import java.util.Map;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + " : " + score ;
	}
	
	
}
public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1,new Student("kid",55));
		map.put(2,new Student("conan",30));
		map.put(3,new Student("rose",100));
		map.put(4,new Student("ran",90));
		
		System.out.println("HashMap�� ��� ���� : "+map.size());
		for(Map.Entry<Integer, Student> m : map.entrySet()) {
			System.out.println(m.getValue().toString()); // m.toString()�� �ϸ� ���� 1,2,3,4�� �����ϱ�
			//�װ� �Ⱦ m.getValue()�� ��! �׷��� ���� ����� �־ �Ǵϱ� ���⼭ toString()�� �ϸ� student�� ���°�
		}
	}

}
