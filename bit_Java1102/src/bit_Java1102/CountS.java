package bit_Java1102;

public class CountS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String a = "class";
		for(int i=0; i<a.length(); i++) { //length�� 5��ŭ 5�� ���ư�
			if(a.charAt(i)=='s') //�ε��� i�� s�������� count�Ѵ�.
				count++; 
		}
		System.out.println(count);
	}

}
