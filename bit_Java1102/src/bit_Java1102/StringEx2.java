package bit_Java1102;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " abcd def ";
		String b = "\txty\t";
		String c = a.trim(); // �յ� tab, enter, space ���� ���� ����
		String d = b.trim();
		System.out.println(a);
		System.out.println(b);
		System.out.println("trim ���� =-===========");
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("Hello".charAt(0)); //H
		System.out.println("Hello".charAt(4)); // o
		System.out.println("Hello".indexOf('1', 3)); // 3��ġ���� ������ '1' Ž�� 
		// ������ �ε��� ����, ������ -1����
		
		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
	}

}
