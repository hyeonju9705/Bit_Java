package bit_Java1102;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" abcd");
		String b = new String(",efg");
		
		a=a.concat(b); //a�� b�� ���� ->  abcd,efg
		System.out.println(a);
		a= a.trim(); //���� ���ŵ�
		System.out.println(a);
		
		a=a.replace("ab", "12"); // ab�� 12�� �ٲ�
		System.out.println(a); // 12cd,efg
		
		String s[] = a.split(","); // ,�� �߽����� ���ڿ� �и� -> 12cd / efg
		for(int i=0; i<s.length; i++)
			System.out.println("�и��� "+i+"�� ���ڿ�: "+s[i]);
		//�и��� 0�� ���ڿ� 12cd
		//�и��� 1�� ���ڿ� efg
		
		a= a.substring(3); //d,efg �ε��� 3�����ͽ����ϴ� string ��ȯ
		System.out.println(a);
		char c= a.charAt(2); // d,efg���� �ε��� 2��° ���� ���
		System.out.println(c); //e
	}

}
