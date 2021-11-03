package bit_Java1102;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Java";
		String c = "Hello"; // a를 참조시켜버림 (똑같은 문자가 있어서 만들지않고)
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a==c); // true
		System.out.println(a==d); //false
		System.out.println(a.equals(d)); //true
		
		System.out.println("a".equals("b"));
		System.out.println("a".equals("a"));
		System.out.println("ac".compareTo("aa")); //2 c가 a보다 뒤에있음
		System.out.println("a".compareTo("b")); //-1
		System.out.println("a".compareTo("a")); //0
	}

}
