package bit_Java1102;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Java";
		String c = "Hello"; // a�� �������ѹ��� (�Ȱ��� ���ڰ� �־ �������ʰ�)
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a==c); // true
		System.out.println(a==d); //false
		System.out.println(a.equals(d)); //true
		
		System.out.println("a".equals("b"));
		System.out.println("a".equals("a"));
		System.out.println("ac".compareTo("aa")); //2 c�� a���� �ڿ�����
		System.out.println("a".compareTo("b")); //-1
		System.out.println("a".compareTo("a")); //0
	}

}
