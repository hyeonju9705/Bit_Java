package bit_java1101;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i%2==1)
				continue;
			else
				sum+=i;
		}
		System.out.println("1���� 100���� ¦���� ����"+sum);
	}

}
