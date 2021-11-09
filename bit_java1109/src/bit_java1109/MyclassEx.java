package bit_java1109;

class MyClass<T>{ //T는 타입인가봄
	T val;
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
}
class Person{
	int age; String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return String.format("이름은 %s, 나이는 %d", name, age);
	}
}
public class MyclassEx {

	public static void main(String[] args) {
		MyClass<String> strMC = new MyClass<String>();
		strMC.set("hello");
		System.out.println(strMC.get());
		
		MyClass<Integer> intMC = new MyClass<Integer>(); //정수형 데이터 객체만 취급
		intMC.set(1);
		System.out.println(intMC.get());
		
		MyClass<Person> pMC = new MyClass<Person>();
		pMC.set(new Person(10, "conan"));
		System.out.println(pMC.get().toString());
	}

}
