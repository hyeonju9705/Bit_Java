package bit_Java1102;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a= "java"; // v�� s���� �ڿ�����
		String b = "jasa";
		int res = a.compareTo(b); //a�� �������� b�� ����
		if(res == 0)
			System.out.println("the same");
		else if(res<0)
			System.out.println(a+"<"+b);
		else
			System.out.println(a+">"+b);
	}

}
