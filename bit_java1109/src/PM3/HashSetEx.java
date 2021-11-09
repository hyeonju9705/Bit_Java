package PM3;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person) obj;
			return person.getName().equals(name)&& person.getAge() == age;
		} else
			return false;
	}
	public int hashCode() {
		return name.hashCode()+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("conan",10));
		set.add(new Person("conan",10)); //같은 정보를 중복 저장 시도
		System.out.println("셋에 저장된 데이터 수 : "+set.size());
	}
	
	

}
