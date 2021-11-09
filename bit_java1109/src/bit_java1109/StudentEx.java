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
		
		System.out.println("HashMap의 요소 개수 : "+map.size());
		for(Map.Entry<Integer, Student> m : map.entrySet()) {
			System.out.println(m.getValue().toString()); // m.toString()을 하면 숫자 1,2,3,4도 나오니까
			//그게 싫어서 m.getValue()를 함! 그러면 이제 밸류가 주어가 되니까 여기서 toString()을 하면 student로 가는것
		}
	}

}
